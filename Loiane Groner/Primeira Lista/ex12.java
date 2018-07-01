import java.util.Scanner;

public class PesoIdeal {

    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);

        System.out.println("Informe sua altura: ");
        double altura  = scan.nextInt();

        double pesoIdeal = (72.7 * altura) - 58;

        System.out.println("O peso ideal para seu peso seria de" + pesoIdeal);
    }
}
