package classe.desafios;

public class Pessoa {
	String nome;
	Double peso;
	
	Pessoa(String nome, double peso){
		this.nome = nome;
		this.peso = peso;
	}
	
	void comer(Comida c) {
		if(c != null) {
			this.peso += c.peso;
		}
	}
}
