import java.util.Scanner;

public class ex10 {
  public static void main(Sting[] args){
  
    Scanner scan = new Scanner(System.in);
    
    System.out.println("Entre com o primeiro número: ");
    int num1 = scan.nextInt();
    
    System.out.println("Entre com o segundo número: ");
    int num2 = scan.nextInt();
    
    for(int i = num1; i <= num2; i++){
      System.out.println(i);
    }
  }
}
