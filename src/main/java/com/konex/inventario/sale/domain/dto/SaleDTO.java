package com.konex.inventario.sale.domain.dto;

import lombok.Data;

import java.sql.Timestamp;

@Data
public class SaleDTO {
    private Timestamp date;
    private String medicament;
    private Integer amount;
    private Integer unitValue;
    private Integer totalValue;
}
