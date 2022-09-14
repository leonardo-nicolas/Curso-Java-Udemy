package fundamentos;

public class Temperatura {
	public static void main(String[] args) {
		// (ºF - 32) x 5/9 = ºC
		final double FACTOR_CONVERT = 5.0/9.0;
		final int FROM_FARENHEITH = 32;
		
		double farenheiths = 212;
		double celsius = (farenheiths - FROM_FARENHEITH) * FACTOR_CONVERT;
		
		System.out.println("O Resultado é: " + celsius + "ºC");
		
		farenheiths = 212;
		celsius = (farenheiths - FROM_FARENHEITH) * FACTOR_CONVERT;
		System.out.println("O Resultado é: " + celsius + "ºC");
	}
}
