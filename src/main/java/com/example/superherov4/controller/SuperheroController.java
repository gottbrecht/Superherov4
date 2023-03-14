package com.example.superherov4.controller;

import com.example.superherov4.model.Superhero;
import com.example.superherov4.repository.ISuperheroRepository;
import com.example.superherov4.service.SuperheroService;
//import org.apache.catalina.core.ApplicationContext;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.ApplicationContext;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping(path ="superhero")
public class SuperheroController {

    ISuperheroRepository superheroRepository; //Interface reference
    public SuperheroController(ApplicationContext context, @Value("${superhero.repository.impl}") String impl) {

    }

    SuperheroService superheroService;

    SuperheroController(SuperheroService superheroService) {
        this.superheroService = superheroService;
    }

    @GetMapping("")
    //returner en liste m. superheroes
    public ResponseEntity<List<Superhero>> getSuperheroes() {
        System.out.println("Linje 33");
        List<Superhero> returnList = superheroService.getSuperheroes();
        return new ResponseEntity<>(returnList, HttpStatus.OK);
    }

    @PostMapping("/createSuperhero")
    public ResponseEntity<Superhero> createSuperhero(@RequestBody Superhero superhero) {
        superheroService.createSuperhero();

        return new ResponseEntity(superhero, HttpStatus.OK);
    }


}





