package com.sefadalgic.fooddelivery.app.repository

import com.sefadalgic.fooddelivery.app.entity.Restaurant
import org.springframework.data.jpa.repository.JpaRepository


interface RestaurantRepository : JpaRepository<Restaurant, Int>