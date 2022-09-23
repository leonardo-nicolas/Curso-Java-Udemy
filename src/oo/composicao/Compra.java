package oo.composicao;

import java.util.ArrayList;

public class Compra {
	
	String cliente;
	ArrayList<Item> itens = new ArrayList<Item>();
	
	double obterValorTotal() {
		double total = 0;
		for(Item item: itens) {
			total += item.preco * item.quantidade;
		}
		return total;
	}
	
	void addAoCarrinho(Item item) {
		itens.add(item);
		item.compra = this;
	}
	
	void addAoCarrinho(String nome, double quantidade, double preco) {
		this.addAoCarrinho(new Item(nome,quantidade,preco));
	}
	
	int obterQtdItens() {
		int contador = 0;
		for(Item item: itens) {
			contador += (int) Math.round(item.quantidade);
		}
		return contador;
	}
}
