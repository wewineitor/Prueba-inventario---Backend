package com.konex.inventario.medicament.domain.ports.api;

import com.konex.inventario.medicament.domain.dto.MedicamentDTO;
import com.konex.inventario.medicament.infraestructure.entity.Medicament;

import java.util.List;

public interface MedicamentServicePort {
    List<Medicament> getMedicaments();

    Medicament addMedicament(MedicamentDTO medicamentDTO);

    Medicament updateMedicament(String name, MedicamentDTO medicamentDTO);

    void deleteMedicamentByName(String name);
}
