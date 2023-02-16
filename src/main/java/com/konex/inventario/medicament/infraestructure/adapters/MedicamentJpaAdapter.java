package com.konex.inventario.medicament.infraestructure.adapters;

import com.konex.inventario.medicament.domain.dto.MedicamentDTO;
import com.konex.inventario.medicament.domain.ports.spi.MedicamentPersistencePort;
import com.konex.inventario.medicament.infraestructure.entity.Medicament;
import com.konex.inventario.medicament.infraestructure.repository.MedicamentRepository;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class MedicamentJpaAdapter implements MedicamentPersistencePort {
    @Autowired
    private MedicamentRepository medicamentRepository;

    @Override
    public List<Medicament> getMedicaments() {
        return medicamentRepository.findAll();
    }

    @Override
    public Medicament addMedicament(MedicamentDTO medicamentDTO) {
        Medicament medicament = new ModelMapper().map(medicamentDTO, Medicament.class);
        return medicamentRepository.save(medicament);
    }

    @Override
    public Medicament updateMedicament(String name, MedicamentDTO medicamentDTO) {
        Medicament medicament = medicamentRepository.findByName(name);
        new ModelMapper().map(medicamentDTO, medicament);
        medicamentRepository.save(medicament);
        return medicament;
    }

    @Override
    public void deleteMedicamentByName(String name) {
        Medicament medicament = medicamentRepository.findByName(name);
        medicamentRepository.delete(medicament);
    }
}
