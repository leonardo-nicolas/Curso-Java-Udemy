package controle;

public class BreakRotulado {
	public static void main(String[] args) {
		externo:
		for (int i =0; i<10; i++) {
			for (int j = 0; j < 4; j++) {
				if(i == 5) {
					break externo;
				}
			}
			System.out.println(i);
		}
		System.out.println("Fim!");
	}
}
