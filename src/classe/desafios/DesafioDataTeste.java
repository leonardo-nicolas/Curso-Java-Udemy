package classe.desafios;

public class DesafioDataTeste {
	public static void main(String[] args) {
		DesafioData meuAniversario = new DesafioData(16,11,1994);
		System.out.printf("Leonardo Nícolas nasceu no dia %s\n",
				meuAniversario.obterDataFormatada());
		
		DesafioData abolicaoDaEscravatura = new DesafioData();
		abolicaoDaEscravatura.dia = 13;
		abolicaoDaEscravatura.mes = 05;
		abolicaoDaEscravatura.ano = 1888;
		System.out.printf("A escaravidão foi abolida no dia %s\n",
			abolicaoDaEscravatura.obterDataFormatada());
		
		var proclamacaoDaRepublica = new DesafioData(15,11,1889);
		proclamacaoDaRepublica.dia = 15;
		proclamacaoDaRepublica.mes = 11;
		proclamacaoDaRepublica.ano = 1889;
		System.out.printf("A república federativa do Brasil foi proclamada no dia %s\n",
				proclamacaoDaRepublica.obterDataFormatada());
		
		var independenciaDoBrasil = new DesafioData();
		independenciaDoBrasil.dia = 7;
		independenciaDoBrasil.mes = 9;
		independenciaDoBrasil.ano = 1822;
		System.out.printf("O Brasil se tornou independente da metrópole (Portugal) no dia %s\n",
				independenciaDoBrasil.obterDataFormatada());
		
		var valorPadrao = new DesafioData();
		System.out.println("A data padrão do construtor é " 
		+ valorPadrao.obterDataFormatada() 
		+ ", que pe padrão UNIX");
	}
}
