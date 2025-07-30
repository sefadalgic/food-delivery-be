package com.sefadalgic.fooddelivery.app.modules.restaurant.service

import com.sefadalgic.fooddelivery.app.modules.restaurant.Restaurant

interface RestaurantService {
    fun getOpenRestaurants(): List<Restaurant>
}