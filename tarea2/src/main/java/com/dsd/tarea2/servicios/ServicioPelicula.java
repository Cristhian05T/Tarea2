package com.dsd.tarea2.servicios;

import com.dsd.tarea2.entidades.Pelicula;

import java.util.List;

public interface ServicioPelicula {
    List<Pelicula> ObtenerPelicula();
    Pelicula MostrarPelicula(int idpelicula);
    Pelicula CrearPelicula(Pelicula pelicula);
    Pelicula ActualizarPelicula(Pelicula pelicula);
    Pelicula EliminarPelicula(int idpelicula);

}
