import java.util.Scanner;

public class PositivoNegativo {

    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);

        System.out.println("Informe um número: ");
        int umNumero  = scan.nextInt();

        if( umNumero >= 0 ){
            System.out.println("O número é positivo!");
        }else{
            System.out.println("O maior número é negativo!");
        }
    }
}
