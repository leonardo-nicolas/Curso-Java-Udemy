package controle;

public class WhileDeterminado {
	public static void main(String[] args) {
		
		int contador = 1;
		short somatorio = 0;
		while(contador <= 10) {
			System.out.printf("i = %d\n",somatorio);
			++somatorio;
		}
	}
}
