package com.sefadalgic.fooddelivery.app.service.restaurant

import com.sefadalgic.fooddelivery.app.entity.Restaurant

interface RestaurantService {
    fun getOpenRestaurants(): List<Restaurant>
}