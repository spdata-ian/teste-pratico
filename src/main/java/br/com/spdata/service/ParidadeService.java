package br.com.spdata.service;

import org.springframework.stereotype.Service;

@Service
public class ParidadeService {
	
	public String verificaParidade(Integer n) {
		if(n % 2 == 0) {
			return "Par";
		}else {
			return "Impar";
		}
	}

}
