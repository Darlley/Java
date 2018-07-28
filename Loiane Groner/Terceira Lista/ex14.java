import java.util.Scanner;

public class ex14{

    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);
        
        int contPar = 0;
        int contImpar = 0;
        
        for(int i = 0; i <= 10; i++){
          System.out.println("Digite um número: ");
          int number = scan.nextInt();
          
          if(number % 2 == 0){
            contPar++;
          }else{
            contImpar++;
          }

        }
        System.out.println("Quantidade de numeros pares: " + contPar);
        System.out.println("Quantidade de numeros impares: " + contImpar);
    }
}
