import java.util.Scanner;

public class ex19{

    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);
        
        int continue = 1;
        double media = 0;
        
        while(continue == 1){
          System.out.print("Digite uma nota: ");
          int nota = scan.nextInt();
          
          System.out.print("[1] para CONTINUAR!");
          System.out.print("[2] para PARAR!");
          int continue = scan.nextInt();
          
          for(int i = 0; continue == 1; i++){
            nota = nota / i;
          }
          
        }
        
        System.out.println("A média é: " + nota);
    }
}
