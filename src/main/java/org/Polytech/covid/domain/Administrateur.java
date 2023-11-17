package org.Polytech.covid.domain;

import jakarta.persistence.*;


@Entity
public class Administrateur {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
}
