package controle;

public class DoWhile {
	public static void main(String[] args) {
		var entrada = new java.util.Scanner(System.in);

		String texto = "por favor!";
		
		do {
			System.out.println("Você precisa falar as palavras mágicas...");
			System.out.print("Quer sair?");
			texto = entrada.nextLine();
		} while(!texto.toLowerCase().contains("por favor"));

		System.out.println("Obrigado!!");
		entrada.close();
		
	}
}
