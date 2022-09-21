package colecoes;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoBaguncado {
	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static void main(String[] args) {
		// Hashset permite tipagens diferentes, mas NÃO PERMITE valores iguais.
		// Se tiver String/Character no meio, haverá diferenciação de maiúscula e minúscula pra determinar igualdade.
		HashSet conjunto = new HashSet();
		conjunto.add(1.2);
		conjunto.add(true);
		conjunto.add("Teste");
		conjunto.add(1);
		conjunto.add(2L);
		conjunto.add('x');
		
		System.out.println("O tamanho é " + conjunto.size()); // 6
		
		conjunto.add("Teste");
		conjunto.add('x');
		
		System.out.println("O tamanho é " + conjunto.size()); // Permanece 6, por ter adc repetidos
		
		System.out.println(conjunto.remove("teste")); // false, não existe "teste" com T em minúsculo.
		System.out.println(conjunto.remove("Teste")); // true, existe "Teste" com T em minúsculo.
		System.out.println(conjunto.remove('x')); // true, por existir apenas uma letra X e em minúsculo.
		
		System.out.println("O tamanho é " + conjunto.size()); // 4, por remover alguns itens...
		
		System.out.println(conjunto.contains('x')); // false, pois a letra X em minúsculo FOI REMOVIDA.
		System.out.println(conjunto.contains(1)); // true, por justamente existir o nº 1 e do tipo INTEGER mesmo!
		System.out.println(conjunto.contains(true)); // true, pois existe um true no conjunto...
		
		Set nums = new HashSet();
		nums.add(1);
		nums.add(2);
		nums.add(3);
		
		System.out.println(nums); // [1, 2, 3]
		System.out.println(conjunto); // [1.2, 1, 2, true]
		// conjunto.addAll(nums); // União dos elementos.
		conjunto.retainAll(nums); // Interseção dos elementos.
		System.out.println(conjunto); // O valor muda de acordo com o contexto...
		conjunto.clear();
		System.out.println(conjunto); // []
		
		
		
		
	}
}
