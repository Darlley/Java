import java.util.Scanner;

public class ex11 {

    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);

        System.out.println("Informe um numero inteiro: ");
        int inteiro1  = scan.nextInt();
        System.out.println("Informe outro numero inteiro: ");
        int inteiro2  = scan.nextInt();
        System.out.println("Agora informe um numero real: ");
        double real  = scan.nextDouble();

        int ProdutoA = (inteiro1 * 2) * (inteiro2 / 2);
        double ProdutoB = (inteiro1 * 3) + real;
        double ProdutoC = Math.pow(real,3);

        System.out.println("O produto do dobro do primeiro com metade do segundo é " + ProdutoA);
        System.out.println("O produto da soma entre o tripro do primeiro com o terceiro é " + ProdutoB);
        System.out.println("O produto do terceiro elevado ao cubo " + ProdutoC);
    }
}
