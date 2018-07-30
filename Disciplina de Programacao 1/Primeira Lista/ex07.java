import java.util.Scanner;

public class ex07{

    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);

        double screen;
        double jose = 1.50;
        double pedro = 1.10;

        System.out.println("Informe a quantidade de anos: ");
        double ano = scan.nextDouble();
        
        jose += (2 *  ano);
        pedro += (3 * ano);
        
        System.out.println("Em " + ano + " anos...");
        System.out.println("José terá: " + jose + "cm.");
        System.out.println("Pedro terá: " + jose + "cm.");
    }
}
