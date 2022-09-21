package colecoes;

import java.util.HashSet;

public class Hash {
	public static void main(String[] args) {
		HashSet<Usuario> usuarios = new HashSet<Usuario>();
		
		usuarios.add(new Usuario("Rafael"));
		usuarios.add(new Usuario("Jackson"));
		usuarios.add(new Usuario("Bianca"));
		usuarios.add(new Usuario("Janaína"));
		usuarios.add(new Usuario("Vanessa"));
		usuarios.add(new Usuario("Jefferson"));
		
		// Existe o HashCode implementado. Por isso, ao procurar "Vanessa", vai achar corretamente.
		boolean resultado = usuarios.contains(new Usuario("Vanessa"));
		System.out.println(resultado); 
	}
}
