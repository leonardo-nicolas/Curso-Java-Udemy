package arrays.exercicios;

import java.util.Arrays;

public class ExercicioForEach {
	public static void main(String[] args) {
		// Maneira 1 de se declarar arrays
		double[] notasAlunoA = new double[4];
		double notaQualquer = 9.9;
		notasAlunoA[0] = 7.9;
		notasAlunoA[1] = 8;
		notasAlunoA[2] = 6.7;
		notasAlunoA[3] = notaQualquer;
		
		System.out.println(Arrays.toString(notasAlunoA));
		double total = 0;
		for (double nota: notasAlunoA) {
			total += (nota);
		}
		System.out.println(total / notasAlunoA.length);
	}
}
