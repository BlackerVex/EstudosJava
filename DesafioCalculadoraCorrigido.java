package fundamentos;

import java.util.Scanner;

public class DesafioCalculadoraCorrigido{
publicstaticvoidmain(String[]args){
//lernum1
//lernum2
//+-*/

Scannerentrada=newScanner(System.in);

System.out.println("informeoNúmero:");
doublenum1=entrada.nextDouble();

System.out.println("InformeoSegundoNúmero:");
doublenum2=entrada.nextDouble();

System.out.println("informeaOperação:");
Stringoperacao=entrada.next();

//Lógica
doubleresultado="+".equals(operacao)?num1+num2:0;
resultado="-".equals(operacao)?num1-num2:resultado;
resultado="*".equals(operacao)?num1*num2:resultado;
resultado="/".equals(operacao)?num1/num2:resultado;
resultado="%".equals(operacao)?num1%num2:resultado;



System.out.printf("%.2f%s%.2f=%.2f",num1,operacao,num2,resultado);




entrada.close();
}
}
