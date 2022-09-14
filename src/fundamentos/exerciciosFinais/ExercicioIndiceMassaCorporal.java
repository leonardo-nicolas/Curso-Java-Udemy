package fundamentos.exerciciosFinais;

import java.util.Scanner;

public class ExercicioIndiceMassaCorporal {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Vamos te guiar para calcular seu índice de massa corporal.\n");
		System.out.println("Informe os dados solicitados abaixo e, digite APENAS NÚMEROS e para as casas decimais, utilize APENAS VÍRGULAS.");
		
		System.out.print("Primeiro informe seu peso: ");
		double peso = entrada.nextDouble();
		
		System.out.print("Agora informe sua altura: ");
		double altura = entrada.nextDouble();
		
		double imc = peso / Math.pow(altura, 2);
		
		String situacao = imc < 18.5 ? "magreza" : null;
		situacao = imc >= 18.5 && imc < 25 ? "normal" : situacao;
		situacao = imc >= 25 && imc < 30 ? "sobrepeso" : situacao;
		situacao = imc >= 30 && imc < 40 ? "obesidade" : situacao;
		situacao = imc >= 40 ? "obesidade mórbida" : situacao;
		
		System.out.printf("Seu Índice de Massa Corporal (IMC) é: %fkg/m² e a sua situação é %s.",imc,situacao);
		
		entrada.close();
	}
}
