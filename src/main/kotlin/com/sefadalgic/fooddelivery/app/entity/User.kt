package com.sefadalgic.fooddelivery.app.entity

import jakarta.persistence.Column
import jakarta.persistence.Entity
import jakarta.persistence.GeneratedValue
import jakarta.persistence.GenerationType
import jakarta.persistence.Id
import jakarta.persistence.Table

@Entity
@Table(name = "user", schema = "public")
data class User(

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id")
    var id: Int = 0,

    @Column(name = "full_name")
    var name: String,


    @Column(name = "mail")
    var mail: String,


    @Column(name = "password")
    var password: String
)
