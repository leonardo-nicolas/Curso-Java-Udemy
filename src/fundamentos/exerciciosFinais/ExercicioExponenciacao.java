package fundamentos.exerciciosFinais;

import javax.swing.JOptionPane;

public class ExercicioExponenciacao {
	public static void main(String[] args) {
		var quadro = JOptionPane.getRootFrame();
		String entradaNum = JOptionPane.showInputDialog(quadro,"Digíte um número qualquer");
		double num = Double.parseDouble(entradaNum.replace(',', '.'));
		double quadrado = Math.pow(num, 2);
		double cubo = Math.pow(num, 3);
		String msgResposta = "%f elevado ao quadrado é %f.\n";
		msgResposta += "%f elevado ao cubo é %f.";
		msgResposta = String.format(msgResposta,num,quadrado,num,cubo);
		
		JOptionPane.showMessageDialog(quadro, msgResposta);
		
	}
}
