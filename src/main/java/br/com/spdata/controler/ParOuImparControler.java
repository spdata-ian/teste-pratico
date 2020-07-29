package br.com.spdata.controler;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.spdata.modelo.ParOuImpar;
import br.com.spdata.servico.ParOuImparServico;

@RestController
@RequestMapping("/paresouimpares")
public class ParOuImparControler {
	
	@Autowired
	private ParOuImparServico parOuImparServico;
	
	@GetMapping(value = "/{id}")
	public ParOuImpar buscarPorId(@PathVariable Integer id) {
		return parOuImparServico.buscar(id);
	}

}
