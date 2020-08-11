package br.com.spdata.service;

import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.stereotype.Service;

@Service
@EnableScheduling
public class NumberService
{
	public String imparOrPar(Integer number)
	{		
		if (number % 2 == 0)
		{
			return "Par";
		}
		else
		{
			return "Impar";
		}
	}
	
}
