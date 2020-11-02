package com.dsd.tarea2.servicios;

import com.dsd.tarea2.entidades.Pelicula;
import com.dsd.tarea2.repositorio.RepositorioPelicula;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class ServicioPeliculaImpl implements ServicioPelicula {


    @Autowired //Inyecta el repositorio

    private RepositorioPelicula repositorioPelicula;

    @Override
    public List<Pelicula> ObtenerPelicula() {
        return (List<Pelicula>) repositorioPelicula.findAll();
    }

    @Override
    public Pelicula MostrarPelicula(int idpelicula) {
        return repositorioPelicula.findById(idpelicula).get();
    }

    @Override
    public Pelicula CrearPelicula(Pelicula pelicula) {
        return repositorioPelicula.save(pelicula);
    }

    @Override
    public Pelicula ActualizarPelicula(Pelicula pelicula) {
        Pelicula p = MostrarPelicula(pelicula.getIdpelicula());
        if (p!=null) {
            return repositorioPelicula.save(pelicula);
        }
        return null;
    }

    @Override
    public Pelicula EliminarPelicula(int idpelicula) {
        Pelicula p = MostrarPelicula(idpelicula);
        if(p!=null) {
            repositorioPelicula.delete(p);
        }
        return p;
    }
}
