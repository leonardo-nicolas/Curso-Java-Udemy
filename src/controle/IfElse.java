package controle;

import javax.swing.JOptionPane;

public class IfElse {
	public static void main(String[] args) {
		var quadro = JOptionPane.getRootFrame();
		String valor = JOptionPane.showInputDialog(
				quadro,
				"Informe um número"
		);
		
		int numero = Integer.parseInt(valor);
	
		if(numero % 2 == 0) {
			System.out.println("Número PAR");
		} else {
			System.out.println("Número ÍMPAR");
		}
	}
}
