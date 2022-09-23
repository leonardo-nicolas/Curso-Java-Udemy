package oo.composicao;

public class MercadoTeste {
	public static void main(String[] args) {
		Compra mercado = new Compra();
		mercado.cliente = "Leonardo Nicolas";
		// 2 maneiras para relação bidirecionais
		mercado.addAoCarrinho("Peito de frango kg",12.345,5.79);
		mercado.addAoCarrinho("Carne moída kg", 0.951, 12.43);
		mercado.addAoCarrinho("Linguiça calabresa kg",2.497,7.93);
		mercado.addAoCarrinho(new Item("Arroz 5kg pct",1,12.99));
		mercado.addAoCarrinho(new Item("Feijão 1kg pct",2, 5.97));
		mercado.addAoCarrinho(new Item("Café 500g pct",2,12.98));
		mercado.addAoCarrinho(new Item("Acúcar 1kg pct",2,3.99));
		mercado.addAoCarrinho("Margarina 500g pote",4,4.82);
		mercado.addAoCarrinho(new Item("Papel Toalha",5,2.49));
		mercado.addAoCarrinho("Papel Higiênico c/4",5,2.96);
		mercado.addAoCarrinho(new Item("Guardanapo",15,0.59));
		mercado.addAoCarrinho("Sabão em pó 2,5kg und", 2,7.99);
		mercado.addAoCarrinho("biscoitos recheados",25,2.39);
		
		// Relação Unidirecional
		mercado.itens.add(new Item("Sabonete",13,0.57));
		mercado.itens.add(new Item("Leite integral",24,2.98));
		
		System.out.println(mercado.itens.size());
		System.out.println("Total: " + mercado.obterValorTotal());
		System.out.println("Qtd de itens comprados: " + mercado.obterQtdItens());
	}
}
