package com.dsd.tarea2.facade;

import com.dsd.tarea2.entidades.Pelicula;
import com.dsd.tarea2.repositorio.RepositorioPelicula;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

public interface ProductoFacade {

    List<Pelicula> ObtenerPelicula();
    Pelicula MostrarPelicula(int idpelicula);
    Pelicula CrearPelicula(Pelicula pelicula);
    Pelicula ActualizarPelicula(Pelicula pelicula);
    Pelicula EliminarPelicula(int idpelicula);
}
