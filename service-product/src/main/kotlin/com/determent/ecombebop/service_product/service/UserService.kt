package com.determent.ecombebop.service_product.service

import com.determent.ecombebop.service_product.entity.User
import com.determent.ecombebop.service_product.repository.UserRepository
import org.springframework.stereotype.Service

@Service
class UserService(val repository: UserRepository) {
    suspend fun findUserById(id: Long): User? =
        repository.findById(id)
}