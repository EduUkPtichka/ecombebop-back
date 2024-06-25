package com.determent.ecombebop.service_product.entity

import org.springframework.data.annotation.Id
import org.springframework.data.relational.core.mapping.Column
import org.springframework.data.relational.core.mapping.Table

@Table("product_item")
data class ProductItem(
    @Id
    val id: Int?,
    @Column("main_image")
    val mainImage: String,
    val title: String,
)
