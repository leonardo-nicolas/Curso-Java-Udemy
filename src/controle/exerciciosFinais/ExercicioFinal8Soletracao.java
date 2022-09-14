package controle.exerciciosFinais;

public class ExercicioFinal8Soletracao {
	public static void main(String[] args) {
		var entrada = new java.util.Scanner(System.in);

		String valor = "";
		
		System.out.println("Soletração de palavras.");
		
		while(!valor.equals("-1")) {
			System.out.print("Digite um nome: ");
			valor = entrada.nextLine();
			var caracteres = valor.toCharArray();
			for(int i=0;i<caracteres.length;++i) {
				System.out.println(caracteres[i]);
			}
		}

		entrada.close();
	}
}
