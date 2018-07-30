import java.util.Scanner;

public class ex04{

    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);

        double total;

        System.out.println("Informe o número de anos que fuma: ");
        double anos = scan.nextDouble();
        System.out.println("Informe o número de cigarros fumados por dia: ");
        double numCigarros = scan.nextDouble();
        System.out.println("Informe o valor da carteira de cigarro: ");
        double valor = scan.nextDouble();

        total = valor * ((365 * anos) * numCigarros) ;

        System.out.println("Você gastou até agora " + total + " em cigarros.");
    }
}
