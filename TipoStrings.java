package fundamentos;


public class TipoStrings {

		public static void main(String[] args) {
			
			
			System.out.println("Olá pessoal!!".charAt(4));
			
			String s = "Boa tarde!!";
			System.out.println(s.concat(" Corno"));
			System.out.println(s + " Corno");
			System.out.println(s.startsWith("Boa"));
			System.out.println(s.toUpperCase().startsWith("BOA"));
			System.out.println(s.length());
			System.out.println(s.toLowerCase().endsWith("!"));
			System.out.println(s.equalsIgnoreCase("boa tarde!!"));
			
			var nome = "Pedro";
			var sobrenome = "Santos";
			var idade = 33;
			var salario = 12345.987;
			
			String maisUmaFrase = String.format("Nome: %s \nSobrenome: %s \nIdade: %d\nsalario: R$%.2f.", nome, sobrenome, idade, salario);
			System.out.println(maisUmaFrase);
//			System.out.printf("O senhor %s %s tem %d anos e ganha R$%.2f.", 
//					nome, sobrenome, idade, salario);
			
			String frase = String.format("O senhor %s %s tem %d anos e ganha R$%.2f.", 
					nome, sobrenome, idade, salario);
			System.out.println(frase);
		}
}
