package org.Polytech.covid.controller;

import org.Polytech.covid.domain.Centre;
import org.Polytech.covid.repository.CentreRepository;
import org.Polytech.covid.service.CentreService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.util.UriComponentsBuilder;

import java.net.URI;
import java.util.List;

@RestController
@RequestMapping("/api/centres")
public class CentreController {

    @Autowired
    private CentreService centreService;
    @Autowired
    private CentreRepository centreRepository;

    @GetMapping("/{ville}")
    public List<Centre> findByVille(@PathVariable("ville") String ville) {
        System.err.println(ville);
        return centreRepository.findByVille(ville);
    }

    @GetMapping("/read")
    public List<Centre> findAll() {
        return centreService.findAll();
    }
    
    @PostMapping("/create")
    public ResponseEntity<Centre> createCentre(@RequestBody Centre centre, UriComponentsBuilder uriBuilder) {
        Centre savedCentre = centreService.save(centre);

        URI uri = uriBuilder.path("/centre/{id}").buildAndExpand(centre.getId()).toUri();
        return ResponseEntity.created(uri).body(savedCentre);
    }

    // @PutMapping("/put/{id}")
    // public ResponseEntity<Centre> updateCentre(@PathVariable("id") Integer id) {
    //     return centreRepository.(id);
    // }

    @DeleteMapping("/delete/{id}")
    public void deleteCentre(@PathVariable("id") Integer id){
        centreRepository.deleteById(id);
    }
}
