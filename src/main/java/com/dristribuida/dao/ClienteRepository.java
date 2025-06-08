package com.dristribuida.dao;

import com.dristribuida.model.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

//@Repository //Esto es un beans para gestionar persistencia con jpa
public interface ClienteRepository extends JpaRepository <Cliente, Integer> {
Cliente findByCedula(String cedula);

}
