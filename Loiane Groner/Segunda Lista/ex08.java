import java.util.Scanner;

public class ex08 {

    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);

        System.out.println("Informe o preço do primeiro produto: ");
        int umProduto  = scan.nextInt();

        System.out.println("Informe o preço do segundo produto: ");
        int outroProduto  = scan.nextInt();

        System.out.println("Informe o preço do terceiro produto: ");
        int maisUmProduto  = scan.nextInt();

        if(umProduto > outroProduto && outroProduto > maisUmProduto){
            System.out.println("Você deve comprar o terceiro produto");
        }else if(umProduto > outroProduto && outroProduto < maisUmProduto){
            System.out.println("Você deve comprar o segundo produto");
        }else{
            System.out.println("Você deve comprar o primeiro produto");
        }
    }
}
