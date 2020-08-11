package br.com.spdata;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import br.com.spdata.service.ClassificacaoNumeroService;

@SpringBootTest
class TestePraticoApplicationTests
{
	@Autowired
	private ClassificacaoNumeroService classificacaoService;

	@Test
	public void findResultado()
	{
		Integer numero = 13;
		
		classificacaoService.findResultado(numero);
		Assertions.assertEquals("Impar",classificacaoService.findResultado(numero));
	}

}
