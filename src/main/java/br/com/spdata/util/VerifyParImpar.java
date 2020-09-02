package br.com.spdata.util;

import org.springframework.stereotype.Service;

@Service
public class VerifyParImpar {

    public String verify(String  query){

    try {
    int number = Integer.parseInt(query);
    int resto = number % 2;
    if (resto == 0) {
        return "Par";
    } else {
        return "Ímpar";
    }
    }catch (NumberFormatException ex){
        return "Número não valido";
    }
    }

}
