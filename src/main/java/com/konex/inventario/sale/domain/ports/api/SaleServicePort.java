package com.konex.inventario.sale.domain.ports.api;

import com.konex.inventario.sale.domain.dto.SaleDTO;
import com.konex.inventario.sale.infraestructure.entity.Sale;

import java.util.List;

public interface SaleServicePort {
    List<Sale> getSales();
    Sale addSale(SaleDTO saleDTO);
}
