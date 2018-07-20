import java.util.Scanner;

public class ex13{

    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);

        System.out.println("Informe a base: ");
        int base = scan.nextInt();
        System.out.println("Informe o expoente: ");
        int expoente = scan.nextInt();

        System.out.println(base + " elevado a " + expoente + " = " + (base ^ expoente));
    }
}
