package fundamentos.exerciciosFinais;

import javax.swing.JOptionPane;

public class ExercicioAreaDoTriangulo {
	public static void main(String[] args) {
		var quadro = JOptionPane.getRootFrame();
		String msgBoasVindas = "Olá! Seja muito bem-vindo(a)!";
		msgBoasVindas += "\nVamos te guiar por aqui para calcular a área de um triângulo...";
		msgBoasVindas += "\nClique em \"OK\" para continuar...";
		JOptionPane.showMessageDialog(quadro, msgBoasVindas);
		
		String inputBase = JOptionPane.showInputDialog(quadro, "Informe a BASE de um triângulo, EM CENTÍMETROS");
		String inputAlt = JOptionPane.showInputDialog(quadro, "Agora informe a ALTURA deste mesmo triângulo, EM CENTÍMETROS");
		
		double base = Double.parseDouble(inputBase.replace(',','.'));
		double altura = Double.parseDouble(inputAlt.replace(',','.'));
		
		double area = (base * altura) / 2;
		
		String msgResposta = "A área calculada é %f cm².";
		msgResposta += area >= 1000 ? "\nQue é equivalente a " + (area / 100) + " m²." : "";
		msgResposta = String.format(msgResposta, area);
		
		JOptionPane.showMessageDialog(quadro, msgResposta);
		
		
	}
}
