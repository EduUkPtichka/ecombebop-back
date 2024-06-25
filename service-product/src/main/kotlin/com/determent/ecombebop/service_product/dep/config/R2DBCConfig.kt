package com.determent.ecombebop.service_product.dep.config

import io.r2dbc.spi.ConnectionFactories;
import io.r2dbc.spi.ConnectionFactory;
import io.r2dbc.spi.ConnectionFactoryOptions;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import io.r2dbc.spi.ConnectionFactoryOptions.*;


@Configuration
class R2DBCConfig {
    @Bean
    fun connectionFactory(): ConnectionFactory {
        return ConnectionFactories.get(
            ConnectionFactoryOptions.builder()
                .option(DRIVER, "postgresql")
                .option(HOST, "localhost")
                .option(DATABASE, "product_db")
                .option(USER, "product_db")
                .option(PASSWORD, "product_db")
                .build()
        )
    }
}