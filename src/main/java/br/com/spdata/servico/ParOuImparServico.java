package br.com.spdata.servico;

import org.springframework.stereotype.Service;

import br.com.spdata.modelo.ParOuImpar;

@Service
public class ParOuImparServico {
	

	public ParOuImpar buscar(Integer id, Integer numero) {
		ParOuImpar n = new ParOuImpar(id, numero);
		
		if(n.getNumero() %2 == 0) {
			System.out.println("Par");
		}else {
			System.out.println("Impar");
		}
		return n;
	}

}
