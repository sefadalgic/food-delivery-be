package com.sefadalgic.fooddelivery.app.modules.category.service

import com.sefadalgic.fooddelivery.app.modules.category.Category

interface CategoryService {
     fun getCategories(): List<Category>
}