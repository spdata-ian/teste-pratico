package br.com.spdata;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class TestePraticoApplicationTests {

	@Test
	void contextLoads() {
		int numero = 2;
		
		if(numero % 2 == 0) {
			System.out.print("O número é par ");
		} else {
			System.out.print("O número é impar ");
		}
	}

}
