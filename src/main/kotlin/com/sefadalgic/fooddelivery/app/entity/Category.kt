package com.sefadalgic.fooddelivery.app.entity

import com.fasterxml.jackson.annotation.JsonIgnore
import jakarta.persistence.Column
import jakarta.persistence.Entity
import jakarta.persistence.GeneratedValue
import jakarta.persistence.GenerationType
import jakarta.persistence.Id
import jakarta.persistence.ManyToMany
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
    val isActive : Boolean,

    @ManyToMany(mappedBy = "categories")
    @JsonIgnore
    val restaurants: List<Restaurant> = mutableListOf()
)
