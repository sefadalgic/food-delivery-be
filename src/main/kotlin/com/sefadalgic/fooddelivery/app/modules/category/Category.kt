package com.sefadalgic.fooddelivery.app.modules.category

import jakarta.persistence.Column
import jakarta.persistence.Entity
import jakarta.persistence.GeneratedValue
import jakarta.persistence.GenerationType
import jakarta.persistence.Id
import jakarta.persistence.Table

@Entity
@Table(name = "category", schema = "public")
data class Category(

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    val id: Int = 0,


    @Column(name = "name")
    val name : String,

    @Column(name = "image")
    val imageUrl: String? = null,


    @Column(name = "description")
    val description: String? = null,

    @Column(name = "is_active")
    val isActive : Boolean


)