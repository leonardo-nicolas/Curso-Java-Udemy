package controle.exerciciosFinais;

public class ExercicioFinal9MaiorNumero {
	public static void main(String[] args) {
		var entrada = new java.util.Scanner(System.in);
		
		int maiorNumero = 0;
		
		for(int ordem = 1; ordem <= 10; ordem++) {
			System.out.printf("Informe o %dº valor: ",ordem);
			int valor = entrada.nextInt();
			if(valor > maiorNumero) maiorNumero = valor;
			System.out.printf(
				"O %dº valor é %d e o maior valor até agora é %d.\n",
				ordem, valor, maiorNumero
			);
		}
				
		entrada.close();
	}
}
