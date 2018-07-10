import java.util.Scanner;

public class ex01 {

    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);

        System.out.println("Informe um número: ");
        int umNumero  = scan.nextInt();

        System.out.println("Informe outro número: ");
        int outroNumero  = scan.nextInt();

        if(umNumero > outroNumero){
            System.out.println("O maior número é " + umNumero);
        }else{
            System.out.println("O maior número é " + outroNumero);
        }
    }
}
