package colecoes;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class Mapa {
	public static void main(String[] args) {
		Map<Integer, String> usuarios = new HashMap<>();
		usuarios.put(1, "Jaqueline");
		usuarios.put(2,	"Diego");
		usuarios.put(3,	"Vanessa");
		usuarios.put(4,	"Rafael");
		
		System.out.println(usuarios.size());
		System.out.println(usuarios.isEmpty());
		
		System.out.println(usuarios.keySet());
		System.out.println(usuarios.values());
		System.out.println(usuarios.entrySet());
		
		System.out.println(usuarios.containsKey(3));
		System.out.println(usuarios.containsValue("Diego"));
		
		System.out.println(usuarios.get(1));
		
		System.out.println();
		for(int chave: usuarios.keySet()) {
			System.out.println(chave);
		}
		System.out.println();
		for(String valor: usuarios.values()) {
			System.out.println(valor);
		}
		System.out.println();
		for(Entry<Integer, String> registroAtual: usuarios.entrySet()) {
			System.out.print(registroAtual.getKey());
			System.out.print(" >>> ");
			System.out.println(registroAtual.getValue());
		}
	}
}
