package com.labo3.labo3.entities;

import jakarta.persistence.*;

@Entity
public class Club {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer Id;

    @Column(name = "name")
    private String name;

    @Column(name = "country")
    private String country;

    @Column(name = "coach")
    private String coach;

    @Column(name = "titles")
    private String titles;
}
