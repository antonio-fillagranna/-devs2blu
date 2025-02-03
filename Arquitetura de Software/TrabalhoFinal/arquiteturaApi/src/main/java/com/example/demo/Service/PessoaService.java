package com.example.demo.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Entity.Pessoa;
import com.example.demo.Repository.PessoaRepository;

@Service
public class PessoaService {
	
	@Autowired
	private ContatoService contatoService;
	
	@Autowired
	private EnderecoService enderecoService;
	
	@Autowired
	private SetorService setorService;
	
	@Autowired
	private DocumentoService documentoService;

    @Autowired
    private PessoaRepository pessoaRepository;

    public void salvar(Pessoa pessoa){
    	documentoService.salvarTodos(pessoa.getDocumento());
		enderecoService.salvarTodos(pessoa.getEndereco());
		contatoService.salvarTodos(pessoa.getContato());
		setorService.salvar(pessoa.getSetor());
		pessoaRepository.save(pessoa);
    }

    public List<Pessoa> listaPessoa(){
        return pessoaRepository.findAll();
    }

    public Optional<Pessoa> buscarPorId(Long id){
        return pessoaRepository.findById(id);
    }

    public void removerPorId(Long id){
        pessoaRepository.deleteById(id);
    }
    
	public void atualizarPessoa(Long id, Pessoa pessoa) {
		Optional<Pessoa> pessoaById = buscarPorId(id);

		if (pessoaById.isPresent()) {
			Pessoa pessoaExistente = pessoaById.get();
			this.atualizarDadosPessoa(pessoaExistente, pessoa);
		} else {
			Pessoa novaPessoa = new Pessoa();
			this.atualizarDadosPessoa(novaPessoa, pessoa);
		}
	}

	private void atualizarDadosPessoa(Pessoa pessoaExistente, Pessoa novaPessoa) {
		pessoaExistente.setDataNascimento(novaPessoa.getDataNascimento());
		pessoaExistente.setInscricaoFederal(novaPessoa.getInscricaoFederal());
		pessoaExistente.setNome(novaPessoa.getNome());
		pessoaExistente.setSalario(novaPessoa.getSalario());
		pessoaExistente.setSetor(novaPessoa.getSetor());
		pessoaExistente.setContato(novaPessoa.getContato());
		pessoaExistente.setEndereco(novaPessoa.getEndereco());
		pessoaExistente.setDocumento(novaPessoa.getDocumento());
	
		this.salvar(pessoaExistente);
	}

}
