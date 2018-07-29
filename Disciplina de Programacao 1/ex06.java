import java.util.Scanner;

public class ex06{

    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);

        double total;

        System.out.println("Informe a quantidade de camisetas: ");
        double camiseta = scan.nextDouble();
        System.out.println("Informe a quantidade de bermudas: ");
        double bermuda = scan.nextDouble();
        System.out.println("Informe a quantidade de calças: ");
        double calca = scan.nextDouble();

        total = (5 * camisa) + (10 * bermuda) + (15 * calca); 

        System.out.println("TOTAL DA COMPRA: R$" + total);
    }
}
