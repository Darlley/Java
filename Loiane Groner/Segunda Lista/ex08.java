import java.util.Scanner;

public class ex08 {

    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);

        System.out.println("Informe o preço do primeiro produto: ");
        double umProduto  = scan.nextDouble();
        System.out.println("Informe o preço do segundo produto: ");
        double outroProduto  = scan.nextDouble();
        System.out.println("Informe o preço do terceiro produto: ");
        double maisUmProduto  = scan.nextDouble();

        if(umProduto => outroProduto && outroProduto => maisUmProduto){
            System.out.println("Você deve comprar o terceiro produto");
        }else if(umProduto => outroProduto && outroProduto <= maisUmProduto){
            System.out.println("Você deve comprar o segundo produto");
        }else{
            System.out.println("Você deve comprar o primeiro produto");
        }
    }
}
