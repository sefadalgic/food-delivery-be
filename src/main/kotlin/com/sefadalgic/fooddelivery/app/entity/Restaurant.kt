package com.sefadalgic.fooddelivery.app.entity

import jakarta.persistence.Column
import jakarta.persistence.Entity
import jakarta.persistence.Table
import jakarta.persistence.Id
import jakarta.persistence.JoinColumn
import jakarta.persistence.JoinTable
import jakarta.persistence.ManyToMany
import java.sql.Time


@Entity
@Table(name = "restaurant", schema = "public")
data class Restaurant(

    @Column
    @Id
    val id: Long? = null,
    val name: String,
    val image: String? = null,
    val description: String? = null,

    @Column(name = "is_active")
    val isActive: Boolean = true,

    val phone: String? = null,

    val mail: String? = null,

    @Column(name = "opening_time")
    val openingTime: Time? = null,

    @Column(name = "closing_time")
    val closingTime: Time? = null,

    val rating: Double? = null,

    @Column(name = "average_order_time")
    val averageOrderTime: Integer? = null,

    @Column(name = "delivery_price")
    val deliveryPrice: Double? = null,

    @ManyToMany
    @JoinTable(
        name = "restaurant_category",
        joinColumns = [JoinColumn(name = "restaurant_id")],
        inverseJoinColumns = [JoinColumn(name = "category_id")]
    )
    val categories: List<Category> = mutableListOf()



)
