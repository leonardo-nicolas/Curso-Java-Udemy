package oo.composicao;

public class Motor {
	
	final Carro carro;
	
	double fatorInjecao = 1.0;
	boolean ligado = false;
	
	Motor(Carro carro){
		this.carro = carro;
	}
	
	int giros() {
		return ligado ? (int)Math.round(fatorInjecao * 3000) : 0;
	}
}
