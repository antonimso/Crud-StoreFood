package com.example.demo.Plano;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table
public class Plano {
	
	@Id
	@SequenceGenerator(
			name = "student_sequence",
			sequenceName = "student_sequence",
			allocationSize = 1
			)
	@GeneratedValue(
			strategy = GenerationType.SEQUENCE,
			generator = "student_sequence"
			)
	private Long id;
	
	private String nome;
	private String origem;
	private String destino;
	private Integer tempo;
	private double valorComPlano;
	private double valorSemPlano;
	
	public Plano() {
		
	}

	public Plano(Long id, String nome, String origem, String destino, Integer tempo, double valorComPlano,
			double valorSemPlano) {
		this.id = id;
		this.nome = nome;
		this.origem = origem;
		this.destino = destino;
		this.tempo = tempo;
		this.valorComPlano = valorComPlano;
		this.valorSemPlano = valorSemPlano;
	}

	public Plano(String nome, String origem, String destino, Integer tempo, double valorComPlano, double valorSemPlano) {
		this.nome = nome;
		this.origem = origem;
		this.destino = destino;
		this.tempo = tempo;
		this.valorComPlano = valorComPlano;
		this.valorSemPlano = valorSemPlano;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getOrigem() {
		return origem;
	}

	public void setOrigem(String origem) {
		this.origem = origem;
	}

	public String getDestino() {
		return destino;
	}

	public void setDestino(String destino) {
		this.destino = destino;
	}

	public Integer getTempo() {
		return tempo;
	}

	public void setTempo(Integer tempo) {
		this.tempo = tempo;
	}

	public double getValorComPlano() {
		return valorComPlano;
	}

	public void setValorComPlano(double valorComPlano) {
		this.valorComPlano = valorComPlano;
	}

	public double getValorSemPlano() {
		return valorSemPlano;
	}

	public void setValorSemPlano(double valorSemPlano) {
		this.valorSemPlano = valorSemPlano;
	}

	@Override
	public String toString() {
		return "Plano [id=" + id + ", nome=" + nome + ", origem=" + origem + ", destino=" + destino + ", tempo="
				+ tempo + ", comPlano=" + valorComPlano + ", semPlano=" + valorSemPlano + "]";
	}

}
