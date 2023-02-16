package com.konex.inventario.sale.infraestructure.adapters;

import com.konex.inventario.sale.domain.dto.SaleDTO;
import com.konex.inventario.sale.domain.ports.spi.SalePersistencePort;
import com.konex.inventario.sale.infraestructure.entity.Sale;
import com.konex.inventario.sale.infraestructure.repository.SaleRepository;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class SaleJpaAdapter implements SalePersistencePort {

    @Autowired
    SaleRepository saleRepository;

    @Override
    public List<Sale> getSales() {
        return saleRepository.findAll();
    }

    @Override
    public Sale addSale(SaleDTO saleDTO) {
        Sale sale = new ModelMapper().map(saleDTO, Sale.class);
        return saleRepository.save(sale);
    }
}
