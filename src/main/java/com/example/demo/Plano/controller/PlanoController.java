package com.example.demo.Plano.controller;

import com.example.demo.Plano.PlanoService;
import com.example.demo.Plano.model.Plano;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping
@RestController
public class PlanoController {

	private final PlanoService planoService;

	@Autowired
	public PlanoController(PlanoService planoService) {
		this.planoService = planoService;
	}

	@PostMapping(path = "/plano/salvarPlano")
	public void criarPlano(@RequestBody Plano plano) {
		planoService.criarPlanos(plano);
	}

	@GetMapping(path = "/plano/getPlano")
	public List<Plano> getPlanos() {
		return (List<Plano>) planoService.getPlanos();
	}

	@DeleteMapping(path = "{planoId}")
	public void deletePlano(@PathVariable("planoId") Long planoId) {
		planoService.deletePlano(planoId);
	}
}
