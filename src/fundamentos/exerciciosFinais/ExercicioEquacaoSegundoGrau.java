package fundamentos.exerciciosFinais;

import java.util.Scanner;

public class ExercicioEquacaoSegundoGrau {
	
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Cálculo da equação do segundo grau completa");
		System.out.println("Com a fórmula de Bháskara e tudo...\n");
		System.out.println("Seguindo a formula ax² + bx + c = 0, siga as instruções abaixo:");
		System.out.print("Primeiro informe um valor que represente o ax²: ");
		
		double ax2 = entrada.nextDouble();
		System.out.print("Agora informe um valor que represente o bx: ");
		
		double bx = entrada.nextDouble();
		System.out.print("Por fim, informe um valor que represente o c: ");
		
		double c = entrada.nextDouble();
		System.out.println("Δ = b² - 4.a.c");
		System.out.printf("Δ = %f² - 4 x %f x %f\n",bx,ax2,c);
		
		double delta = Math.pow(bx, 2) - (4 * ax2 * c);
		System.out.printf("Δ = %f\n", delta);
		
		double raizDelta = Math.sqrt(delta);
		double bhaskara1 = (-bx + raizDelta) / (2 * ax2);
		double bhaskara2 = (-bx - raizDelta) / (2 * ax2);
		System.out.printf("√Δ = %f\n", raizDelta);
		System.out.printf("Bhaskara = %f & %f",bhaskara1, bhaskara2);
		
		entrada.close();
	}
}
