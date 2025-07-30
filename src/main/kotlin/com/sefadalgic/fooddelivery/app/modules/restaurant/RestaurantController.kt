package com.sefadalgic.fooddelivery.app.modules.restaurant

import com.sefadalgic.fooddelivery.app.common.entity.ApiResponse
import com.sefadalgic.fooddelivery.app.modules.restaurant.service.RestaurantService
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RequestMapping
@RestController
class RestaurantController(private val restaurantService: RestaurantService) {


    @GetMapping()
    fun getOpenRestaurants(): ApiResponse<List<Restaurant>> {
        return ApiResponse(
            message = "Open restaurants fetched successfully",
            data = restaurantService.getOpenRestaurants(),
            success = true
        )
    }
}