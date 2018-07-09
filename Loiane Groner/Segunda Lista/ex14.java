import java.util.Scanner;

public class ex14 {

    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);

        System.out.println("Informe a primeira nota: ");
        double nota1  = scan.nextDouble();
        System.out.println("Informe a primeira nota: ");
        double nota2  = scan.nextDouble();
        
        double media = (nota1 + nota2)/2;

        if(media >= 9 && media <= 10){
            System.out.println("A");
            System.out.println("Aprovado");
        }else if(media >= 7.5 && media < 9){
            System.out.println("B");
            System.out.println("Aprovado");
        }else if(media >= 6.5 && media < 7.5){
            System.out.println("C");
            System.out.println("Aprovado");
        }else if(media >= 4 && media < 6){
            System.out.println("D");
            System.out.println("Reprovado");
        }elsr if(media < 4){
            System.out.println("E");
            System.out.println("Reprovado");
        }
    }
}
