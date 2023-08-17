package fundamentos;

public class Ternario{
publicstaticvoidmain(String[]args){

doublemedia=5.6;
//o?correspondesemediaformaiorouiguala7"Aprovado"casocontrário"Emrecuperação"
StringresultadoFinal=media>=7.0?
"Aprovado":"emRecuperação";

System.out.println("Oalunoestá"+resultadoFinal);

doublenota=9.9;
booleanbomComportamento=true;
booleanpassouPorMedia=nota>=7;
booleantemDesconto=bomComportamento&&passouPorMedia;
Stringresultado=temDesconto?"Sim.":"Não.";

System.out.printf("Temdesconto?%s",resultado);
}
}