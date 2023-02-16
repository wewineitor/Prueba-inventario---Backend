package com.konex.inventario.medicament.application.controller;

import com.konex.inventario.medicament.domain.dto.MedicamentDTO;
import com.konex.inventario.medicament.domain.ports.api.MedicamentServicePort;
import com.konex.inventario.medicament.infraestructure.entity.Medicament;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/medicament")
public class MedicamentController {
    @Autowired
    MedicamentServicePort medicamentServicePort;

    @CrossOrigin
    @GetMapping("/list")
    List<Medicament> getAllMedicaments() {
        return medicamentServicePort.getMedicaments();
    }

    @CrossOrigin
    @ResponseStatus(HttpStatus.CREATED)
    @PostMapping
    Medicament createMedicament(@RequestBody MedicamentDTO medicamentDTO) {
        return medicamentServicePort.addMedicament(medicamentDTO);
    }

    @CrossOrigin
    @PutMapping("/{name}")
    Medicament updateMedicament(@PathVariable String name, @RequestBody MedicamentDTO medicamentDTO) {
        return medicamentServicePort.updateMedicament(name, medicamentDTO);
    }

    @CrossOrigin
    @ResponseStatus(HttpStatus.NO_CONTENT)
    @DeleteMapping("/{name}")
    void deleteMedicament(@PathVariable String name) {
        medicamentServicePort.deleteMedicamentByName(name);
    }
}
