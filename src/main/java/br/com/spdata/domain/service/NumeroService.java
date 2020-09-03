package br.com.spdata.domain.service;

import org.springframework.stereotype.Service;

import br.com.spdata.domain.exception.NumeroNuloException;

@Service
public class NumeroService {

	public String obterParidade(Integer numero) {
		if(numero == null)
			throw new NumeroNuloException("Nenhum numero foi informado");
		else if(numero%2 == 0) return "Par";
		else return "Ímpar";
	}
}
