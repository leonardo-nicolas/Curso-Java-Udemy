package colecoes;

import java.util.HashSet;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;


public class ConjuntoComportado {
	public static void main(String[] args) {
		SortedSet<String> listaAprovados = new TreeSet<String>();
		listaAprovados.add("Nazaré");
		listaAprovados.add("Rasputia");
		listaAprovados.add("Tiburça");
		listaAprovados.add("Gertrutes");
		listaAprovados.add("Félix");
		listaAprovados.add("Agno");
		listaAprovados.add("Ana");
		
		System.out.println(listaAprovados);
		
		Set<Integer> nums = new HashSet<>();
		nums.add(1);
		nums.add(2);
		nums.add(120);
		nums.add(6);
		
		for(int n: nums) {
			System.out.println(n);
		}
	}
}
