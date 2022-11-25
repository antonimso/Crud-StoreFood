package com.example.demo.foodstore.service;

import com.example.demo.foodstore.model.Produto;
import com.example.demo.foodstore.repository.ProdutoRepository;
import org.springframework.stereotype.Service;

@Service
public class ProdutoService {
  private final ProdutoRepository planoRepository;

  public ProdutoService(ProdutoRepository planoRepository) {
    this.planoRepository = planoRepository;
  }

  public Object getProdutos() {
    return planoRepository.findAll();
  }

  public void criarProduto(Produto produto) {
    planoRepository.save(produto);
  }

  public void deleteProduto(Long planoId) {
    planoRepository.deleteById(planoId);
  }
}
