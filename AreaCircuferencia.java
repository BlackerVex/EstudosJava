package fundamentos;

public class AreaCircuferencia {
	
	public static void main(String[] args) {
		double raio = 3.4;
		final double PI = 3.14159;
		// usar letra MAÍSCULA dá sinal de constante, ou seja a variavel se transforma em constante
		// usar o "final" significa que este campo não pode ser alterado
		double area = PI * raio * raio;
		System.out.println(area);
		
		raio = 10;
		area = PI * raio * raio;
		System.out.println("Àrea = " + area + "m2.");
	}

}																				