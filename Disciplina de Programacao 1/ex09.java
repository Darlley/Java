import java.util.Scanner;

public class ex09{

    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);

        double lucro;

        System.out.println("Pães vendidos: ");
        double pao = scan.nextDouble();
        System.out.println("Leite vendidos: ");
        double leite = scan.nextDouble();
        System.out.println("Bolos vendidos: ");
        double bolo = scan.nextDouble();
        
        lucro = ((0.15 * pao) - (0.9 * pao)) + ((1 * leite) - (0.70 * leite)) + ((5 * bolo) + (3 * bolo));
        
        System.out.println("Lucro das vendas no dia: " + lucro);
    }
}
