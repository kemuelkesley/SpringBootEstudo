package br.kemu.estacio.alagoas.poswbsys;

import java.time.LocalDate;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import br.kemu.estacio.alagoas.poswbsys.dominio.rh.Pessoa;
import br.kemu.estacio.alagoas.poswbsys.dominio.rh.PessoaRepositorio;

@Component
@Transactional
public class PopulacaoInicialBanco implements CommandLineRunner {

	@Autowired
	private PessoaRepositorio pessoaRepo;
	
	@Override
	public void run(String... args) throws Exception {
		
		
		Pessoa p1 = new Pessoa("João Alberto");
		
		p1.setDataNascimento(LocalDate.of(1990, 4, 1));
		p1.setEmail("joao@gmail.com");
		
		Pessoa p2 = new Pessoa("Maria da Silva");
		p2.setDataNascimento(LocalDate.of(1995, 8, 5));
		p2.setEmail("maria@gmail.com");
		
		
		
		
		pessoaRepo.save(p1);
		pessoaRepo.save(p2);
	}
	
	
}
