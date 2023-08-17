package fundamentos;

import java.util.Scanner;

public class Console {

	public static void main(String[] args) {
		// comando print sempre printa na mesma linha
		System.out.print("Bom");
		System.out.print(" dia!\n\n");
		// comando println cria outra palavra na proxima linha
		System.out.println("Bom");
		System.out.println("dia!");
		// Comando printf é usado como format
		System.out.printf("Megasena: %d %d %d %d %d %d", 1, 2, 3, 4, 5, 6);
		System.out.printf("%nsalário: %.1f%n", 1234.5678);
		System.out.printf("Nome: %s%n", "joão");
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Digite o seu nome: ");
		String nome = entrada.nextLine();
		
		System.out.print("Digite o seu sobrenome: ");
		String sobrenome = entrada.nextLine();
		
		System.out.print("Digite a sua idade: ");
		int idade = entrada.nextInt();
		
		System.out.printf("%s %s tem %d anos.", 
				nome, sobrenome, idade);
		
		entrada.close();
	}
}
