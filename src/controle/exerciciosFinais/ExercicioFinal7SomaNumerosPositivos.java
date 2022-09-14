package controle.exerciciosFinais;

public class ExercicioFinal7SomaNumerosPositivos {

	public static void main(String[] args) {
		var entrada = new java.util.Scanner(System.in);

		int numero = 0;
		
		int somatorio = 0;
		System.out.println("Somatório de números positivos...");
		System.out.println("A qualquer momento informe \"-1\" para sair!");
		while(numero >= 0) {
			System.out.print("Digite um número: ");
			numero = entrada.nextInt();
			somatorio += numero > -1 ? numero : 0;
		}

		if(numero < -1) {
			System.out.println("Números negativos não é permitido!");
			System.out.println("Por isso, o programa foi encerrado.");
		}
		
		System.out.println("Resultado do somatório: " + somatorio);
		entrada.close();
	}
}
