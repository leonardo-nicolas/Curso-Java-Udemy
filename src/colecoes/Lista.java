package colecoes;

import java.util.ArrayList;
import java.util.List;

public class Lista {
	public static void main(String[] args) {
		List<Usuario> lista = new ArrayList<Usuario>();
		Usuario rasputia = new Usuario("Rasputia");
		lista.add(rasputia);
		var raimunda = new Usuario("Raimunda");
		lista.add(raimunda);
		lista.add(new Usuario("Margarida"));
		
		Usuario jacinto = new Usuario("Jacinto");
		lista.add(jacinto);
		var crisostomo = new Usuario("Crisóstomo");
		lista.add(crisostomo);
		lista.add(new Usuario("Cidraque"));
		
		
		System.out.println(lista.get(3));
		System.out.println("removido >>> " + lista.remove(1));
		System.out.println(lista.remove(new Usuario("Crisóstomo")));
		
		System.out.println("Rasputia existe? " + lista.contains(new Usuario("Rasputia")));
		
		for(Usuario u: lista) {
			System.out.println(u.nome);
		}
	}
}
