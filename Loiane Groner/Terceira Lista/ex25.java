import java.util.Scanner;

public class ex25{

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        
        boolean sair = false;
        String continuarComprando;
        int qtdProdutos;
        double preco;
        double total;
        String output;
        double valorPago;
        double troco;
        
        do{
          System.out.println("Deseja continuar comprando?");
          continuarComprando = scan.next();
          if(continuarComprando.equalsIgnoreCase("s")){
            output = "Lojas Tabajara\n";
            System.out.println("Quantidades de produtos: ");
            qtdProdutos = scan.nextInt();
            total = 0;
            for(int i = 1; i<=qtdProdutos; i++){
              System.out.printl("Informe o preço do produto " + i + ": ");
              preco = scan.nextDouble();
              total += preco;
              output += "Produto " + i + ": R$" + preco + ".\n"; 
            }
            output += "Total: R$" + total;
            System.out.printl("Total: R$" + total);
            System.out.printl("Valor pago: ");
            valorPago = scan.nextDouble();
            output += "Dinheiro: R$" + valorPago + "\n"; 
            troco = total - valorPago;
            output += "Troco: " + troco;
            System.out.printl(output);
          }else{
            sair = true;
          }
        }while(!sair)
    }
}    
