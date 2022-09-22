package oo.composicao;

public class Carro {
	final Motor motor;
	
	Carro(Motor carro){
		this.motor = carro;
	}
	
	Carro(){
		this.motor = new Motor(this);
	}
	
	void acelerar() {
		motor.fatorInjecao += motor.fatorInjecao <= 2.6 ? 0.4 : 0.0;
	}
	
	void frear() {
		motor.fatorInjecao -= motor.fatorInjecao >= 0.5 ? 0.4 : 0.0;
	}
	void ligar() {
		motor.ligado = true;
	}
	void desligar() {
		motor.ligado = false;
	}
	boolean estaLigado() {
		return motor.ligado;
	}
}
