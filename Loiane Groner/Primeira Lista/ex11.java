import java.util.Scanner;

public class ProdutosResultantes {

    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);

        System.out.println("Informe um numero inteiro: ");
        int inteiro1  = scan.nextInt();
        System.out.println("Informe outro numero inteiro: ");
        int inteiro2  = scan.nextInt();
        System.out.println("Agora informe um numero real: ");
        double real  = scan.nextDouble();

        double ProdutoA = (inteiro1*2) + (inteiro2/2);
        double ProdutoB = (inteiro1*3) + (real*3);
        double ProdutoC = Math.pow(real,3);

        System.out.println("O produto da soma do dobro do primeiro com o segundo é " + ProdutoA);
        System.out.println("O produto da soma entre o tripro do primeiro e do segundo é " + ProdutoB);
        System.out.println("O produto do terceiro elevado à terceira potencia é " + ProdutoC);
    }
}
