package com.sefadalgic.fooddelivery.app.modules.restaurant.service

import com.sefadalgic.fooddelivery.app.modules.restaurant.Restaurant
import com.sefadalgic.fooddelivery.app.modules.restaurant.RestaurantRepository
import org.springframework.stereotype.Service

@Service("categoryService")
class RestaurantServiceImpl(private val restaurantRepository: RestaurantRepository) : RestaurantService{
    override fun getOpenRestaurants(): List<Restaurant> {
        return restaurantRepository.findAll().filter { restaurant -> restaurant.isActive }
    }
}