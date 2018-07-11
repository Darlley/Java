import java.util.Scanner;

public class ex14 {

    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);

        System.out.println("Informe a primeira nota: ");
        double nota1  = scan.nextDouble();
        System.out.println("Informe a primeira nota: ");
        double nota2  = scan.nextDouble();
        
        double media = (nota1 + nota2)/2;
        String aproveitamento = "";

        if(media >= 9 && media <= 10){
            aproveitamento = "A";
        }else if(media >= 7.5 && media < 9){
            aproveitamento = "B";
        }else if(media >= 6.5 && media < 7.5){
            aproveitamento = "C";
        }else if(media >= 4 && media < 6){
            aproveitamento = "D";
            System.out.println("Reprovado");
        }else if(media >= 0 && media < 4){
            aproveitamento = "E";
            System.out.println("Reprovado");
        }
        
        System.out.println("Primeira nota: " + nota1);
        System.out.println("Segunda nota: " + nota2);
        System.out.println("Média: " + media);
        System.out.println("Conceito: " + aproveitamento);
        
        switch(aproveitamento){
            case "A":
            case "B":
            case "C":
                System.out.println("APROVADO!");
                break;
            case "D":
            case "E":
                System.out.println("REPROVADO!");
        };
    }
}
