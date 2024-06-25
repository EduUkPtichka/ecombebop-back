package com.determent.ecombebop.service_product.dep.service

import com.determent.ecombebop.service_product.dep.entity.User
import com.determent.ecombebop.service_product.dep.repository.UserRepository
import org.springframework.stereotype.Service
import reactor.core.publisher.Mono

@Service
class UserService(val repository: UserRepository) {
    suspend fun findUserById(id: Long): User? =
        repository.findById(id)


    suspend fun createUser(username: String, email: String) {
        val user = User(username = username, email = email)
        return repository.save(user)
    }
}