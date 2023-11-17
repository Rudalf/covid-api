package org.Polytech.covid.controller;

import org.Polytech.covid.repository.MedecinRepository;
import org.Polytech.covid.service.MedecinService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/medecins")
public class MedecinController {

    @Autowired
    private MedecinService medecinService;
    @Autowired
    private MedecinRepository medecinRepository;

    
}
