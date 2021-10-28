package com.example.demo.Plano;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PlanoService {

	private PlanoRepository planoRepository;
	private double valorPorMinuto;

	@Autowired
	public PlanoService(PlanoRepository planoRepository) {
		this.planoRepository = planoRepository;
	}

	public List<Plano> getPlanos() {
		return planoRepository.findAll();
	}

	public void criarPlanos(Plano plano) {
		escolhePlano(plano);
		planoRepository.save(plano);
	}

	public void deletePlano(Long planoId) {
		planoRepository.deleteById(planoId);
	}

	private void escolhePlano(Plano plano) {
			switch (plano.getNome()) {
			case "FaleMais 30" :
				calculaPlano30(plano);
				break;
			case "FaleMais 60":
				calculaPlano60(plano);
				break;
			case "FaleMais 120":
				calculaPlano120(plano);
				break;
			default:
				break;
		}
	}

	private void calculaPlano30(Plano plano) {
		verificaOrigemDestino(plano);
		if (plano.getTempo() <= 30) {
			verificaOrigemDestino(plano);
			plano.setValorComPlano(0);
			plano.setValorSemPlano(plano.getTempo()*valorPorMinuto);
		} else {
			plano.setValorComPlano(plano.getTempo()*(valorPorMinuto*0.1));
			plano.setValorSemPlano(plano.getTempo()*valorPorMinuto);
		}
	}

	private void calculaPlano60(Plano plano) {
		verificaOrigemDestino(plano);
		if (plano.getTempo() <= 60) {
			plano.setValorComPlano(0);
			plano.setValorSemPlano(plano.getTempo()*valorPorMinuto);
		} else {
			plano.setValorComPlano(plano.getTempo()*(valorPorMinuto*0.1));
			plano.setValorSemPlano(plano.getTempo()*valorPorMinuto);
		}
	}

	private void calculaPlano120(Plano plano) {
		verificaOrigemDestino(plano);
		if (plano.getTempo() <= 120) {
			plano.setValorComPlano(0);
			plano.setValorSemPlano(plano.getTempo()*valorPorMinuto);
		} else {
			plano.setValorComPlano(plano.getTempo()*(valorPorMinuto*0.1));
			plano.setValorSemPlano(plano.getTempo()*valorPorMinuto);
		}
	}
	
	private void verificaOrigemDestino(Plano plano) {
		String origin = plano.getOrigem();
		String destiny = plano.getDestino();
		if(origin == "011" &&  destiny == "016" ) {
			valorPorMinuto = 1.9;
		}else if(origin == "016" &&  destiny == "011") {
			valorPorMinuto = 2.9;
		}else if(origin == "011" &&  destiny == "017") {
			valorPorMinuto = 1.7;
		}else if(origin == "017" &&  destiny == "011") {
			valorPorMinuto = 2.7;
		}else if(origin == "011" &&  destiny == "018") {
			valorPorMinuto = 0.9;
		}else if(origin == "018" &&  destiny == "011") {
			valorPorMinuto = 1.9;
		}
	}
}
