package com.konex.inventario.medicament.infraestructure.repository;

import com.konex.inventario.medicament.infraestructure.entity.Medicament;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MedicamentRepository extends JpaRepository<Medicament, Long> {
    Medicament findByName(String name);
}
