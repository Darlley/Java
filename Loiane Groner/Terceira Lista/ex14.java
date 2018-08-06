import java.util.Scanner;

public class ex01{

    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);

        int pares = 0;
        int impares = 0;

        for(int i = 0; i < 10; i++){
            System.out.println("Digite um número: ");
            int number = scan.nextInt();

            if(number % 2 == 0){
                pares++;
            }else{
                impares++;
            }

        }
        System.out.println("Quantidade de numeros pares: " + pares);
        System.out.println("Quantidade de numeros impares: " + impares);
    }
}
