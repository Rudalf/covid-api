package org.Polytech.covid.repository;

import org.Polytech.covid.domain.Medecin;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MedecinRepository extends JpaRepository<Medecin, Integer>{
    
}