package br.com.spdata.service;

import org.springframework.stereotype.Service;

@Service
public class NumberService {
	public String parOrImpar(Integer n) {
		if (n % 2 == 0) {
			return "NumPar";
		}
		else {
			return "NumImpar";
		}
	}
}
