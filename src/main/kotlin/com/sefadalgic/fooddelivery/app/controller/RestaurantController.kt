package com.sefadalgic.fooddelivery.app.controller


import com.sefadalgic.fooddelivery.app.entity.ApiResponse
import com.sefadalgic.fooddelivery.app.entity.Restaurant
import com.sefadalgic.fooddelivery.app.service.restaurant.RestaurantService
import org.springframework.beans.factory.annotation.Qualifier
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RequestMapping("/restaurant")
@RestController
class RestaurantController(@Qualifier("restaurantService") private val restaurantService: RestaurantService) {

    @GetMapping()
    fun getOpenRestaurants(): ApiResponse<List<Restaurant>> {
        return ApiResponse(
            message = "Open restaurants fetched successfully",
            data = restaurantService.getOpenRestaurants(),
            success = true
        )
    }
}