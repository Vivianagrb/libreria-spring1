package com.dristribuida.dao;

import com.dristribuida.model.Categoria;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoriaRepository extends JpaRepository<Categoria, Integer> {
    Categoria findById(String categoria);

}
