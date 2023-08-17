package fundamentos;

import javax.crypto.spec.PSource;
import java.util.Scanner;

public class DesafioConversaoCorrigido{
public static voidmain(String[]args){

Scannerentrada=newScanner(System.in);

System.out.print("Informeoprimeirosalário:");
Stringvalor1=entrada.next().replace(",",".");

System.out.print("InformeoSegundosalário:");
Stringvalor2=entrada.next().replace(",",".");

System.out.print("InformeoTerceirosalário:");
Stringvalor3=entrada.next().replace(",",".");

doublesalario1=Double.parseDouble(valor1);
doublesalario2=Double.parseDouble(valor2);
doublesalario3=Double.parseDouble(valor3);

doublemedia=(salario1+salario2+salario3)/3;
System.out.println("Amédiadossalárioé"+media);

entrada.close();
}
}