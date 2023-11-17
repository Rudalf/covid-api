package org.Polytech.covid.repository;

import org.Polytech.covid.domain.Administrateur;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AdministrateurRepository extends JpaRepository<Administrateur, Integer>{

}