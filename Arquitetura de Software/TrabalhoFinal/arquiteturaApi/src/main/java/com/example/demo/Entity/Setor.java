package com.example.demo.Entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "tb_setor")
public class Setor {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;

	@Column
	private String Cargo;

	@Column
	private String cargaHoraria;

	public Setor() {
	}

	public Setor( String cargo, String cargaHoraria) {
		super();
		this.Cargo = cargo;
		this.cargaHoraria = cargaHoraria;
	}

	public Setor(Long id, String cargo, String cargaHoraria) {
		super();
		this.id = id;
		this.Cargo = cargo;
		this.cargaHoraria = cargaHoraria;
	}

	public String getCargo() {
		return Cargo;
	}

	public void setCargo(String cargo) {
		Cargo = cargo;
	}

	public String getCargaHoraria() {
		return cargaHoraria;
	}

	public void setCargaHoraria(String cargaHoraria) {
		this.cargaHoraria = cargaHoraria;
	}

	public Long getId() {
		return id;
	}

	@Override
	public String toString() {
		return "Setor [id=" + id + ", Cargo=" + Cargo + ", cargaHoraria=" + cargaHoraria + "]";
	}
}