package colecoes;


public class Usuario {
	String nome;

	public Usuario(String nome) {
		this.nome = nome;
	}	
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((nome == null) ? 0 : nome.length());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Usuario other = (Usuario) obj;
		return this.nome.equals(other.nome);
	}
	
	public String toString() {
		return "Meu nome é " + this.nome;
	}
	
}
