package com.determent.ecombebop.service_product.repository

import com.determent.ecombebop.service_product.entity.ProductItem
import reactor.core.publisher.Mono
import java.util.*

interface ProductItemRepository {

    fun saveItemProduct(itemProduct: ProductItem): Mono<Void>
}