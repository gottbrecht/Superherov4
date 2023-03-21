package com.example.superherov4.repository;

import com.example.superherov4.model.Superhero;
import org.springframework.stereotype.Repository;

import java.util.List;

public interface ISuperheroRepository {
    //heroname, realname, creationyear

    Superhero getSuperheroByName(String name);

    List<Superhero> getAllSuperheroes();

}
