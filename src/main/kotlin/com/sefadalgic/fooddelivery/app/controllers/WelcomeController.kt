package com.sefadalgic.fooddelivery.app.controllers

import lombok.AllArgsConstructor
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController


@AllArgsConstructor
@RestController
@RequestMapping(path = ["/"])
class WelcomeController {

    @GetMapping()
    fun welcome () : String{
        return  "Welcome the food delivery app !"
    }
}