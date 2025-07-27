package com.sefadalgic.fooddelivery.app.repository

import com.sefadalgic.fooddelivery.app.entity.Image
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.data.jpa.repository.Query

interface ImageRepository: JpaRepository<Image, Long>{

    @Query(
        value = "SELECT * FROM image WHERE name = :fileName",
        nativeQuery = true
    )
    fun findImageByName (fileName: String):Image

}