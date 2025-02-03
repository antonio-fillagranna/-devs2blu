package com.example.demo.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.Entity.Contato;

public interface ContatoRepository extends JpaRepository<Contato, Long>{


}
