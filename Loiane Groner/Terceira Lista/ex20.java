import java.util.Scanner;

public class ex20{

  public static void main(String[] args) {
    
      double nota = 0;
      int continue = 1;

      for(double i = 0; continue == 1; i++){
        System.out.print("Informe uma nota: ")
        nota = scan.nextDouble();
        System.out.print("Deseja continuar? [1] - Sim [2] - Não ")
        continue = scan.nextInt();

        nota += (nota / i);
      }
      
      System.out.print("A média é " + nota);
  }
}
