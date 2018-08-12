import java.util.Scanner;

public class ex26{

    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);

        System.out.println("Informe um número: ");
        int num = scan.nextInt();

        System.out.println("Fatorial de " + num);
        System.out.print(num + "! = ");

        int fatorial = 1;
        for(int i=num; i>1; i--){
            fatorial *= i;
            System.out.print(i + " x ");
        }
        System.out.print("1 = " + fatorial);
    }
}
