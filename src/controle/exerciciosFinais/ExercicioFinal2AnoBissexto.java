package controle.exerciciosFinais;

import java.time.LocalDate;

public class ExercicioFinal2AnoBissexto {
	public static void main(String[] args) {
		Integer anoAtual = LocalDate.now().getYear();
		boolean eBissexto = anoAtual % 4 == 0;
		
		eBissexto &= anoAtual % 100 != 0 || (
					anoAtual % 100 == 0 &&
					anoAtual % 400 == 0
				);
		
		System.out.printf("O ano de %s %sé bissexto!", anoAtual, !eBissexto?"não ":"");
	}
}
