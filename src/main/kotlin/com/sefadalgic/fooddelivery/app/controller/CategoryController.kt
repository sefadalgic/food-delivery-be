package com.sefadalgic.fooddelivery.app.controller

import com.sefadalgic.fooddelivery.app.entity.ApiResponse
import com.sefadalgic.fooddelivery.app.entity.Category
import com.sefadalgic.fooddelivery.app.service.category.CategoryService
import org.springframework.beans.factory.annotation.Qualifier
import org.springframework.web.bind.annotation.CrossOrigin
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@CrossOrigin
@RestController
@RequestMapping("/category")
class CategoryController(@Qualifier("categoryService") private val categoryService: CategoryService) {

    @GetMapping("/")
    fun getAllCategories(): ApiResponse<List<Category>> {
        val categories = categoryService.getCategories()
        return ApiResponse(
            message = "Categories fetched successfully",
            data = categories
        )
    }
}