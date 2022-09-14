package fundamentos.exerciciosFinais;

import javax.swing.JOptionPane;

public class ExercicioConversaoCelsiusEmFahrenheit {
	public static void main(String[] args) {
		var quadro = JOptionPane.getRootFrame();
		String mensagemBoasVindas = "Olá, seja muito bem vindo!\n";
		mensagemBoasVindas += "Vamos te guiar aqui para converter a temperatura de ºC para ºF..."; 
		JOptionPane.showMessageDialog(quadro, mensagemBoasVindas);
		
		double grausCelsius = Double.parseDouble(JOptionPane.showInputDialog(quadro, "Informe a temperatura em ºC"));
		
		double grausF = grausCelsius * 1.8 + 32;
		
		String msgResultado = String.format("%.2f ºC equivale a %.2f ºF.\n",grausCelsius,grausF);
		msgResultado += "Não vá passar vergonha nos states! ;)";
		JOptionPane.showMessageDialog(quadro, msgResultado);
	}
}
