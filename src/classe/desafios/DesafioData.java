package classe.desafios;

public class DesafioData {
	public Byte dia;
	public Byte mes;
	public Short ano;
	DesafioData(byte dia, byte mes, short ano) {
		this.dia = dia;
		this.mes = mes;
		this.ano = ano;
	}
	public DesafioData(int dia,int mes, int ano){
		this((byte)dia,(byte)mes,(short)ano);
	}
	DesafioData(){
		this(1,1,1970);
	}
	
	public String obterDataFormatada() {
		String dataFormatada = "";
			
		dataFormatada += this.dia < 10 ? "0" + this.dia : this.dia.toString();
		dataFormatada += "/";
		dataFormatada += this.mes < 10 ? "0" + this.mes : this.mes.toString();
		dataFormatada += "/";
		if(this.ano < 10)
			dataFormatada += "000" + this.ano;
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
