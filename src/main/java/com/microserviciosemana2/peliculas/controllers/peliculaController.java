package com.microserviciosemana2.peliculas.controllers;

import com.microserviciosemana2.peliculas.model.Pelicula;
import com.microserviciosemana2.peliculas.services.PeliculaService;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;
import org.springframework.web.bind.annotation.GetMapping;


@RestController
@RequestMapping("/peliculas")

public class peliculaController {

    private final PeliculaService peliculaService; 

    public peliculaController(PeliculaService peliculaService){
        this.peliculaService = peliculaService; 
    }
    

    @GetMapping
    public List<Pelicula> retornaTodasLasPeliculas() {
        return peliculaService.getTodasLasPeliculas(); 
    }

    @GetMapping("/{id}")
    public Pelicula retornaPeliculaPorID(@PathVariable int id) {
        Optional<Pelicula> pelicula = peliculaService.getPeliculaPorID(id); 
        return pelicula.orElse(null); 
    }
    
    
}
