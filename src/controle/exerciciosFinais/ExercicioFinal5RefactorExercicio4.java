package controle.exerciciosFinais;

public class ExercicioFinal5RefactorExercicio4 {
	public static void main(String[] args) {
		var entrada = new java.util.Scanner(System.in);

		System.out.print("Digite um número INTEIRO: ");
		int num = entrada.nextInt();
		boolean ePrimo = true;
		buscaNumPrimos:
		for (int i = 2; i < num; ++i) {
			int restoDiv = num % i;
			switch(restoDiv) {
			case 0:
				ePrimo = false;
				break buscaNumPrimos;
			default:
				ePrimo = true;
				break;
			}
		}
		
		if(ePrimo) 
			System.out.printf("O número %d é um número primo!",num);
		else
			System.out.printf("O número %d não é um número primo!",num);		

		entrada.close();
	}
}
