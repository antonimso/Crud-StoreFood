package com.example.demo.foodstore.service;

import com.example.demo.foodstore.model.Endereco;
import com.example.demo.foodstore.repository.EnderecoRepository;
import org.springframework.stereotype.Service;

@Service
public class EnderecoService {
  private final EnderecoRepository enderecoRepository;

  public EnderecoService(
      EnderecoRepository enderecoRepository) {
    this.enderecoRepository = enderecoRepository;
  }

  public Object getEnderecos() {
    return enderecoRepository.findAll();
  }

  public void criarEndereco(Endereco endereco) {
    enderecoRepository.save(endereco);
  }

  public void deleteEndereco(Long planoId) {
    enderecoRepository.deleteById(planoId);
  }
}
