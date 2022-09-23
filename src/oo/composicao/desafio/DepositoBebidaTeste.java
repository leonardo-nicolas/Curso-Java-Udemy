package oo.composicao.desafio;

public class DepositoBebidaTeste {
	public static void main(String[] args) {
		Cliente leonardo = new Cliente("Leonardo",27);
		leonardo.comprar(new Item("Cerveja",10,2.8), new Estabelecimento("Depósito do Sr José"));
		leonardo.comprar(new Item("Champagne",2,99.8), new Estabelecimento("Depósito do Sr José"));
		leonardo.comprar(new Item("Whisky",1,149.9), new Estabelecimento("Depósito do Sr José"));
		
		System.out.println(leonardo.obterValorTotal());
	}
}
