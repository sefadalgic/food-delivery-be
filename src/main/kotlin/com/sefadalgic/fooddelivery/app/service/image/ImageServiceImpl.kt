package com.sefadalgic.fooddelivery.app.service.image

import com.sefadalgic.fooddelivery.app.repository.ImageRepository
import org.springframework.stereotype.Service
import java.io.File

@Service("imgService")
class ImageServiceImpl(private val imageRepository: ImageRepository): ImageService {

    private val uploadDir = System.getProperty("user.dir") + "/uploads"

    init {
        val dir = File(uploadDir)
        if (!dir.exists()) {
            dir.mkdirs()
        }
    }


    override fun getImage(name: String): File {
        try {
            val image = imageRepository.findImageByName(name)
            val file = File("${uploadDir}/${image.name}")

            if (!file.exists()) {
                throw RuntimeException("Image file does not exist: ${file.absolutePath}")
            }

            return file

        } catch (e: Exception) {
            throw RuntimeException("Image not found: $name", e)
        }
    }
}