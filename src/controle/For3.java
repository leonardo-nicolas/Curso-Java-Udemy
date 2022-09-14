package controle;

public class For3 {
	public static void main(String[] args) {
		for(int i = 1; i <= 15; i++) {
			System.out.println("Tabuada de " + i + ":");
			for(int j = 1; j <= 10; j++) {	
				Integer tbd = i * j;//tbd=tabuada (escolha sua a op. aritmética: +-*/)
				int colunasPorCalculo = 4;//Quantas colunas por cada conta feita?
				/*
				 * Coloca o zero à esquerda nos números de 1 a 9...
				 * Além de espaços em branco. Como aqui e mais abaixo
				 * Apenas para TENTAR corrigir bug de indentação no console.
				 */
				String resultado = tbd < 10 ? "0"+tbd : tbd.toString();
				resultado = tbd >= 100 ? tbd.toString() : " " + resultado;
				System.out.printf("[%s %s] = %s; ",
					i >= 10 ? i : "0"+i,
					j >= 10 ? j : "0"+j,
					resultado
				);
				//O if abaixo é quando chega na coluna desejada pra pular linha
				if(j % colunasPorCalculo == 0)
					System.out.println(); 
			}
			System.out.println();// Apenas para pular uma linha e ir para próxima tabuada
		}
	}
}
