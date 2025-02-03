package com.example.demo.Service;

import com.example.demo.Entity.Documento;
import com.example.demo.Repository.DocumentoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class DocumentoService {

    @Autowired
    private DocumentoRepository documentoRepository;

    public void salvar(Documento documento){
        documentoRepository.save(documento);
    }

    public void salvarTodos(List<Documento> documentos){
        documentoRepository.saveAll(documentos);
    }

    public List<Documento> listaDocumento(){
        return documentoRepository.findAll();
    }

    public Optional<Documento> buscarPorId(Long id){
        return documentoRepository.findById(id);
    }

    public void removerPorId(Long id){
        documentoRepository.deleteById(id);
    }
}
