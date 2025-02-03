package com.example.demo.Controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Entity.Pessoa;
import com.example.demo.Service.PessoaService;

@RestController
@RequestMapping("/api")
public class PessoaController {

	@Autowired
	private PessoaService pessoaService;

	@GetMapping
	public List<Pessoa> listarPessoas() {
		List<Pessoa> pessoa = pessoaService.listaPessoa();
		return pessoa;
	}

	@GetMapping("/{id}")
	public Optional<Pessoa> listarPessoa(@PathVariable(name = "id") Long id) {
		Optional<Pessoa> pessoa = pessoaService.buscarPorId(id);
		return pessoa;
	}

	@PostMapping
	@ResponseStatus(code = HttpStatus.CREATED)
	public void criarPessoa(@RequestBody Pessoa pessoa) {
		pessoaService.salvar(pessoa);
	}

	@DeleteMapping("/{id}")
	public void removerPessoa(@PathVariable(name = "id") Long id) {
		pessoaService.removerPorId(id);
	}

	@PutMapping("/{id}")
	public void atualizarPessoa(@PathVariable("id") Long id, @RequestBody Pessoa pessoa) {
		pessoaService.atualizarPessoa(id,pessoa);
	}
}
