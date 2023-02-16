package com.konex.inventario.sale.infraestructure.repository;

import com.konex.inventario.sale.infraestructure.entity.Sale;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SaleRepository extends JpaRepository<Sale, Long> {
    Sale findByMedicament(String medicament);
}
