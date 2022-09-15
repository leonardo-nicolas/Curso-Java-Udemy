package classe.desafios;

public class Jantar {
	public static void main(String[] args) {
		// Instanciar 1 pessoa e 2 comidas, além de fazer com que a pessoa coma a comida
		// Pessoa: Nome, peso, comer(Comida c) -> Peso da comida adc ao peso da pessoa
		// Comida: nome, peso; instanciar Arroz e feijão
		
		Pessoa leonardo = new Pessoa("Leonardo", 61.5);
		
		Comida arroz = new Comida("Arroz", 0.100);
		Comida feijao = new Comida("Feijão", 0.050);
		Comida salada = new Comida("Salada de Alface e Tomate", 0.005);
		
		System.out.printf("%s atualmente pesa %f\n", leonardo.nome, leonardo.peso);
		leonardo.comer(arroz);
		System.out.printf("%s comeu %s e agora pesa %f\n", leonardo.nome, arroz.nome, leonardo.peso);
		leonardo.comer(feijao);
		System.out.printf("%s comeu %s e agora pesa %f\n", leonardo.nome, feijao.nome, leonardo.peso);
		leonardo.comer(salada);
		System.out.printf("%s comeu %s e agora pesa %f\n", leonardo.nome, salada.nome, leonardo.peso);
	}
}
