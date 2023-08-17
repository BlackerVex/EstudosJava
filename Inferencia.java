package fundamentos;

public class Inferencia {
	
	public static void main(String[] args) {
		
		// O double transformou a variavel a no tipo numérico.
		// Mesmo se colocar a = "...", não ira resultar por ter se transformado em valor numérico.
		double a = 12; // Declaração e inicialização
		System.out.println(a);
		
		var b = 4.5;
		System.out.println(b);
		// Mesma coisa com o c, o c virou variavel do tipo texto.
		// E mesmo que coloque c = 4.5; não irá resultar.
		var c = ("Oi");
		System.out.println(c);
		c = "Outro texto";
		System.out.println(c);
		
		double d; // Variável foi declarada
		d = 123.6; // Variável foi inicializada
		System.out.println(d); // usada
		
		var e = 123.45;
		System.out.println(e);
		
		// A função "var" é basicamente deixar o java descobrir que tipo de variável que é
		
		var f = 12; // Valor inteiro;
		System.out.println(f);
	}
}
