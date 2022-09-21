package colecoes;

import java.util.LinkedList;
import java.util.Queue;

public class Fila {
	public static void main(String[] args) {
		// Fila - usa sistema FIFO (inglês) ou PEPS (português)
		Queue<String> fila = new LinkedList<String>();

		// add causa erro, se passar de x pessoas
		fila.add("Maria");
		fila.add("Gabriel");
		fila.add("Bianca");
		// offer Não causa erro, mas retorna false caso não seja adc.
		fila.offer("Janaína"); 
		fila.offer("Rafael");
		fila.offer("Felipe");
		
		// peek e element -> obtém o próximo SEM REMOVER.
		// Fila vazia peek retorna null
		System.out.println(fila.peek());
		System.out.println(fila.peek());
		// fila vazia, element causa erro.
		System.out.println(fila.element());
		System.out.println(fila.element());
		
		// Quantidade de itens na fila
		System.out.println(fila.size());
		// Indica se existe alguma coisa na fila...
		System.out.println(fila.isEmpty());
		
		// poll chama próximo da fila e remove-o
		// Se não tiver mais nada na fila, retorna null.
		System.out.println(fila.poll());
		
		// Pega o próximo da fila e remove-o
		// Se não tiver mais nada na fila, causa erro.
		System.out.println(fila.remove());
		
		// Neste caso abaixo, indica se Leonardo está na fila, com true ou false...
		System.out.println(fila.contains("Leonardo"));
		
		while(!fila.isEmpty()) // Este While aqui foi um auto-desafio SIMPLES
			System.out.println(fila.poll());
		
		fila.clear(); // limpa toda fila.
	}
}
