package fundamentos;

public class NotacaoPonto {
	
	public static void main(String[] args) {
		
		String s = "Bom dia X";
		
		s = s.replace("X", "Senhora");
		s = s.concat("\nMinha linda!!");
		s = s.toLowerCase();
		
		
		System.out.println(s);
		
		String x = "Leo".toUpperCase();
		System.out.println(x);
		
		String y = "Bom dia"
				.replace("dia", "Buceta")
				.toUpperCase()
				.concat("!!!");
		
		System.out.println(y);
		
		// Tipos primitivos não tem o operador "."
		double a = 3;
		// a. não tem
		System.out.println(a);
	}
}
