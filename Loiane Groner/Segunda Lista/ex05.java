import java.util.Scanner;

public class ex05 {

    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);

        System.out.println("Informe a primeira nota:");
        double umaNota = scan.nextDouble();
        System.out.println("Informe a segunda nota:");
        double outraNota = scan.nextDouble();

        double media = (umaNota + outraNota)/2;

        if(media == 10) {
            System.out.println("Aprovado com distinção");
        }else if(media < 7 ){
            System.out.println("Reprovado");
        }else if(media >= 7){
                System.out.println("Aprovado");
        }
    }
}
