package com.dsd.tarea2.entidades;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;
import java.io.Serializable;

@Entity
public class Pelicula implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idpelicula;
    @NotNull
    private String titulo;
    private String anio;
    private String formato;
    private String nacionalidad;
    private String idioma;
    private String descripcion;
    private String observacion;

    public int getIdpelicula() {

        return idpelicula;
    }

    public void setIdpelicula(int idpelicula) {

        this.idpelicula = idpelicula;
    }

    public String getTitulo() {

        return titulo;
    }

    public void setTitulo(String titulo) {

        this.titulo = titulo;
    }

    public String getAnio() {

        return anio;
    }

    public void setAnio(String anio) {

        this.anio = anio;
    }

    public String getFormato() {

        return formato;
    }

    public void setFormato(String formato) {

        this.formato = formato;
    }

    public String getNacionalidad() {

        return nacionalidad;
    }

    public void setNacionalidad(String nacionalidad) {

        this.nacionalidad = nacionalidad;
    }

    public String getIdioma() {

        return idioma;
    }

    public void setIdioma(String idioma) {

        this.idioma = idioma;
    }

    public String getDescripcion() {

        return descripcion;
    }

    public void setDescripcion(String descripcion) {

        this.descripcion = descripcion;
    }

    public String getObservacion() {

        return observacion;
    }

    public void setObservacion(String observacion) {

        this.observacion = observacion;
    }
}
