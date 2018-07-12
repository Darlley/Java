import java.util.Scanner;

public class ex22 {

    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);
        
        System.out.println("Quantidade morangos: ");
        int morango  = scan.nextInt()
        
        System.out.println("Quantidade maçã: ");
        int maca  = scan.nextInt()
     
        double precoMorango = 0;
        if(morango <= 5){
          precoMorango = 2.5;
        }else{
          precoMorango = 2.2;
        }
        
        double precoMaca = 0;
        if(maca <= 5){
          precoMaca = 1.8;
        }else{
          precoMaca = 1.5;
        }
        
        double totalMorango = morango * precoMorango;
        double totalMaca = maca * precoMaca;
        double totalParcial = totalMorango + totalMaca;
        double total = totalParcial;
        
        if(morango + maca > 8 || totalParcial > 25){
          total = totalParcial - (totalParcial/100) * 10;
        }
        
        System.out.println("Preço total: " + total);
    }
}
