package classe;

public class Usuario {
	String nome;
	String email;
	int idade;
	
	@Override()
	public boolean equals(Object obj) {
		if(!(obj instanceof Usuario))
			return false;
		Usuario outro = (Usuario)obj;
		boolean nomeIgual = outro.nome.equals(nome);
		boolean emailIgual = outro.email.equals(email);
		boolean idadeIgual = outro.idade == idade;
		
		return nomeIgual && emailIgual && idadeIgual;
	}
	
	@Override()
	public int hashCode() {
		return nome.length() + idade;
	}
}
