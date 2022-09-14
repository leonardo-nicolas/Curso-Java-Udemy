package classe;

public class ProdutoTeste {
	public static void main(String[] args) {

		Produto p1 = new Produto("Notebook");
		//p1.nome = "Notebook";
		p1.preco = 14989.86;
		
		var p2 = new Produto("Caneta vermelha", 0.80);
		
		System.out.print(p1.nome);
		System.out.println("; Preço com desconto : " + p1.precoComDesconto());
		System.out.print(p2.nome);
		System.out.println("; Preço com desconto : " + p2.precoComDesconto());
	}
}
