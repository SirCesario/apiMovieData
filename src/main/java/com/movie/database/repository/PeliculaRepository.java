package com.movie.database.repository;

import com.movie.database.model.Pelicula;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Date;
import java.util.List;

public interface PeliculaRepository  extends JpaRepository <Pelicula, Long> {

    List<Pelicula> findByGenero(String genero);
    List<Pelicula> findByFechaEstrenoBetween(Date fechaInicio, Date fechaFin);


}
