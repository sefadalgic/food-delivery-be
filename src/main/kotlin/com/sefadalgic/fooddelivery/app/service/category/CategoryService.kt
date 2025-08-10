package com.sefadalgic.fooddelivery.app.service.category

import com.sefadalgic.fooddelivery.app.entity.Category
import com.sefadalgic.fooddelivery.app.entity.Restaurant

interface CategoryService {
     fun getCategories(): List<Category>

     fun getCategoryDetail(id: Int): Category?
}