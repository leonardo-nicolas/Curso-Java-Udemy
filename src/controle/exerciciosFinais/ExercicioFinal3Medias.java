package controle.exerciciosFinais;

public class ExercicioFinal3Medias {
	public static void main(String[] args) {
		var entrada = new java.util.Scanner(System.in);

		int nota1 = -1, nota2 = -1;
		
		while (!(nota1 >= 0 && nota1 <= 10)) {
			System.out.print("Digite a primeira nota (entre 0 e 10): ");
			nota1 = entrada.nextInt();
			if(!(nota1 >= 0 && nota1 <= 10))
				System.out.print("Nota inválida! ");
		}
		
		while (!(nota2 >= 0 && nota2 <= 10)) {
			System.out.print("Digite a segunda nota (entre 0 e 10): ");
			nota2 = entrada.nextInt();
			if(!(nota2 >= 0 && nota2 <= 10))
				System.out.print("Nota inválida! ");
		}

		double media = (nota1 + nota2) / 2.0;
		
		System.out.println("Média obtida: " + media);
		System.out.print("Situação: ");
		if(media >= 7) {
			System.out.println("Aluno aprovado!!");
		} else if(media > 4 && media < 7) {
			System.out.println("Aluno em recuperação!!");
		} else {
			System.out.println("Aluno reprovado!!");
		}
		
		entrada.close();
	}
}
