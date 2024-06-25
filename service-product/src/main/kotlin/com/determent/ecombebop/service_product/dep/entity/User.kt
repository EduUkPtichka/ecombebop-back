package com.determent.ecombebop.service_product.dep.entity

import org.springframework.data.annotation.Id
import org.springframework.data.relational.core.mapping.Column
import org.springframework.data.relational.core.mapping.Table

@Table("users")
data class User(
    @Id val id: Long? = null,
    @Column("username") val username: String,
    @Column("email") val email: String,
)