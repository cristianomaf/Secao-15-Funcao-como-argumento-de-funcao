package model.services;

import java.util.List;

import entities.Produto;

public class ServicoProduto {
	
	//metodo soma filtrada
	public double filteredSum(List<Produto> list) {
		double sum = 0.0;
		for(Produto p: list) {
			if(p.getNome().charAt(0) == 'T') {
				sum += p.getPreco();
			}
		}
		return sum;
	}
	

}
