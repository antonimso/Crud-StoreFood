package com.example.demo.foodstore.controller;

import com.example.demo.foodstore.model.Produto;
import com.example.demo.foodstore.service.ProdutoService;
import java.util.List;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping
@RestController
@CrossOrigin
public class ProdutoController {
  private final ProdutoService planoservice;

  public ProdutoController(ProdutoService planoservice) {
    this.planoservice = planoservice;
  }

  @PostMapping(path = "/produto/salvarproduto")
  public void criarPlano(@RequestBody Produto produto) {
    planoservice.criarProduto(produto);
  }

  @GetMapping(path = "/produto/getproduto")
  public List<Produto> getPlanos() {
    return (List<Produto>) planoservice.getProdutos();
  }

  @DeleteMapping(path = "{produtoId}")
  public void deletePlano(@PathVariable("produtoId") Long produtoId) {
    planoservice.deleteProduto(produtoId);
  }
}
