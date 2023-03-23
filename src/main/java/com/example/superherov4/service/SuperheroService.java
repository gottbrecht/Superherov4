package com.example.superherov4.service;

import com.example.superherov4.model.Superhero;
import com.example.superherov4.repository.SuperheroRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;


    @Service
    public class SuperheroService {
        //repository er det samme som database
        //Services en hjemmeside har : f.eks. slet
        SuperheroRepository superheroRepository;

        SuperheroService(SuperheroRepository superheroRepository) {
            this.superheroRepository = superheroRepository;
        }

        public void createSuperhero(String heroName, String realName, String city, int creationYear, String superpower, boolean human, double strength) {
            superheroRepository.createSuperhero(heroName, realName, city, creationYear, superpower, human, strength);
        }


        public void remove(SuperheroRepository superheroRepository) {

        }

        //List of all superheroes
        public List<Superhero> getSuperheroes() {
            return superheroRepository.getAllSuperheroes();
        }

        public void createSuperhero() {
        }

        public void editSuperhero(String heroName, String realName, String city, int creationYear, String superpower, boolean human, double strength) {
        }

        public void removeSuperhero() {

        }

        public void addSuperhero() {
        }
    }


