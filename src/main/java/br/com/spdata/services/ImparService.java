package br.com.spdata.services;

import org.springframework.stereotype.Service;

@Service
public class ImparService {

	public String eImpar (Integer i) {
		if(i%2 == 0) {
			return "par";
		}else {
			return "impar";
		}
	}
}
