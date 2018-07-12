import java.util.Scanner;

public class ex23 {

    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);
        
        System.out.println("Tipo da carne: ");
        int tipo  = scan.nextInt();
        
        System.out.println("Quantidade de carne: ");
        double quantidade  = scan.nextDouble();
        
        double preco = 0;
        
        if(tipo == 1){
          
          System.out.println(quantidade + "Kg - file duplo");
        
          if(quantidade < 5){
            preco = 4.9;
          }else{
            preco = 5.8;
          }
        }else if(tipo == 2){
        
          System.out.println(quantidade + "Kg - alcatra");
        
          if(quantidade < 5){
            preco = 5.9;
          }else{
            preco = 6.8;
          }
        }else if(tipo == 3){
          
          System.out.println(quantidade + "Kg - picanha");
          
          if(quantidade < 5){
            preco = 6.9;
          }else{
            preco = 7.8;
          }
        }
        
        double total = quantidade * preco;
        
        System.out.println("Compra no cartão? [1-Sim]");
        int cartao = scan.nextInt();
        
        if(cartao == 1){
          double desconto = (total/100) * 5;
          System.out.println("Desconto de " + desconto);
          System.out.println("");
          System.out.println("============== |TOTAL| ==============");
          System.out.println("Valor a pagar: " + (total - desconto);
        }else{
          System.out.println(quantidade + "Kg x " + preco + " = " + total);
        }
   }
}
