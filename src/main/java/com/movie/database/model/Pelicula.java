package com.movie.database.model;

import jakarta.persistence.*;

import java.util.Date;

@Entity
@Table(name = "peliculas")
public class Pelicula {

    @Id
    private Long id;
    private String titulo;

    @Column(name = "fechaEstrenos")
    private Date fechaEstreno;
    private String genero;

    public Pelicula (){}
    public Pelicula(Long id, String titulo, Date fechaEstreno, String genero) {
        this.id = id;
        this.titulo = titulo;
        this.fechaEstreno = fechaEstreno;
        this.genero = genero;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public Date getFechaEstreno() {
        return fechaEstreno;
    }

    public void setFechaEstreno(Date fechaEstreno) {
        this.fechaEstreno = fechaEstreno;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }
}
