package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

import entities.Produto;
import model.services.ServicoProduto;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		List<Produto>lista = new ArrayList<>();
		
		lista.add(new Produto("TV", 900.00));
		lista.add(new Produto("Mouse", 50.00));
		lista.add(new Produto("Tablet", 350.00));
		lista.add(new Produto("HD Case", 80.90));
		
		ServicoProduto ps = new ServicoProduto();
		//Agora passando tambem i criterio para soma dos valores
		double soma = ps.filteredSum(lista,p->p.getNome().charAt(0)=='T');
		
		System.out.println("Soma = "+String.format("%.2f", soma));
		
	}

}
