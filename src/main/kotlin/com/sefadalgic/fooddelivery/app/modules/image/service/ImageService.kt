package com.sefadalgic.fooddelivery.app.modules.image.service
import org.springframework.stereotype.Service
import java.io.File


@Service
interface ImageService {

    fun getImage(name: String) : File
}