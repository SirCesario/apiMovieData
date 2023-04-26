package com.movie.database.service.implement;

import com.movie.database.model.Pelicula;
import com.movie.database.repository.PeliculaRepository;
import com.movie.database.service.PeliculaService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class PeliculaServiceImple implements PeliculaService {

    @Autowired
    private PeliculaRepository peliculaRepository;


    @Override
    public Pelicula guardarPelicula(Pelicula pelicula) {
        return peliculaRepository.save(pelicula);
    }

    @Override
    public Pelicula buscarPeliculaPorId(Long id) {
        return peliculaRepository.findById(id).orElse(null);
    }

    @Override
    public void eliminarPeliculaPorId(Long id) {
        peliculaRepository.deleteById(id);
    }

    @Override
    public List<Pelicula> listarPeliculas() {
        return peliculaRepository.findAll();
    }
}
