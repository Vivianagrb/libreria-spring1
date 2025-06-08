package com.dristribuida.dao;


import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import static org.junit.jupiter.api.Assertions.assertNotNull;


@ExtendWith(SpringExtension.class)
@SpringBootTest
@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class AutorRepositoryTestIt {

    private final AutorRepository autorRepository;

    @Autowired
    public AutorRepositoryTestIt(AutorRepository autorRepository) {
        this.autorRepository = autorRepository;
    }

    @Test
    public void findAll() {
        var autores = autorRepository.findAll();
        assertNotNull(autores);
    }
}
