package com.distribuida.service;

import com.distribuida.model.Libro;
import java.util.List;

public interface LibroService {
    public List<Libro> findAll();
    public Libro findOne(int id_libro);
    public  Libro save(Libro libro);
    public  Libro update(int id_libro, Libro libro);
    public void delete(int id_libro);


}
