package com.sefadalgic.fooddelivery.app.controller

import com.sefadalgic.fooddelivery.app.service.image.ImageServiceImpl
import org.springframework.beans.factory.annotation.Qualifier
import org.springframework.http.MediaType
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/images")
class ImgController(private val imageService: ImageServiceImpl) {

    @GetMapping("/{name}", produces = [MediaType.IMAGE_JPEG_VALUE])
    fun getImage(@PathVariable name: String): ByteArray {
        return imageService.getImage(name).readBytes()
    }
}