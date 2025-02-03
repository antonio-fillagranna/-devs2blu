package com.example.demo.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Entity.Endereco;
import com.example.demo.Repository.EnderecoRepository;
@Service
public class EnderecoService {

    @Autowired
    private EnderecoRepository enderecoRepository;

    public void salvar(Endereco endereco){
        enderecoRepository.save(endereco);
    }

    public void salvarTodos(List<Endereco> enderecos){
        enderecoRepository.saveAll(enderecos);
    }

    public List<Endereco> listaEndereco(){
        return enderecoRepository.findAll();
    }

    public Optional<Endereco> buscarPorId(Long id){
        return enderecoRepository.findById(id);
    }

    public void removerPorId(Long id){
        enderecoRepository.deleteById(id);
    }

}
