package colecoes;

import java.util.ArrayDeque;
import java.util.Deque;

public class Pilha {
	public static void main(String[] args) {
		Deque<String> pratos = new ArrayDeque<>();
		
		//add -> Retorna true ou false, dependendo da capacidade.
		pratos.add("prato fundo amarelo");
		pratos.add("prato fundo azul");
		pratos.add("prato fundo verde");
		pratos.add("prato fundo transparente");
		//push -> Causa erro, caso ultrapasse sua capacidade...
		pratos.push("prato raso amarelo");
		pratos.push("prato raso azul");
		pratos.push("prato raso verde");
		pratos.push("prato raso transparente");
		
		// peek e element -> obtém o próximo SEM REMOVER.
		// Pilha vazia peek retorna null
		System.out.println(pratos.peek());
		System.out.println(pratos.peek());
		// Pilha vazia, element causa erro.
		System.out.println(pratos.element());
		System.out.println(pratos.element());
		
		// Quantidade de itens na Pilha
		System.out.println(pratos.size());
		// Indica se existe alguma coisa na Pilha...
		System.out.println(pratos.isEmpty());
		
		// poll chama próximo da Pilha e remove-o
		// Se não tiver mais nada na Pilha, retorna null.
		System.out.println(pratos.poll());
		
		// Pega o próximo da Pilha e remove-o
		// Se não tiver mais nada na Pilha, causa erro.
		System.out.println(pratos.remove());
		System.out.println(pratos.pop());
		
		// Neste caso abaixo, indica se Leonardo está na Pilha, com true ou false...
		System.out.println(pratos.contains("Prato raso vermelho"));
		
		while(!pratos.isEmpty()) // Este While aqui foi um auto-desafio SIMPLES
			System.out.println(pratos.poll());
		
		pratos.clear(); // limpa toda Pilha.
	}
}
