package com.determent.ecombebop.service_product.repository

import com.determent.ecombebop.service_product.entity.User
import org.springframework.r2dbc.core.DatabaseClient
import org.springframework.r2dbc.core.awaitOneOrNull
import org.springframework.stereotype.Repository

@Repository
class UserRepository(private val client: DatabaseClient) {
    suspend fun findById(id: Long): User? =
        client
            .sql("SELECT * FROM users WHERE id = $id")
            .map { row ->
                User(
                    row.get("id") as Long,
                    row.get("username") as String,
                    row.get("email") as String,
                )
            }
            .awaitOneOrNull()
}