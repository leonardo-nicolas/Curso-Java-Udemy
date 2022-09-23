package oo.composicao;

public class Item {
	String nome;
	double quantidade;
	double preco;
	Compra compra;
	
	Item(String nome, double quantidade, double preco){
		this.nome = nome;
		this.preco = preco;
		this.quantidade = quantidade;
	}
}
