package org.Polytech.covid.service;

import java.util.List;

import org.Polytech.covid.domain.Reservation;
import org.Polytech.covid.repository.ReservationRepository;
import org.springframework.stereotype.Service;

@Service
public class ReservationService {
    
    private ReservationRepository repository;

    public ReservationService(ReservationRepository repo){
        this.repository = repo;
    }

    public List<Reservation> findAll(){
        return repository.findAll();
    }

    public Reservation save(Reservation centre){
        return repository.save(centre);
    }

}
