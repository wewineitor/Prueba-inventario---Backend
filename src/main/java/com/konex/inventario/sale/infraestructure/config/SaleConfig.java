package com.konex.inventario.sale.infraestructure.config;

import com.konex.inventario.sale.domain.ports.api.SaleServicePort;
import com.konex.inventario.sale.domain.ports.spi.SalePersistencePort;
import com.konex.inventario.sale.domain.service.SaleService;
import com.konex.inventario.sale.infraestructure.adapters.SaleJpaAdapter;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
@Configuration
public class SaleConfig {
    @Bean
    public SalePersistencePort salePersistencePort(){
        return new SaleJpaAdapter();
    }

    @Bean
    public SaleServicePort saleService(){
        return new SaleService(salePersistencePort());
    }
}
