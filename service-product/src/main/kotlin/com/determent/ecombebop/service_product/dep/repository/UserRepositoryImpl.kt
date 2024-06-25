package com.determent.ecombebop.service_product.dep.repository

import com.determent.ecombebop.service_product.dep.entity.User
import kotlinx.coroutines.reactor.awaitSingleOrNull
import org.springframework.r2dbc.core.DatabaseClient
import org.springframework.r2dbc.core.await
import org.springframework.r2dbc.core.awaitOneOrNull
import org.springframework.stereotype.Repository
import reactor.core.publisher.Flux
import reactor.core.publisher.Mono

@Repository
class UserRepositoryImpl(private val client: DatabaseClient) : UserRepository {


    override suspend fun findById(id: Long): User? =
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

    override suspend fun save(user: User): Unit =
        client.sql("INSERT INTO users (username, email) VALUES (:username, :email)")
            .bind("username", user.username)
            .bind("email", user.email)
            .await()

}
