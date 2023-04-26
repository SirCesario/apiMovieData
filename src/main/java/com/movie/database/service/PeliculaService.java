package com.movie.database.service;

import com.movie.database.model.Pelicula;

import java.util.List;

public interface PeliculaService {

    Pelicula guardarPelicula(Pelicula pelicula);
    Pelicula buscarPeliculaPorId(Long id);
    void eliminarPeliculaPorId(Long id);
    List<Pelicula> listarPeliculas();
}
