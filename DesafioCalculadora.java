package fundamentos;

import java.util.Scanner;

public class DesafioCalculadora {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        double num1, num2, result;
        char operacao;

        System.out.println("Digite o Primeiro Número:");
        num1 = entrada.nextDouble();

        System.out.println("Digite uma das Operações (+, -, *, /):");
        operacao = entrada.next().charAt(0);

        System.out.println("Digite o Segundo Número:");
        num2 = entrada.nextDouble();

        result = operacao == '+' ? num1 + num2
                : operacao == '-' ? num1 - num2 : operacao == '*' ? num1 * num2 : operacao == '/' ? num1 / num2 : 0;

        System.out.printf("%.2f %c %.2f = %.2f", num1, operacao, num2, result);

        entrada.close();
    }
}
