package com.determent.ecombebop.service_product.repository

import com.determent.ecombebop.service_product.entity.ProductItem
import org.springframework.r2dbc.core.DatabaseClient
import org.springframework.stereotype.Repository
import reactor.core.publisher.Mono
import java.util.*

@Repository
class DatabaseClientProductItem(
    private val client: DatabaseClient
) : ProductItemRepository {

    override fun saveItemProduct(itemProduct: ProductItem): Mono<Void> {
        return this.client.sql(SAVE)
            .bind("main_image", itemProduct.mainImage)
            .bind("title", itemProduct.title)
            .fetch()
            .one()
            .then()
    }

    companion object {
        @JvmStatic
        val SAVE = """ 
            insert into product_item(main_image, title)
            values (:main_image, :title)
        """
    }


}