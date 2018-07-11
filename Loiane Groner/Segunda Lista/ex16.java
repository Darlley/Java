import java.util.Scanner;

public class ex16 {

    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);
        System.out.println("Informe o valor A: ");
        int a  = scan.nextInt();
        if(a == 0){
              System.out.println("Não é equação de segundo grau!")
        }else{
              System.out.println("Informe o valor B: ");
              int valorB  = scan.nextInt();
              System.out.println("Informe o valor C: ");
              int valorC  = scan.nextInt();
            
              double delta = (b * b) - (4 * a * c);
              
              if(delta < 0){
                   System.out.println("Delta negativo!");
              }else{
                   System.out.println("Delta = " + delta);

                   double x1 = ((-b) + Math.sqrt(delta)) / (2 * a);
                   double x2 = ((-b) - Math.sqrt(delta)) / (2 * a);

                   System.out.println("X1 = " + x1);
                   System.out.println("X2 = " + x2);
              }
        }
    }
}
