package controle.desafios;

public class DesafioWhile {
	public static void main(String[] args) {
		var teclado = new java.util.Scanner(System.in);

		double total = 0;
		int qtdNotas = 0;
		double entrada = 0;
		System.out.println("Para sair, basta apenas digitar -1 e enter!");
		while(entrada != -1) {
			System.out.print("Informe uma nota de 0 a 10: ");
			entrada = teclado.nextDouble();
			if(entrada >= 0 && entrada <= 10) {
				total += entrada;
				qtdNotas++;
			} else if(entrada != -1) {
				System.out.print("Nota inválida! ");
			}
		}
		
		double media = total/qtdNotas;
		media = Double.isNaN(media) ? 0 : media;
		System.out.println("Qtde de notas calculadas: " + qtdNotas);
		System.out.printf("A média é %.1f\n",media);
		System.out.println("Até logo!");

		teclado.close();
	}
}
