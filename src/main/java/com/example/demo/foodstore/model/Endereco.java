package com.example.demo.foodstore.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class Endereco {
  @Id
  @GeneratedValue(strategy= GenerationType.AUTO)
  private Long id;

  private String rua;
  private String complemento;
  private Integer numero;

  public Endereco() {
  }

  public Endereco(Long id, String rua, String complemento, Integer numero) {
    this.id = id;
    this.rua = rua;
    this.complemento = complemento;
    this.numero = numero;
  }

  public String getRua() {
    return rua;
  }

  public void setRua(String rua) {
    this.rua = rua;
  }

  public String getComplemento() {
    return complemento;
  }

  public void setComplemento(String complemento) {
    this.complemento = complemento;
  }

  public Integer getNumero() {
    return numero;
  }

  public void setNumero(Integer numero) {
    this.numero = numero;
  }

  @Override
  public String toString() {
    return "Endereço{" +
        "id=" + id +
        ", rua='" + rua + '\'' +
        ", complemento='" + complemento + '\'' +
        ", numero=" + numero +
        '}';
  }
}
