import java.util.Scanner;

public class NumeroRetornado {
  puclic static void main(String[] args){
    
    Scanner scan = new Scanner(System.in);
    
    System.out.println("Digite um número: ");
    int numero1 = scan.nextInt();
    System.out.println("Digite outro número: ");
    int numero2 = scan.nextInt();
    
    System.out.println("O numero informado foi " + (numero1 + numero2));
  }
}
