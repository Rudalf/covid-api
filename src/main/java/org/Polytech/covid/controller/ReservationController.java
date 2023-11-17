package org.Polytech.covid.controller;

import java.net.URI;
import java.util.List;

import org.Polytech.covid.domain.Reservation;
import org.Polytech.covid.service.ReservationService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.util.UriComponentsBuilder;


@RestController
@RequestMapping("/inscriptions")
public class ReservationController {

    @Autowired
    private ReservationService reservationService;
    
    @GetMapping("/all")
    public List<Reservation> findAll() {
        return reservationService.findAll();
    }

    @PostMapping("/create")
    public ResponseEntity<Reservation> createReservation(@RequestBody Reservation reservation, UriComponentsBuilder uriBuilder) {
        Reservation savedReservation = reservationService.save(reservation);

        URI uri = uriBuilder.path("/inscription/{id}").buildAndExpand(reservation.getId()).toUri();
        return ResponseEntity.created(uri).body(savedReservation);
    }

}
