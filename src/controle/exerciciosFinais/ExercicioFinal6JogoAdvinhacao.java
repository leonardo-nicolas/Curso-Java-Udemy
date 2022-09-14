package controle.exerciciosFinais;

import java.util.*;
import javax.swing.JOptionPane;

public class ExercicioFinal6JogoAdvinhacao {
	public static void main(String[] args) {
		Random numAleatorio = new Random(100);
		var quadro = JOptionPane.getRootFrame();
		String msgBoasVindas = "Olá! Seja bem-vindx ao jogo do \"ADVINHA\"!!\n";
		msgBoasVindas += "Você vai digitar um número qualquer, que você quiser!\n";
		msgBoasVindas += "Se você acertar, você ganha um HB20! Para isso, ";
		msgBoasVindas += "Você terá 10 tentativas!\n"
				+ "Mas, se você errar e perder todas essas 10 chances, "
				+ "vai levar ovada na cara! :P :P\n\n";
		msgBoasVindas += "Se tiver essa coragem e quiser tentar dando um golpe de sorte, beleza!\n"
				+ " Para isso, clique em \"OK\"!!\n";
		msgBoasVindas += "Agora, se quiser desistir, Só clicar em \"Cancel\" (ou \"Cancelar\") e problema teu!";
		
		boolean desistiu = false;
		
		var respostaDesafioJogo = JOptionPane.showConfirmDialog(quadro, msgBoasVindas,"Jogo do Advinha",JOptionPane.OK_CANCEL_OPTION);

		boolean acertou = false;
		
		if(respostaDesafioJogo == JOptionPane.OK_OPTION)
			for(int tentativas = 10; tentativas >= 0; --tentativas) {
				if(tentativas == 0) {
					JOptionPane.showMessageDialog(quadro, "Cuidado em!\nEssa é sua última chance!\nNão vai vacilar tá!");
				}
				String pluralFaltas = tentativas < 2 ? "falta" : "faltam";
				pluralFaltas += " " + tentativas;
				pluralFaltas = tentativas == 0 ? "Jogo perdido praticamente" : pluralFaltas;
				String pluralTent = " ";
				pluralTent += tentativas < 2 ? "tentativa" : "tentativas";
				pluralTent = tentativas == 0 ? "" : pluralTent;
				int aleatorio = numAleatorio.nextInt();
				aleatorio = aleatorio < 0 ? aleatorio * (-1) : aleatorio;
				while (aleatorio > 100) {
					aleatorio = numAleatorio.nextInt();
					aleatorio = aleatorio < 0 ? aleatorio * (-1) : aleatorio;
				}
				String entradaUsuario = JOptionPane.showInputDialog(quadro, "Informe um NÚMERO INTEIRO qualquer (" + pluralFaltas + pluralTent + ")");
				int numUsuario = Integer.parseInt(entradaUsuario);
				int continuacao;
				if(aleatorio == numUsuario) {
					String msgGanhou = "Parabéns!\n";
					msgGanhou += "Você venceu o jogo!";
					msgGanhou += "É exatamente isso que você chutou:";
					msgGanhou += " O número " + aleatorio;
					JOptionPane.showMessageDialog(
							quadro, msgGanhou,"Sortudx do caralho!", 
							JOptionPane.INFORMATION_MESSAGE);
					continuacao = JOptionPane.showConfirmDialog(
							quadro,"Quer continuar?",
							"Decida-se",JOptionPane.YES_NO_OPTION);
					acertou = true;
				} else {
					String msgErrou = "Errou!!\n";
					msgErrou += "A resposta não era " + entradaUsuario + "!\n";
					msgErrou += "A resposta era " + aleatorio + "!";
					JOptionPane.showMessageDialog(quadro, 
							msgErrou, "Errou feio!", 
							JOptionPane.INFORMATION_MESSAGE);
					if(tentativas > 0)
						continuacao = JOptionPane.showConfirmDialog(
							quadro,"Quer tentar de novo?",
							"Decida-se",JOptionPane.YES_NO_OPTION);
					else
						continuacao = 0;
					acertou = false;
				}
				
				if(continuacao == JOptionPane.NO_OPTION && tentativas > 0) {
					desistiu = true;
					break;
				} else if(acertou && continuacao == JOptionPane.YES_OPTION) {
					tentativas = 11;
				}
				
			}

		if(desistiu && !acertou) {
			JOptionPane.showMessageDialog(quadro, 
					"Que peninha que você pediu arrego! :'(", 
					"Medrosx", 
					JOptionPane.WARNING_MESSAGE, 
					null);
		}
	}
}
