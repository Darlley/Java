import java.util.Scanner;

public class ex06 {
  puclic static void main(String[] args){
    
    Scanner scan = new Scanner(System.in);
    
    System.out.println("Informe o raio do circulo: ");
    double raio = scan.nextDouble();
    
    //double area = 3.14 * (raio * raio) 
    double area = Math.PI * Math.pow(raio, 2);
    
    System.out.println("A área é " + area);
    
  }
}
