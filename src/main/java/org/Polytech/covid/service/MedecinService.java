package org.Polytech.covid.service;

import org.Polytech.covid.repository.MedecinRepository;
import org.springframework.stereotype.Service;

@Service
public class MedecinService {
    
    private MedecinRepository repository;

    public MedecinService(MedecinRepository repo){
        this.repository = repo;
    }

}
