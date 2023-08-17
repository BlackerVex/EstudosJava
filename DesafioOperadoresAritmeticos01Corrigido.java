package fundamentos;

public class DesafioOperadoresAritmeticos01Corrigido {
    public static void main(String[] args) {

        int a = 6 * (3 + 2);
        int b = (1 - 5) * (2 - 7);

        System.out.println(a);
        System.out.println(b);

        double c = Math.pow(30, 2);
        double d = Math.pow(20, 2);

        System.out.println(c);
        System.out.println(d);

        double e = 900.0 / (3 * 2);
        double f = 400 / 2.0;

        System.out.println(e);
        System.out.println(f);

        double valor3 = (150 - 200);
        System.out.println(valor3);

        double valor2 = Math.pow(50, 3);
        double valor1 = Math.pow(10, 3);
        double resposta = valor2 / valor1;
        System.out.println(resposta);
    }
}
