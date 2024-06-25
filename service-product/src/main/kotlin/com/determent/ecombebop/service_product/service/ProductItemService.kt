package com.determent.ecombebop.service_product.service

import com.determent.ecombebop.service_product.entity.ProductItem
import com.determent.ecombebop.service_product.repository.ProductItemRepository
import kotlinx.coroutines.reactive.awaitFirstOrNull
import kotlinx.coroutines.reactor.awaitSingleOrNull
import org.springframework.stereotype.Service

@Service
class ProductItemService(
    private val productItemRepository: ProductItemRepository
) {

    suspend fun createProductItem(productItem: ProductItem): Void? {
        return productItemRepository.saveItemProduct(
            ProductItem(
                id = null,
                mainImage = productItem.mainImage,
                title = productItem.title,
            )
        ).awaitSingleOrNull()
    }
}