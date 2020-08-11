package br.com.spdata.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.spdata.service.ClassificacaoNumeroService;

@RequestMapping(path = "/classificacaoNumero")
@RestController
public class ClassificacaoNumeroRest
{
	
	@Autowired
	private ClassificacaoNumeroService classificacao;
	
	public ResponseEntity<String> getParam(@PathVariable("numero") Integer numero)
	{
		return ResponseEntity.ok(classificacao.findResultado(numero));
	}

}
