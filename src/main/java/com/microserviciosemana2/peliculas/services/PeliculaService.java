package com.microserviciosemana2.peliculas.services;

import org.springframework.stereotype.Service;
import com.microserviciosemana2.peliculas.model.Pelicula;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;


@Service
public class PeliculaService{

    private final List<Pelicula> peliculas = Arrays.asList(
        new Pelicula(1,"Mi pelicula 1", 1990, "Director 1", "Drama1", "Drama en pelicula 1"),
        new Pelicula(2,"Mi pelicula 2", 1991, "Director 2", "Drama2", "Drama en pelicula 2"),
        new Pelicula(3,"Mi pelicula 3", 1992, "Director 3", "Drama3", "Drama en pelicula 3"),
        new Pelicula(4,"Mi pelicula 4", 1993, "Director 4", "Drama4", "Drama en pelicula 4"),
        new Pelicula(5,"Mi pelicula 5", 1994, "Director 5", "Drama5", "Drama en pelicula 5"),
        new Pelicula(6,"Mi pelicula 6", 1995, "Director 6", "Drama6", "Drama en pelicula 6")
    );
   
    public List<Pelicula> getTodasLasPeliculas(){
        return peliculas; 
    }

    public Optional<Pelicula> getPeliculaPorID(int id){
        return peliculas.stream().filter(p-> p.getId() == id).findFirst(); 
    }
}
