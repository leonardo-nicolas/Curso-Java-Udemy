package classe;

public class EntendendoEqualsNaPratica {
	public static void main(String[] args) {
		Usuario l = new Usuario();
		l.nome = "Leonardo Nicolas";
		l.email = "leonardo@email.com";
		l.idade = 27;
		
		Usuario u = new Usuario();
		u.nome = "Leonardo Nicolas";
		u.email = "leonardo@email.com";
		u.idade = 27;
		
		System.out.println(u == l);
		System.out.println(l.equals(u));
	}
}
