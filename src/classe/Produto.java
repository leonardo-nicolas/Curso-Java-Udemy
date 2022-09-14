package classe;

public class Produto {
	
	String nome;
	double preco;
	static double desconto;
	
	Produto(String nomeInicial) {
		this();
		nome = nomeInicial;
	}
	Produto(String nomeInicial, double precoInicial) {
		this(nomeInicial);
		preco = precoInicial;
	}
	Produto(){ 
		super();
		desconto = 0.25;
	}
	
	double precoComDesconto() {
		double totalComDesconto = preco * (1-desconto); 
		//totalComDesconto = preco - totalComDesconto; 
		return totalComDesconto;
	}
}
