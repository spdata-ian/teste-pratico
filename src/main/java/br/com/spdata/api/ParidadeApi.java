package br.com.spdata.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.spdata.service.ParidadeService;

@RestController
@RequestMapping("/paridade")
public class ParidadeApi {
	
	@Autowired
	private ParidadeService paridadeService;
	
	@GetMapping("/{id}")
	public ResponseEntity<String> paridadeParam(@PathVariable("id") Integer n){
		return ResponseEntity.ok(paridadeService.verificaParidade(n));
	}

}
