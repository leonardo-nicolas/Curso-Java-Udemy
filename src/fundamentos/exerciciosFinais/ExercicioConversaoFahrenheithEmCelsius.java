package fundamentos.exerciciosFinais;

import javax.swing.JOptionPane;

public class ExercicioConversaoFahrenheithEmCelsius {
	public static void main(String[] args) {
		var quadro = JOptionPane.getRootFrame();
		String mensagemBoasVindas = "Olá, seja muito bem vindo!\n";
		mensagemBoasVindas += "Vamos te guiar aqui para converter a temperatura de ºF para ºC..."; 
		JOptionPane.showMessageDialog(quadro, mensagemBoasVindas);
		
		String tempEntrada = JOptionPane.showInputDialog(quadro, "Informe a temperatura em ºF");
		double grausFahrenheith = Double.parseDouble(tempEntrada.replace(',','.'));
		
		double grausCelsius = (grausFahrenheith - 32) * 5 / 9;
		
		String msgResultado = String.format("%.2f ºF equivale a %.2f ºC.\n",grausFahrenheith,grausCelsius);
		msgResultado += "Pronto! Problema dos States resolvido! ;)";
		JOptionPane.showMessageDialog(quadro, msgResultado);
	}
}
