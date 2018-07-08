import java.util.Scanner;

public class ex10{

  public static void main(String[] args){
  
    Scanner scan = new Scanner(System.in);
    
    System.out.println("Informe o salário do colaborador: ");
    double salario = scan.nextDouble();
    double acrescimoSalario = 0;
    double porcem = 0;
    
    System.out.println("O salário do colaborador é de: " + salario);
    
    if(salario <= 280){
      porcem = 0.2;
      acrescimoSalario = (salario * porcem)/100;
    }else if(salario > 280 && salario <= 700){
      porcem = 0.15;
      acrescimoSalario = (salario * porcem)/100;
    }else if(salario > 700 && salario <= 1500){
      porcem = 0.1;
      acrescimoSalario = (salario * porcem)/100;
    }else{
      porcem = 0.05;
      acrescimoSalario = (salario * porcem)/100;
    }
    
    System.out.println("O valor acrescido foi de: " + acrescimoSalario);
    System.out.println("O percentual reajustado foi de: " + porcem);
    System.out.println("");
    System.out.println("    ============ | TOTAL | ============" );
    System.out.println("SALÁRIO REAJUSTADO: " + (salario + acrescimoSalario));
  }
}
