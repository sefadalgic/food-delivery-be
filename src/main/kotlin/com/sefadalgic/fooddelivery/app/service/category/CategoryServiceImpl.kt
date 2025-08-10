package com.sefadalgic.fooddelivery.app.service.category

import com.sefadalgic.fooddelivery.app.entity.Category
import com.sefadalgic.fooddelivery.app.entity.Restaurant
import com.sefadalgic.fooddelivery.app.repository.CategoryRepository
import org.springframework.stereotype.Service


@Service("categoryService")
class CategoryServiceImpl(private val categoryRepository: CategoryRepository) : CategoryService {
    override fun getCategories(): List<Category> {
        return categoryRepository.findAll()
    }

    override fun getCategoryDetail(id: Int): Category? {
        return  categoryRepository.findById(id).orElse(null)
    }
}