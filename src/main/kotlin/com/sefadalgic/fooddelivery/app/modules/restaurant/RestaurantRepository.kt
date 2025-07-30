package com.sefadalgic.fooddelivery.app.modules.restaurant

import org.springframework.data.jpa.repository.JpaRepository


interface RestaurantRepository : JpaRepository<Restaurant, Int>