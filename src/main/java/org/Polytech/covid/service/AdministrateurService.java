package org.Polytech.covid.service;

import org.Polytech.covid.repository.AdministrateurRepository;
import org.springframework.stereotype.Service;

@Service
public class AdministrateurService {
    
    private AdministrateurRepository repository;

    public AdministrateurService(AdministrateurRepository repo){
        this.repository = repo;
    }

}
