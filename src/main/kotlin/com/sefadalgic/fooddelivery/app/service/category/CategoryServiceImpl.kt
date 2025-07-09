package com.sefadalgic.fooddelivery.app.service.category

import com.sefadalgic.fooddelivery.app.entity.Category
import com.sefadalgic.fooddelivery.app.repository.CategoryRepository
import org.springframework.stereotype.Service


@Service("categoryService")
class CategoryServiceImpl(private val categoryRepository: CategoryRepository) : CategoryService {
    override fun getCategories(): List<Category> {
        return categoryRepository.findAll()
    }
}