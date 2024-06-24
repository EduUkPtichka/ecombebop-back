package com.determent.ecombebop.service_product.controller

import com.determent.ecombebop.service_product.entity.User
import com.determent.ecombebop.service_product.service.UserService
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RestController

@RestController()
class UserController(private val userService: UserService) {
    @GetMapping("/users/{id}")
    suspend fun getUserById(@PathVariable id: Long): ResponseEntity<User> {
        val user = userService.findUserById(id)
        return if (user != null) ResponseEntity.ok(user)
        else ResponseEntity.notFound().build()
    }
}