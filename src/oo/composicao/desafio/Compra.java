package oo.composicao.desafio;

import java.util.ArrayList;

public class Compra {
	Estabelecimento estabelecimento;
	Cliente cliente;
	final ArrayList<Item> itens;
	
	Compra(){
		itens = new ArrayList<Item>();
	}
	Compra(Cliente cliente){
		this();
		this.cliente = cliente;
	}
	
	
	
	double obterValorTotal(Estabelecimento estabelecimento) {
		double total = 0;
		for(Item item: itens) {
			if(this.estabelecimento == estabelecimento)
				total += item.produto.preco * item.quantidade;
		}
		return total;
	}
	
	void addAoCarrinho(Item item) {
		itens.add(item);
		item.compra = this;
	}
	
	void addAoCarrinho(String nome, int quantidade, double preco) {
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
