package fundamentos;

public class Logicos{
publicstaticvoidmain(String[]args){

booleancondicao1=true;
booleancondicao2=3>7;

System.out.println(condicao1&&!condicao2);
System.out.println(condicao1||condicao2);
System.out.println(condicao1^condicao2);
System.out.println(!!condicao1);
System.out.println(!condicao2);

//TabelaverdadeE
System.out.println("\nTabelaverdadeE(AND)");
System.out.println(true&&true);
System.out.println(true&&false);
System.out.println(false&&true);
System.out.println(false&&false);

//TabelaverdadeOU
System.out.println("\nTabelaverdadeou(OR)");
System.out.println(true||true);
System.out.println(true||false);
System.out.println(false||true);
System.out.println(false||false);

//TabelaverdadeOUExclusivo
System.out.println("\nTabelaverdadeouExclusivo(XOR)");
System.out.println(true^true);
System.out.println(true^false);
System.out.println(false^true);
System.out.println(false^false);

//TabelaverdadeNOT
System.out.println("\nTabelaverdadeNOT");
System.out.println(!true);
System.out.println(!false);

}
}
