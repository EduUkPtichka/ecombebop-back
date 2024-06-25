package com.determent.ecombebop.service_product.dep.repository

import com.determent.ecombebop.service_product.dep.entity.User
import reactor.core.publisher.Mono

interface UserRepository {

    suspend fun findById(id: Long): User?

    suspend fun save(user: User)
}