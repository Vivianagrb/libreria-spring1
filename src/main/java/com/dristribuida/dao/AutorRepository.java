package com.dristribuida.dao;

//@Repository //Esto es un beans para gestionar persistencia con jpa

import com.dristribuida.model.Autor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

public interface AutorRepository extends JpaRepository<Autor, Integer> {
    Autor findById(String nombre);
}

