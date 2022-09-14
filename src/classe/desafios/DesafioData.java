package classe.desafios;

public class DesafioData {
	Byte dia;
	Byte mes;
	Short ano;
	DesafioData(byte diaInicial, byte mesInicial, short anoInicial) {
		dia = diaInicial;
		mes = mesInicial;
		ano = anoInicial;
	}
	DesafioData(int diaInicial,int mesInicial, int anoInicial){
		this((byte)diaInicial,(byte)mesInicial,(short)anoInicial);
	}
	DesafioData(){
		dia = 1;
		mes = 1;
		ano = 1970;
	}
	
	String obterDataFormatada() {
		String dataFormatada = "";
			
		dataFormatada += dia < 10 ? "0" + dia : dia.toString();
		dataFormatada += "/";
		dataFormatada += mes < 10 ? "0" + mes : mes.toString();
		dataFormatada += "/";
		if(ano < 10)
			dataFormatada += "000" + ano;
		else if(ano >= 10 && ano < 100)
			dataFormatada += "00" + ano;
		else if(ano >= 100 && ano < 1000)
			dataFormatada += "0" + ano;
		else if(ano >= 1000)
			dataFormatada += ano.toString();
		else
			dataFormatada = "erro de data";
		return dataFormatada;
	}
}
