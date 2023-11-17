package org.Polytech.covid.repository;


import java.util.List;

import org.Polytech.covid.domain.Centre;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

@Repository
public interface CentreRepository extends JpaRepository<Centre, Integer>{
    void deleteById(Integer id);

    @Query("SELECT c FROM Centre c WHERE c.ville ILIKE %:ville%")
    List<Centre> findByVille(@Param("ville") String ville);

}