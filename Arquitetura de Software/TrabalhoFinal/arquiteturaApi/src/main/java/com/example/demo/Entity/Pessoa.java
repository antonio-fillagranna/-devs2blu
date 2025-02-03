package com.example.demo.Entity;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import jakarta.persistence.PrimaryKeyJoinColumn;
import jakarta.persistence.Table;

@Entity
@Table(name = "tb_pessoa")

public class Pessoa {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@PrimaryKeyJoinColumn
	private long id;
	
	@Column
	private String nome;

	@OneToOne(cascade = CascadeType.ALL)
	private Setor setor;
	
	@OneToMany(cascade = CascadeType.ALL)
	@JoinColumn(name = "PESSOA_ID ")
	private List<Contato> contato;
	
	@OneToMany(cascade = CascadeType.ALL)
	@JoinColumn(name = "PESSOA_ID ")
	private List<Endereco> endereco;
	
	@OneToMany(cascade = CascadeType.ALL)
	@JoinColumn(name = "PESSOA_ID ")
	private List<Documento> documento;
	
	@Column
	private double salario;
	
	@Column
	private String dataNascimento;
	
	@Column
	private String inscricaoFederal;
	
	public Pessoa() {
	}
	
	public Pessoa(String nome, Setor setor, double salario, String dataNascimento,
			String inscricaoFederal, List<Contato> contato, List<Endereco> endereco,List<Documento> documento) {
		super();
		this.documento = documento;
		this.endereco = endereco;
		this.contato = contato;
		this.nome = nome;
		this.setor = setor;
		this.salario = salario;
		this.dataNascimento = dataNascimento;
		this.inscricaoFederal = inscricaoFederal;
	}

	public Pessoa(long id, String nome, Setor setor, double salario, String dataNascimento, String inscricaoFederal,
			List<Contato> contato, List<Endereco> endereco,List<Documento> documento) {
		super();
		this.documento = documento;
		this.endereco = endereco;
		this.contato = contato;
		this.id = id;
		this.nome = nome;
		this.setor = setor;
		this.salario = salario;
		this.dataNascimento = dataNascimento;
		this.inscricaoFederal = inscricaoFederal;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Setor getSetor() {
		return setor;
	}

	public void setSetor(Setor setor) {
		this.setor = setor;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

	public String getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(String dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

	public String getInscricaoFederal() {
		return inscricaoFederal;
	}

	public void setInscricaoFederal(String inscricaoFederal) {
		this.inscricaoFederal = inscricaoFederal;
	}

	public long getId() {
		return id;
	}

	public List<Contato> getContato() {
		return contato;
	}
	
	public void setContato(List<Contato> contato) {
		this.contato = contato;
	}
	
	public void setEndereco(List<Endereco> endereco) {
		this.endereco = endereco;
	}
	
	public List<Endereco> getEndereco() {
		return endereco;
	}

	public List<Documento> getDocumento() {
		return documento;
	}
	
	public void setDocumento(List<Documento> documento) {
		this.documento = documento;
	}
	
	@Override
	public String toString() {
		return "Pessoa [id=" + id + ", nome=" + nome + ", setor=" + setor + ", contato=" + contato + ", endereco="
				+ endereco + ", documento=" + documento + ", salario=" + salario + ", dataNascimento=" + dataNascimento
				+ ", inscricaoFederal=" + inscricaoFederal + "]";
	}
	
}
