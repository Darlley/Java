import java.util.Scanner;

public class ex12{

    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);

        System.out.println("Informe quanto recebe por horas trabalhadas: ");
        double salarioHoras = scan.nextDouble();
        System.out.println("Informe as horas trabalhadas no mês: ");
        double totalHoras = scan.nextDouble();

        double salarioBruto = (salarioHoras * totalHoras);

        int porcem;
        if (salarioBruto < 900){
            porcem = 0;
        }else if(salarioBruto > 900 && salarioBruto <= 1500){
            porcem = 5;
        }else if(salarioBruto > 1500 && salarioBruto <= 2500){
            porcem = 10;
        }else{
            porcem = 20;
        }

        double acrescimoSalario = (salarioBruto / 100) * porcem;
        double inss = (salarioBruto / 100) * 10;
        double fgts = (salarioBruto / 100) * 11;

        System.out.println("Salário Bruto ("+ salarioHoras + ") * (" + totalHoras + "): " + salarioBruto);
        System.out.println("(-) IR (" + porcem + "): " + acrescimoSalario);
        System.out.println("(-) INSS (10%): "+ inss);
        System.out.println("FGTS (11%): "+ fgts);
        System.out.println("");
        System.out.println("============ | TOTAL | ============" );
        System.out.println("Total de descontos "+ (acrescimoSalario + inss));
        System.out.println("Salário Líquido: " + (salarioBruto - acrescimoSalario - inss));
    }
}
