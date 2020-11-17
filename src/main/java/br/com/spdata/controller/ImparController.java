package br.com.spdata.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import br.com.spdata.services.ImparService;

@RestController
@RequestMapping(value ="/api")
@CrossOrigin(origins = "*")
public class ImparController {

	@Autowired
	private ImparService service;
	
	@GetMapping
	public ResponseEntity<String> parImpar(@RequestParam("impar") Integer impar){
		
		String resp = service.eImpar(impar);
		return ResponseEntity.ok().body(resp);
	}
}
