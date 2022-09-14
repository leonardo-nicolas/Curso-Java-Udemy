package fundamentos.desafios;

import javax.swing.JOptionPane;

public class DesafioCalculadora {
	
	public static void main(String[] args) {
		var perguntaNum1 = JOptionPane.showInputDialog("Informe o primeiro número");
		var perguntaNum2 = JOptionPane.showInputDialog("Informe um segundo número");
		var op = JOptionPane.showInputDialog("Informe somente UMA operação: + - * %");
		var num1 = Double.parseDouble(perguntaNum1);
		var num2 = Double.parseDouble(perguntaNum2);
		
		var resultado = op.equals("+") ? num1 + num2 : Double.NaN;
		resultado = op.equals("-") ? num1 - num2 : resultado;
		resultado =	op.equals("*") ? num1 * num2 : resultado;
		resultado =	op.equals("/") ? num1 / num2 : resultado;
		resultado =	op.equals("%") ? num1 % num2 : resultado;
		
		String opPorExtenso = op.equals("+") ? "mais" : op;
		opPorExtenso = op.equals("-") ? "menos" : opPorExtenso;
		opPorExtenso =	op.equals("*") ? "vezes" : opPorExtenso;
		opPorExtenso =	op.equals("/") ? "dividido por" : opPorExtenso;
		opPorExtenso =	op.equals("%") ? "resto de" : opPorExtenso;
		
		String resposta = String.format("%.2f %s %.2f = %.2f",num1,opPorExtenso,num2,resultado);
		
		JOptionPane.showMessageDialog(null, resposta);
	}
}
