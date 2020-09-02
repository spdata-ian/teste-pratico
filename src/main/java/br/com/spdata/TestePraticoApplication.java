package br.com.spdata;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = {"br.com.spdata"})
public class TestePraticoApplication {

	public static void main(String[] args) {
		SpringApplication.run(TestePraticoApplication.class, args);
	}

}
