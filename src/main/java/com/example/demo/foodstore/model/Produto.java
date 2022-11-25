package com.example.demo.foodstore.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class Produto {
  @Id
  @GeneratedValue(strategy= GenerationType.AUTO)
  private Long id;

  private String nome;
  private String descricao;
  private Integer quantidade;
  private Double valor;

  public Produto() {
  }

  public Produto(Long id, String nome, String descricao, Integer quantidade, Double valor) {
    this.id = id;
    this.nome = nome;
    this.descricao = descricao;
    this.quantidade = quantidade;
    this.valor = valor;
  }

  public String getNome() {
    return nome;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  public String getDescricao() {
    return descricao;
  }

  public void setDescricao(String descricao) {
    this.descricao = descricao;
  }

  public Integer getQuantidade() {
    return quantidade;
  }

  public void setQuantidade(Integer quantidade) {
    this.quantidade = quantidade;
  }

  public Double getValor() {
    return valor;
  }

  public void setValor(Double valor) {
    this.valor = valor;
  }

  @Override
  public String toString() {
    return "Produto{" +
        "id=" + id +
        ", nome='" + nome + '\'' +
        ", descricao='" + descricao + '\'' +
        ", quantidade=" + quantidade +
        ", valor=" + valor +
        '}';
  }
}
