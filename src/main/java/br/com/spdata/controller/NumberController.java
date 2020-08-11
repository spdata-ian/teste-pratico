package br.com.spdata.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.spdata.service.NumberService;


@RestController
@RequestMapping(path = "/api/number")
public class NumberController
{

	@Autowired
	private NumberService service;
	
	@GetMapping(path = "/{id}")
	public ResponseEntity<String> getParam(@PathVariable("id") Integer number)
	{
		return ResponseEntity.ok(service.imparOrPar(number));
	}
}
