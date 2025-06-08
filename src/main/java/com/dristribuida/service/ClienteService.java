package com.dristribuida.service;

import com.dristribuida.model.Cliente;

import java.util.List;

public interface ClienteService {
    public List<Cliente> findAll();
    public Cliente findOne(int id_cliente);
    public Cliente save(Cliente cliente);
    public Cliente update(int id_cliente, Cliente cliente);
    public void delete(int id_cliente);
}
