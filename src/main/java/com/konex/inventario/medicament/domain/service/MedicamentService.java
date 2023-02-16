package com.konex.inventario.medicament.domain.service;

import com.konex.inventario.medicament.domain.dto.MedicamentDTO;
import com.konex.inventario.medicament.domain.ports.api.MedicamentServicePort;
import com.konex.inventario.medicament.domain.ports.spi.MedicamentPersistencePort;
import com.konex.inventario.medicament.infraestructure.entity.Medicament;

import java.util.List;

public class MedicamentService implements MedicamentServicePort {
    private final MedicamentPersistencePort medicamentPersistencePort;

    public MedicamentService(MedicamentPersistencePort medicamentPersistencePort) {
        this.medicamentPersistencePort = medicamentPersistencePort;
    }


    @Override
    public List<Medicament> getMedicaments() {
        return medicamentPersistencePort.getMedicaments();
    }

    @Override
    public Medicament addMedicament(MedicamentDTO medicamentDTO) {
        return medicamentPersistencePort.addMedicament(medicamentDTO);
    }

    @Override
    public Medicament updateMedicament(String name, MedicamentDTO medicamentDTO) {
        return medicamentPersistencePort.updateMedicament(name, medicamentDTO);
    }

    @Override
    public void deleteMedicamentByName(String name) {
        medicamentPersistencePort.deleteMedicamentByName(name);
    }
}
