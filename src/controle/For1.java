package controle;

public class For1 {

	public static void main(String[] args) {		
		for(int contador = 10; contador >= 0; --contador) {
			System.out.printf("i = %d\n",contador);
		}
		
		int x = 2;
		
		// Imitação de While
		for(; x < 10;) {
			System.out.println("x = " + x);
			x++;
		}
		
		// laço infinito
		//for(;;) {
		//	System.out.println("Fim!!");
		//}
	}
}
