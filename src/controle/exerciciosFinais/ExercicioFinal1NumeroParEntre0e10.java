package controle.exerciciosFinais;

public class ExercicioFinal1NumeroParEntre0e10 {
	public static void main(String[] args) {
		var entrada = new java.util.Scanner(System.in);
		
		int numero = -1;
		
		System.out.println("A qualquer momento, informe '-1' para sair!");
		
		while(numero != -1 || !(numero >= 0 && numero <= 10)) {
			System.out.print("Digite um número entre 0 e 10: ");
			numero = entrada.nextInt();
			if(numero >= 0 && numero <= 10) {
				String parImpar = numero % 2 == 0 ? "par" : "ímpar";
				System.out.printf("O número %d é %s.\n",numero, parImpar);
			} else if(numero == -1) {
				break;
			} else {
				System.out.print("Número inválido! ");
			}
		}
		
		System.out.println("Até logo...");
		entrada.close();
	}
}
