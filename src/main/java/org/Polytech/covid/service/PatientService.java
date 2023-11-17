package org.Polytech.covid.service;

import org.Polytech.covid.repository.PatientRepository;
import org.springframework.stereotype.Service;

@Service
public class PatientService {
    
    private PatientRepository repository;

    public PatientService(PatientRepository repo){
        this.repository = repo;
    }

}
