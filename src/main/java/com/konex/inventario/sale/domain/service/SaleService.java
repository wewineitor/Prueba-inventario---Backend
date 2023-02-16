package com.konex.inventario.sale.domain.service;

import com.konex.inventario.sale.domain.dto.SaleDTO;
import com.konex.inventario.sale.domain.ports.api.SaleServicePort;
import com.konex.inventario.sale.domain.ports.spi.SalePersistencePort;
import com.konex.inventario.sale.infraestructure.entity.Sale;

import java.util.List;

public class SaleService implements SaleServicePort {
    private final SalePersistencePort salePersistencePort;

    public SaleService(SalePersistencePort salePersistencePort) {
        this.salePersistencePort = salePersistencePort;
    }

    @Override
    public List<Sale> getSales() {
        return salePersistencePort.getSales();
    }

    @Override
    public Sale addSale(SaleDTO saleDTO) {
        return salePersistencePort.addSale(saleDTO);
    }
}
