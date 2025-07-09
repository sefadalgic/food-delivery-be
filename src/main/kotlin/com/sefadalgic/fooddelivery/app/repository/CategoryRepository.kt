package com.sefadalgic.fooddelivery.app.repository

import com.sefadalgic.fooddelivery.app.entity.Category
import org.springframework.data.jpa.repository.JpaRepository

interface CategoryRepository : JpaRepository<Category, Int>