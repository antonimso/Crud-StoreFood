package com.example.demo.foodstore.controller;

import com.example.demo.foodstore.model.Endereco;
import com.example.demo.foodstore.model.Produto;
import com.example.demo.foodstore.service.EnderecoService;
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
public class EnderecoController {
  private final EnderecoService enderecoService;

  public EnderecoController(EnderecoService enderecoService) {
    this.enderecoService = enderecoService;
  }

  @PostMapping(path = "/endereco/salvarendereco")
  public void criarPlano(@RequestBody Endereco endereco) {
    enderecoService.criarEndereco(endereco);
  }

  @GetMapping(path = "/endereco/getendereco")
  public List<Produto> getPlanos() {
    return (List<Produto>) enderecoService.getEnderecos();
  }

  @DeleteMapping(path = "/endereco/{enderecoId}")
  public void deletePlano(@PathVariable("enderecoId") Long planoId) {
    enderecoService.deleteEndereco(planoId);
  }
}
