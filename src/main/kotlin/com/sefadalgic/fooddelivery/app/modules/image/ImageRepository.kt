package com.sefadalgic.fooddelivery.app.modules.image

import com.sefadalgic.fooddelivery.app.modules.image.Image
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.data.jpa.repository.Query

interface ImageRepository: JpaRepository<Image, Long> {

    @Query(
        value = "SELECT * FROM image WHERE name = :fileName",
        nativeQuery = true
    )
    fun findImageByName (fileName: String): Image

}