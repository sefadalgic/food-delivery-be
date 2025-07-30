package com.sefadalgic.fooddelivery.app.modules.category.service

import com.sefadalgic.fooddelivery.app.modules.category.Category
import com.sefadalgic.fooddelivery.app.modules.category.CategoryRepository
import org.springframework.stereotype.Service


@Service("categoryService")
class CategoryServiceImpl(private val categoryRepository: CategoryRepository) : CategoryService {
    override fun getCategories(): List<Category> {
        return categoryRepository.findAll()
    }
}