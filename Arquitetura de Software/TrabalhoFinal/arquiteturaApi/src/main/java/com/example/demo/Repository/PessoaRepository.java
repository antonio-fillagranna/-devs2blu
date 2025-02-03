package com.example.demo.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.Entity.Pessoa;

public interface PessoaRepository extends JpaRepository<Pessoa, Long>{
}
