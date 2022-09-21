package arrays.desafios;

public class DesafioCalculoMediaVariosAlunosNotas {
	public static void main(String[] args) {
		
		// Este arquivo em específico, NÃO TEVE desafio proposto pelo professor, 
		// mas ele sugeriu se basear no desafio anterior (de calculo de média de 1 aluno só)
		// para fazer o mesmo cálculo de média, só que dessa vez de VÁRIOS ALUNOS diferentes
		// para treinar mais sobre o assunto de Matrizes...
		var teclado = new java.util.Scanner(System.in);

		System.out.println("Vamos calcular as média do aluno");
		System.out.print("Primeiro informe quantos alunos para calcular média: ");
		int qtdAlunos = teclado.nextInt();
		System.out.print("Agora informe a quantidade de notas por cada alunx para calcular média: ");
		int qtdNotas = teclado.nextInt();
		
		double[] notas[] = new double[qtdAlunos][qtdNotas];
		double mediaDaTurma = 0;
		double[] mediaCadaAluno = new double[qtdAlunos];
		String msg;
		for (int i = 0; i < qtdAlunos; i++) {
			System.out.println("");
			switch(qtdAlunos - i) {
				case 1:
					msg = "Vamos ao últimx alunx: ";
					break;
				case 2:
					msg = "Vamos ao penultimx alunx: ";
					break;
				default:
					msg = "Vamos ao %dº ou %dª alunox: ";
					break;
			}
			System.out.printf(msg,i+1,i+1);
			System.out.println("");
			for (int j = 0; j < qtdNotas; j++) {
				switch(qtdNotas - j) {
					case 1:
						msg = "Digite a última nota dx alunx: ";
						break;
					case 2:
						msg = "Digite a penúltima nota dx alunx: ";
						break;
					default:
						msg = "Digite a %dª nota dx alunx: ";
						break;
				}				
				System.out.printf(msg, j + 1);
				double nota = teclado.nextDouble();
				notas[i][j] = nota;
				mediaCadaAluno[i] += nota;
			}
			mediaCadaAluno[i] /= qtdNotas;
			mediaDaTurma += mediaCadaAluno[i];
			System.out.println("A média destx alunx é: " + mediaCadaAluno[i]);
			
		}
		
		mediaDaTurma /= qtdAlunos;
		
		System.out.println("\nA média geral da turma é: " + mediaDaTurma);

		teclado.close();
	}
}
