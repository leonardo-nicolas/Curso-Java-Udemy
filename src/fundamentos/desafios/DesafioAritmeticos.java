package fundamentos.desafios;

public class DesafioAritmeticos {
	
	public static void main(String[] args) {
		
		double calculo1 = Math.pow(6 * (3 + 2), 2);
		double baseCalculo1 = 3 * 2;
		double resultadoCalculo1 = calculo1 / baseCalculo1;
		
		double calculo2 = (1 - 5) * (2 - 7);
		double baseCalculo2 = 2;
		double resultadoCalculo2 = Math.pow(calculo2 / baseCalculo2, 2);
		
		
		double calculoGeral = resultadoCalculo1 - resultadoCalculo2;
		calculoGeral = Math.pow(calculoGeral, 3);
		double baseGeral = Math.pow(10, 3);
		
		double resultadoGeral = calculoGeral / baseGeral;
		
		System.out.println("O resultado obtido é: " + resultadoGeral);
	}
}