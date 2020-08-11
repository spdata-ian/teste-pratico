package br.com.spdata.service;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.MockitoAnnotations;

import br.com.spdata.service.NumberService;

public class NumberServiceTest
{

	@InjectMocks
	NumberService service;
	
	@Test
	public void imparOrParTest()
	{
		MockitoAnnotations.initMocks(this);
		
		Assertions.assertEquals("Par", service.imparOrPar(2));
	}
}
