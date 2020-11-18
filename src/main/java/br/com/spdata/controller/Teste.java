package br.com.spdata.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import br.com.spdata.service.NumberService;

@RequestMapping("/teste")
public class Teste {
	private NumberService service;
	
	@GetMapping("/{id}")
	public ResponseEntity<String> getParam(@PathVariable("id") Integer n){
		String resposta = service.parOrImpar(n);
		return new ResponseEntity<String>(resposta, HttpStatus.OK);
	}
}
