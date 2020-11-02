package com.dsd.tarea2.facade;

import com.dsd.tarea2.entidades.Pelicula;
import com.dsd.tarea2.repositorio.RepositorioPelicula;
import com.dsd.tarea2.servicios.ServicioPelicula;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;
@RestController
@RequestMapping("/api")
public class ProductoFacadeImpl implements ProductoFacade {

    @Autowired
    private ServicioPelicula servicioPelicula;


    @GetMapping("/peliculas")
    public List<Pelicula> ObtenerPelicula() {
        return servicioPelicula.ObtenerPelicula();
    }

    @GetMapping("/mostrar/{idpelicula}")
    public Pelicula MostrarPelicula(@PathVariable(value="idpelicula") int idpelicula) {
        return servicioPelicula.MostrarPelicula(idpelicula);
    }

    @PostMapping("/pelicula")
    public Pelicula CrearPelicula(@RequestBody Pelicula pelicula) {
        return servicioPelicula.CrearPelicula(pelicula);
    }

    @PutMapping("/pelicula")
    public Pelicula ActualizarPelicula(@RequestBody Pelicula pelicula) {
        Pelicula p = null;
        try {
            p = servicioPelicula.ActualizarPelicula(pelicula);
        } catch (Exception e){
            throw new ResponseStatusException(HttpStatus.NOT_FOUND,"Hubo un problema al actualizar el Registro");
        }
        return p;
    }

    @DeleteMapping("/elimina/{idpelicula}")
    public Pelicula EliminarPelicula(@PathVariable(value="idpelicula") int idpelicula) {
        Pelicula p = null;
        try {
            p = servicioPelicula.EliminarPelicula(idpelicula);
        } catch (Exception e){
            throw new ResponseStatusException(HttpStatus.MULTI_STATUS,"No se Elimino el Registro");
        }
        return p;
    }
}
