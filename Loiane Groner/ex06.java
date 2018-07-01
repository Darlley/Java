import java.util.Scanner;

public class AreaCirculo {
  puclic static void main(String[] args){
    
    Scanner scan = new Scanner(System.in);
    
    System.out.println("Informe o raio do circulo: ");
    double raio = scan.nextDouble();
    
    
    double area = 3.14 * (raio * raio)    
    System.out.println("O numero informado foi " + area);
  }
}
