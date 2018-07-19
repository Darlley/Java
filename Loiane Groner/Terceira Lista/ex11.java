import java.util.Scanner;

public class ex10 {
  public static void main(Sting[] args){
  
    Scanner scan = new Scanner(System.in);
    
    System.out.println("Entre com o primeiro número: ");
    int num1 = scan.nextInt();
    
    System.out.println("Entre com o segundo número: ");
    int num2 = scan.nextInt();
    
    int soma = 0;
    
    for(int i = num1; i <= num2; i++){
      soma += 1;
    }
    
    System.out.println("Soma: " + soma);
  }
}
