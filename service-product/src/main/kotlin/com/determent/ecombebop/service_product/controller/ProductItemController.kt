package com.determent.ecombebop.service_product.controller

import com.determent.ecombebop.service_product.dto.ProductItemRequest
import com.determent.ecombebop.service_product.entity.ProductItem
import com.determent.ecombebop.service_product.service.ProductItemService
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/product-item")
class ProductItemController(
    private val productItemService: ProductItemService
) {

    @PostMapping("/create")
    suspend fun createProductItem(@RequestBody productItemRequest: ProductItemRequest): Void? {
        return productItemService.createProductItem(
            ProductItem(
                id = null,
                mainImage = productItemRequest.mainImage,
                title = productItemRequest.title,
            )
        )
    }
}