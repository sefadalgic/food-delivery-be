package com.sefadalgic.fooddelivery.app.repository

import com.sefadalgic.fooddelivery.app.entity.Category
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.data.jpa.repository.Query

interface CategoryRepository : JpaRepository<Category, Int>