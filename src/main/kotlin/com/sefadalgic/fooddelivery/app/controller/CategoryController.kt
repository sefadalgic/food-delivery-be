package com.sefadalgic.fooddelivery.app.controller

import com.sefadalgic.fooddelivery.app.entity.ApiResponse
import com.sefadalgic.fooddelivery.app.entity.Category
import com.sefadalgic.fooddelivery.app.entity.Restaurant
import com.sefadalgic.fooddelivery.app.service.category.CategoryService
import org.apache.catalina.connector.Response
import org.springframework.beans.factory.annotation.Qualifier
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.CrossOrigin
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@CrossOrigin
@RestController
@RequestMapping("/category")
class CategoryController(@Qualifier("categoryService") private  val categoryService: CategoryService) {

    @GetMapping("/")
    fun getAllCategories(): ApiResponse<List<Category>> {
        val categories = categoryService.getCategories()
        return ApiResponse(
            message = "Categories fetched successfully",
            data = categories,
            success = true
        )
    }


    @GetMapping("/{id}")
    fun getCategoryDetail(@PathVariable id: Int): ResponseEntity<ApiResponse<Category>> {
        val category = categoryService.getCategoryDetail(id)

        return if (category == null) {
            ResponseEntity.status(HttpStatus.NOT_FOUND).body(
                ApiResponse(
                    message = "Category not found !",
                    success = false,
                    data = null
                )
            )
        } else {
            ResponseEntity.ok(
                ApiResponse(
                    message = "Category found",
                    success = true,
                    data = category
                )
            )
        }
    }
}