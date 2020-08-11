package br.com.spdata.service;

import org.springframework.stereotype.Service;

@Service
public class ClassificacaoNumeroService
{

	public String findResultado(Integer numero)
	{
		if(numero % 2 == 0)
		{
			return "Par";
		}
		else
		{
			return "Impar";
		}
	}
}
