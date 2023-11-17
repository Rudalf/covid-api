package org.Polytech.covid.controller;

import org.Polytech.covid.domain.Administrateur;
import org.Polytech.covid.repository.AdministrateurRepository;
import org.Polytech.covid.service.AdministrateurService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/Administrateurs")
public class AdministrateurController {

    @Autowired
    private AdministrateurService AdministrateurService;
    
    @Autowired
    private AdministrateurRepository AdministrateurRepository;

}
