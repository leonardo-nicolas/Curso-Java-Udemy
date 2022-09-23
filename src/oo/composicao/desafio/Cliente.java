package oo.composicao.desafio;

import java.util.ArrayList;
import java.util.List;

public class Cliente {
	String nome;
	String email;
	String cpf;
	String telefone;
	int idade;
	Endereco endereco;
	Cliente(String nome, int idade){
		this.nome = nome;
		this.idade = idade;
	}
	
	final List<Compra> listaDeCompras = new ArrayList<Compra>();
	
	double obterValorTotal() {
		double somatorioTotal = 0;
		
		for(Compra compra: listaDeCompras) {
			for(Item item: compra.itens) {
				somatorioTotal += item.produto.preco * item.quantidade;
			}
		}
		
		return somatorioTotal;
	}
	
	void comprar(Item item, Estabelecimento estabelecimento) {
		Compra compra = new Compra(this);
		item.compra = compra;
		compra.addAoCarrinho(item);
		listaDeCompras.add(compra);
	}
	
	public int hashCode() {
		return nome.length() + cpf.length() + email.length() + telefone.length();
	}
	
	public String toString() {
		return nome.trim();
	}
}
