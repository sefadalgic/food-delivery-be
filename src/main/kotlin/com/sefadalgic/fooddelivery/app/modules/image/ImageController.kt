package com.sefadalgic.fooddelivery.app.modules.image

import com.sefadalgic.fooddelivery.app.modules.image.service.ImageServiceImpl
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