package com.konex.inventario.medicament.domain.dto;

import lombok.Data;

import java.util.Date;

@Data
public class MedicamentDTO {
    private String name;
    private String laboratory;
    private Date manufacturingDate;
    private Date dueDate;
    private Integer stock;
    private Integer unitValue;
}
