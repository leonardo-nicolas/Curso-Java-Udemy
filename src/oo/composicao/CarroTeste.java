package oo.composicao;

public class CarroTeste {
	public static void main(String[] args) {
		Carro hb20 = new Carro();
		System.out.println("Carro ligado? " + hb20.estaLigado());
		
		hb20.ligar();
		System.out.println("Carro ligado? " +hb20.estaLigado());
		System.out.println(hb20.motor.giros());

		for(int numAceleradas = 1; numAceleradas <= 5; ++numAceleradas)
			hb20.acelerar();
		System.out.println(hb20.motor.giros());
		
		for(int numFreadas = 1; numFreadas <= 9; ++numFreadas)
			hb20.acelerar();
		System.out.println(hb20.motor.giros());
		
		// Relação Bidirecional
		hb20.motor.carro.motor.carro.motor.giros();
	}
}
