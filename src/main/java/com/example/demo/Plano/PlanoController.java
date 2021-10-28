package com.example.demo.Plano;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "api/planos")
public class PlanoController {

	private final PlanoService planoService;

	@Autowired
	public PlanoController(PlanoService planoService) {
		this.planoService = planoService;
	}

	@PostMapping
	public void criarPlano(Plano plano) {
		planoService.criarPlanos(plano);
	}

	@GetMapping
	public List<Plano> getPlanos() {
		return planoService.getPlanos();
	}

	@DeleteMapping(path = "{planoId}")
	public void deletePlano(@PathVariable("planoId") Long planoId) {
		planoService.deletePlano(planoId);
	}
}
