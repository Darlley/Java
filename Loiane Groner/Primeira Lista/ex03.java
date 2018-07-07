import java.util.Scanner;

public class ex03 {
  puclic static void main(String[] args){
    
    Scanner scan = new Scanner(System.in);
    
    System.out.println("Digite um número: ");
    int numero1 = scan.nextInt();
    System.out.println("Digite outro número: ");
    int numero2 = scan.nextInt();
    
    System.out.println("A soma entre os números informados é de " + (numero1 + numero2));
  }
}
