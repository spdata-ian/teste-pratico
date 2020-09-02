package br.com.spdata.controller;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

import static org.junit.jupiter.api.Assertions.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;

@RunWith(SpringRunner.class)
@WebMvcTest(NumberController.class)

class NumberControllerTest {
    @Autowired
    private MockMvc mvc;

    @Test
    void verifyPar() throws Exception{
        mvc.perform(MockMvcRequestBuilders.get("/verify?number=2"))
                .andExpect(content().string("Par"));

    }
    @Test
    void verifyImpar() throws Exception{
        mvc.perform(MockMvcRequestBuilders.get("/verify?number=3"))
                .andExpect(content().string("Ímpar"));

    }

    @Test
    void verifyNumberInvalid() throws Exception{
        mvc.perform(MockMvcRequestBuilders.get("/verify?number=um"))
                .andExpect(content().string("Número não valido"));

    }
    @Test
    void verifyInvalidUrl() throws Exception{
        mvc.perform(MockMvcRequestBuilders.get("/verify213?nuber=um"))
                .andExpect(MockMvcResultMatchers.status().isNotFound());

    }


}