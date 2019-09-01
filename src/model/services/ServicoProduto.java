package model.services;

import java.util.List;
import java.util.function.Predicate;

import entities.Produto;

public class ServicoProduto {
	
	//metodo soma filtrada recebendo um predicado como parametro
	public double filteredSum(List<Produto> list,Predicate<Produto> criterio) {
		double sum = 0.0;
		for(Produto p: list) {
			if(criterio.test(p)) {
				sum += p.getPreco();
			}
		}
		return sum;
	}
	

}
