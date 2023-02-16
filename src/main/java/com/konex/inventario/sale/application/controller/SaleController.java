package com.konex.inventario.sale.application.controller;

import com.konex.inventario.sale.domain.dto.SaleDTO;
import com.konex.inventario.sale.domain.ports.api.SaleServicePort;
import com.konex.inventario.sale.infraestructure.entity.Sale;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/sale")
public class SaleController {
    @Autowired
    SaleServicePort saleServicePort;

    @CrossOrigin
    @GetMapping("/list")
    List<Sale> getAllSales() {
        return saleServicePort.getSales();
    }

    @CrossOrigin
    @ResponseStatus(HttpStatus.CREATED)
    @PostMapping
    Sale createSale(@RequestBody SaleDTO saleDTO) {
        return saleServicePort.addSale(saleDTO);
    }
}
