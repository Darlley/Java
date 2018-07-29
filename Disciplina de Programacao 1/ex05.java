import java.util.Scanner;

public class ex05{

    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);

        double cobre;
        double zinco;

        System.out.println("Qual a quantida de latão você  quer: ");
        double qtd = scan.nextDouble();

        cobre = (qtd/100) * 70;
        zinco = (qtd/100) * 30;

        System.out.println("Para " + qtd + "M² de latão, você preisará de: " + cobre + "M de cobre, e " + zinco + "M de zinco.");
    }
}
