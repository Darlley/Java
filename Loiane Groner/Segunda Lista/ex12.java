import java.util.Scanner;

public class ex12{

  public static void main(String[] args){
  
    Scanner scan = new Scanner(System.in);
    
    System.out.println("Informe quanto recebe por horas trabalhadas: ");
    double salarioHoras = scan.nextDouble();
    System.out.println("Informe as horas trabalhadas no mês: ");
    double totalHoras = scan.nextDouble();
    
    double salarioBruto = (salarioHoras * totalHoras)
    double acrescimoSalario = 0;
    double porcem = 0;
    double inss = (salarioBruto * 0.1)/100;
    double fgts = (salarioBruto * 0.11)/100;
    
    System.out.println("O salário total colaborador é de: " + salarioBruto);
    
    if(salario > 900 && <= 1500){
      porcem = 0.05;
      acrescimoSalario = (salarioBruto * porcem)/100;
    }else if(salario > 1500 && salario <= 2500){
      porcem = 0.1;
      acrescimoSalario = (salarioBruto * porcem)/100;
    }else{
      porcem = 0.2;
      acrescimoSalario = (salarioBruto * porcem)/100;
    }

    System.out.println("(-) Imposto de Renda (" + porcem + "): " + acrescimoSalario);
    System.out.println("INSS (10%): "+ inss);
    System.out.println("FGTS (11%): "+ fgts);
    System.out.println("");
    System.out.println("    ============ | TOTAL | ============" );
    System.out.println("Total de descontos "+ (acrescimoSalario - inss - fgts));
    System.out.println("Salário Líquido: " + (salarioBruto - acrescimoSalario - inss - fgts));
  }
}
