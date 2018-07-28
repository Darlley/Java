import java.util.Scanner;

public class ex17{

    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);

        int screen = 0;
        int aux;
        
        System.out.println("Informe um número: ");
        int numeroFat = scan.nextInt
        
        aux = numeroFat;
        
        while(aux > 0){
          screen += aux * (aux-1);
          aux--;
        }
        
        System.out.println("O fatorial de " + numerofat + " é: " + screen)
    }
}
