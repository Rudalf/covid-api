package org.Polytech.covid.service;

import java.util.List;

import org.Polytech.covid.domain.Centre;
import org.Polytech.covid.repository.CentreRepository;
import org.springframework.stereotype.Service;

@Service
public class CentreService {
    
    private CentreRepository repository;

    public CentreService(CentreRepository repo){
        this.repository = repo;
    }

    public List<Centre> findAll(){
        return repository.findAll();
    }

    public Centre save(Centre centre){
        return repository.save(centre);
    }
}
