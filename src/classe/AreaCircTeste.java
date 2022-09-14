package classe;

public class AreaCircTeste {
	public static void main(String[] args) {
		AreaCirc a = new AreaCirc(5.6);
		
		AreaCirc b = new AreaCirc(9.6);
		System.out.println(a.area());
		System.out.println(b.area());
	}
}
