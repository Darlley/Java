import java.util.Scanner;

public class CentimetrosParaMetros {
  puclic static void main(String[] args){
    
    Scanner scan = new Scanner(System.in);
    
    System.out.println("Quantos metros quer converter: ");
    double metros = scan.nextDouble();
    
    
    double centimetros = metros/100;
    
    System.out.println("O numero informado tem " + centrimetros + " centimetros!");
  }
}
