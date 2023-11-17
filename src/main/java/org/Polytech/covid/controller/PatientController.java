package org.Polytech.covid.controller;

import java.util.List;

import org.Polytech.covid.domain.Patient;
import org.Polytech.covid.repository.PatientRepository;
import org.Polytech.covid.service.PatientService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/patients")
public class PatientController {

    @Autowired
    private PatientService patientService;
    @Autowired
    private PatientRepository patientRepository;

    @GetMapping("/{nom}")
    public List<Patient> findByNom(@PathVariable("nom") String nom) {
        return patientRepository.findByNom(nom);
    }
}
