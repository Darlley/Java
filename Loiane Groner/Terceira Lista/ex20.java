import java.util.Scanner;

public class ex01{

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Informe a quantidade de idades: ");
        int idades = scan.nextInt();

        int idade;
        int soma = 0;
        for(int i = 0; i<idades; i++){
            System.out.println("Informe a idade da pessoa " + (i+1) + ": ");
            idade = scan.nextInt();

            soma += idade;
        }

        double media = soma / idades;
        System.out.println("Media de idade: " + media);

        if(media >= 0 && media <= 25){
            System.out.println("Jovem!");
        }else if(media >= 26 && media <= 60 ){
            System.out.println("Adulto(a)!");
        }else if(media > 60){
            System.out.println("idoso(a)!");
        }
    }
}
