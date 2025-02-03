package com.example.demo.Service;

import com.example.demo.Entity.Setor;
import com.example.demo.Repository.SetorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class SetorService {

    @Autowired
    private SetorRepository setorRepository;

    public void salvar(Setor cliente){
        setorRepository.save(cliente);
    }

    public List<Setor> listaSetor(){
        return setorRepository.findAll();
    }

    public Optional<Setor> buscarPorId(Long id){
        return setorRepository.findById(id);
    }

    public void removerPorId(Long id){
        setorRepository.deleteById(id);
    }

}
