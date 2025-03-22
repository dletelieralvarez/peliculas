package com.microserviciosemana2.peliculas.model;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data //genera los set y get
@NoArgsConstructor //constructor vacio
@AllArgsConstructor //constructor con los atributos


public class Pelicula {
    private int id; 
    private String titulo; 
    private int anio; 
    private String director;
    private String genero; 
    private String sinopsis; 
}
