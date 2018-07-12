import java.util.Scanner;

public class ex21 {

    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);
        
        System.out.println("Número de litros vendido: ");
        double qtdLitros  = scan.nextDouble()
        System.out.println("Qual o tipo do combustivel? ");
        String combustivel  = scan.next()

        double precoGas = 2.5;
        double precoAlc = 1.9;
        int desconto = 0;
        double total = 0;
        double totalDesc = 0;
        
        if(combustivel.equalsIgnoreCase("a")){
          if(qtdLitros <= 20){
            desconto = 3;
          }else{
            desconto = 5;
          }
          
          total = qtdLitros * precoAlc;
        }else if(combustivel.equalsIgnoreCase("g")){
          if(qtdLitros <= 20){
            desconto = 4;
          }else{
            desconto = 6;
          }
          
          total = qtdLitros * precoGas;
        }
        
        totalDesc = (total/100) * desconto;
        double precoPagar =  total - totalDesc;
        
        System.out.println("O valor a ser pago é: " + precoPagar);
    }
}
