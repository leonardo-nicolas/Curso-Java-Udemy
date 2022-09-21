package arrays.desafios;

public class DesafioCalculoMediaVariasNotas {
	public static void main(String[] args) {
		var teclado = new java.util.Scanner(System.in);

		System.out.println("Vamos calcular as média do aluno");
		System.out.print("Primeiro digite a quantidade de notas para calcular média: ");
		int qtdNotas = teclado.nextInt(); 
		Double[] notas = new Double[qtdNotas];
		
		for (int i = 0; i < qtdNotas; i++) {
			String msg = "Digite a %dª nota do aluno: ";
			
			if(qtdNotas-1 == i)
				msg = "Digite a última nota do aluno: ";
			
			switch(qtdNotas - i) {
				case 1:
					msg = "Digite a última nota do aluno: ";
					break;
				case 2:
					msg = "Digite a penúltima nota do aluno: ";
					break;
				default:
					msg = "Digite a %dª nota do aluno: ";
					break;
			}
			
			System.out.printf(msg, i + 1);
			notas[i] = teclado.nextDouble();
		}
		
		double media = 0;
		for(double nota: notas) {
			media += nota;
		}
		
		media /= qtdNotas;
		
		System.out.println("A média deste aluno é: " + media);

		teclado.close();
	}
}
