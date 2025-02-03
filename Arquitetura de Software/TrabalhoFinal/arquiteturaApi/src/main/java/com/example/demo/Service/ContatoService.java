package com.example.demo.Service;

import com.example.demo.Entity.Contato;
import com.example.demo.Repository.ContatoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ContatoService {

    @Autowired
    private ContatoRepository contatoRepository;

    public void salvar(Contato contato){
        contatoRepository.save(contato);
    }

    public void salvarTodos(List<Contato> contatos){
        contatoRepository.saveAll(contatos);
    }

    public List<Contato> listaContato(){
        return contatoRepository.findAll();
    }

    public Optional<Contato> buscarPorId(Long id){
        return contatoRepository.findById(id);
    }

    public void removerPorId(Long id){
        contatoRepository.deleteById(id);
    }

}
