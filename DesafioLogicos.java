package fundamentos;

public class DesafioLogicos{
publicstaticvoidmain(String[]args){
booleantrabalho1=true;
booleantrabalho2=false;

booleancomprouTv50=trabalho1&&trabalho2;
booleancomprouTv32=trabalho1^trabalho2;
booleancomprousorvete=trabalho1||trabalho2;
booleanmaissaudavel=!comprousorvete;//OperadorUnário!


System.out.println("Comprouatvde50\"?"+comprouTv50);
System.out.println("Comprouatvde32\"?"+comprouTv32);
System.out.println("ComprouSorvete?"+comprousorvete);

//OperadorUnário!
System.out.println("Maissaudável?"+!comprousorvete);








}
}
