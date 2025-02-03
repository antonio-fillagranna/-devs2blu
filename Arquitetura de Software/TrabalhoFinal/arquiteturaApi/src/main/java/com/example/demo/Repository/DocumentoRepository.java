package com.example.demo.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.demo.Entity.Documento;

public interface DocumentoRepository extends JpaRepository<Documento, Long>{

}
