package controle.desafios;

import java.util.Scanner;

public class DesafioDiaDaSemana {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		System.out.print("Digite um dia da semana por extenso: ");
		String diaDaSemana = teclado.nextLine();
		diaDaSemana = diaDaSemana.trim();
		diaDaSemana = diaDaSemana.replace('ç','c');
		diaDaSemana = diaDaSemana.replace('Ç','C');
		diaDaSemana = diaDaSemana.replace('á','a');
		diaDaSemana = diaDaSemana.replace('Á','A');
		diaDaSemana = diaDaSemana.replace(' ','-');
		
		if(diaDaSemana.equalsIgnoreCase("domingo"))
			System.out.println(1);
		else if(diaDaSemana.equalsIgnoreCase("segunda-feira"))
			System.out.println(2);
		else if(diaDaSemana.equalsIgnoreCase("terca-feira"))
			System.out.println(3);
		else if(diaDaSemana.equalsIgnoreCase("quarta-feira"))
			System.out.println(4);
		else if(diaDaSemana.equalsIgnoreCase("quinta-feira"))
			System.out.println(5);
		else if(diaDaSemana.equalsIgnoreCase("sexta-feira"))
			System.out.println(6);
		else if(diaDaSemana.equalsIgnoreCase("sabado"))
			System.out.println(7);
		else
			System.out.println("Dia da semana Inválido!!");
		
		teclado.close();
	}
}
