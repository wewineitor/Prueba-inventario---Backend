package com.konex.inventario.medicament.infraestructure.entity;

import jakarta.persistence.*;
import lombok.*;

import java.util.Date;

@Getter
@Setter
@ToString
@RequiredArgsConstructor
@Entity
@Table(name = "medicament")
public class Medicament {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String laboratory;
    @Temporal(TemporalType.DATE)
    private Date manufacturingDate;
    @Temporal(TemporalType.DATE)
    private Date dueDate;
    private Integer stock;
    private Integer unitValue;
}
