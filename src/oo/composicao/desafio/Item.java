package oo.composicao.desafio;

public class Item {
	public Produto produto;
	int quantidade;
	Compra compra;
	
	Item(String nome, int quantidade, double preco){
		this(new Produto(nome,preco),quantidade);
	}
	Item(Produto produto,int quantidade){
		this.produto = produto;
		this.quantidade = quantidade;
	}
}
