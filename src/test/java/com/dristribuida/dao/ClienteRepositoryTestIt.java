package com.dristribuida.dao;

import com.dristribuida.model.Cliente;
import jakarta.transaction.Transactional;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.annotation.Rollback;

import java.util.List;

@DataJpaTest
@AutoConfigureTestDatabase(replace = AutoConfigureTestDatabase.Replace.NONE)
@Transactional
@Rollback(value = false)

public class ClienteRepositoryTestIt {

    @Autowired
    private ClienteRepository clienteRepository;


    @Test
    public void findAll() {
        List<Cliente> clientess= clienteRepository.findAll();
                for(Cliente item:clientess){
           System.out.println(item.toString());
    }
    }
}
