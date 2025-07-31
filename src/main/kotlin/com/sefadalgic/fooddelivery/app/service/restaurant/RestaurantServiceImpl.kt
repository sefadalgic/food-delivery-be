package com.sefadalgic.fooddelivery.app.service.restaurant

import com.sefadalgic.fooddelivery.app.entity.Restaurant
import com.sefadalgic.fooddelivery.app.repository.RestaurantRepository

import org.springframework.stereotype.Service

@Service("restaurantService")
class RestaurantServiceImpl(private val restaurantRepository: RestaurantRepository) : RestaurantService{
    override fun getOpenRestaurants(): List<Restaurant> {
        return restaurantRepository.findAll().filter { restaurant -> restaurant.isActive }
    }
}