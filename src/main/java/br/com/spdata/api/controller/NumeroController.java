package br.com.spdata.api.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import br.com.spdata.api.model.Paridade;
import br.com.spdata.domain.service.NumeroService;

@RestController
@RequestMapping("/numeros")
public class NumeroController {

	@Autowired
	private NumeroService numeroService;
	
	@GetMapping("/paridade")
	public ResponseEntity<Paridade> obterParidade(@RequestParam Integer numero) {
	
		String paridade = numeroService.obterParidade(numero);
		Paridade body = new Paridade(paridade);
		return ResponseEntity.ok(body);
	}
}
