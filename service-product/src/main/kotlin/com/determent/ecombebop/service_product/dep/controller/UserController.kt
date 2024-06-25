package com.determent.ecombebop.service_product.dep.controller

import com.determent.ecombebop.service_product.dep.dto.request.UserRequest
import com.determent.ecombebop.service_product.dep.entity.User
import com.determent.ecombebop.service_product.dep.service.UserService
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.*

//@RestController()
//class UserController(private val userService: UserService) {
//
//    @GetMapping("/users/{id}")
//    suspend fun getUserById(@PathVariable id: Long): ResponseEntity<User> {
//        val user = userService.findUserById(id)
//        return if (user != null) ResponseEntity.ok(user)
//        else ResponseEntity.notFound().build()
//    }
//
//    @PostMapping("/create")
//    @ResponseStatus(HttpStatus.CREATED)
//    suspend fun createUser(@RequestBody userRequest: UserRequest) {
//        return userService.createUser(userRequest.username, userRequest.email)
//    }
//}