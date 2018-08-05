import java.util.Scanner;

public class ex20{

  public static void main(String[] args) {
    
      double alunos = 0;
      int continue = 1;
      double total;

      for(double i = 0; continue == 1; i++){
        System.out.print("Informe a quantidade de alunos: ")
        alunos = scan.nextDouble();
        
        if(alunos > 40){
          System.out.print("Quantidade de alunos não permitida!")
        }

        System.out.print("Tem mais turmas? [1] - Sim [2] - Não ")
        continue = scan.nextInt();
        
        total += alunos;
        total += (total / i);
      }
      
      System.out.print("A média é " + total);
  }
}
