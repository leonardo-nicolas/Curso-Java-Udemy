package fundamentos;

public class NotacaoPonto {
	public static void main(String[] args) {
		String s = "Boa Madrugada X!";
		
		s = s.replace("X", "Senhor");
		
		s = s.toUpperCase();
		
		s = s.concat("!!!");
		
		
		System.out.println(s);
		
		String x = "Leonardo";
		System.out.println(x.toUpperCase());
		
		String y = "Bom dia X!!"
				.replace("X", "Leo")
				.toUpperCase()
				.concat("!!!");
		System.out.println(y);
		
	}
}
