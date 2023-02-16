package com.konex.inventario.medicament.infraestructure.config;

import com.konex.inventario.medicament.domain.ports.api.MedicamentServicePort;
import com.konex.inventario.medicament.domain.ports.spi.MedicamentPersistencePort;
import com.konex.inventario.medicament.domain.service.MedicamentService;
import com.konex.inventario.medicament.infraestructure.adapters.MedicamentJpaAdapter;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MedicamentConfig {
    @Bean
    public MedicamentPersistencePort medicamentPersistencePort(){
        return new MedicamentJpaAdapter();
    }

    @Bean
    public MedicamentServicePort medicamentService(){
        return new MedicamentService(medicamentPersistencePort());
    }
}
