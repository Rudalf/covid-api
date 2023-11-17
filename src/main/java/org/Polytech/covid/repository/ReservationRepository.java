package org.Polytech.covid.repository;

import org.Polytech.covid.domain.Reservation;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ReservationRepository extends JpaRepository<Reservation, Integer>{
    // List<Inscription> findAll();

}