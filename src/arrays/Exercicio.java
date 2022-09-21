package arrays;

import java.util.Arrays;

public class Exercicio {
	
	public static void main(String[] args) {
		// Maneira 1 de se declarar arrays
		double[] notasAlunoA = new double[3];
		notasAlunoA[0] = 7.9;
		notasAlunoA[1] = 8;
		notasAlunoA[2] = 6.7;
		
		System.out.println(Arrays.toString(notasAlunoA));
		double total = 0;
		for (int i = 0; i < notasAlunoA.length; i++) {
			total += (notasAlunoA[i]);
		}
		System.out.println(total / notasAlunoA.length);
		
		
		// Maneira 2 de se declarar arrays
		
		double algumaNota = 5.5;
		double notasAlunoB[] = {4.4, 3.8, 2.5, algumaNota, 1.8};

		System.out.println(Arrays.toString(notasAlunoB));
		double total2 = 0;
		for (int i = 0; i < notasAlunoB.length; i++) {
			total2 += (notasAlunoB[i]);
		}
		System.out.println(total2 / notasAlunoB.length);
	}
}
