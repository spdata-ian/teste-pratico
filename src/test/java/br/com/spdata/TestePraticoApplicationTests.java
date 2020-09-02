package br.com.spdata;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import br.com.spdata.service.ParidadeService;

@SpringBootTest
class TestePraticoApplicationTests {
	
	@Autowired
	private ParidadeService paridadeService;

	@Test
	void contextLoads() {
		
		Assertions.assertEquals("Par", paridadeService.verificaParidade(80));
		
		Assertions.assertEquals("Impar", paridadeService.verificaParidade(55));
	}

}
