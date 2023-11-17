package org.Polytech.covid.repository;

import java.util.List;

import org.Polytech.covid.domain.Patient;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PatientRepository extends JpaRepository<Patient, Integer>{
    List<Patient> findByNom(String nom);

}