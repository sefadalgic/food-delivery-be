package com.sefadalgic.fooddelivery.app.service.category

import com.sefadalgic.fooddelivery.app.entity.Category

interface CategoryService {
     fun getCategories(): List<Category>
}