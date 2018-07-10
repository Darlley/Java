import java.util.Scanner;

public class ex11{

    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);

        System.out.println("Informe o salário do colaborador: ");
        double salario = scan.nextDouble();

        int porcem;
        if(salario <= 280){
            porcem = 20;
        }else if(salario > 280 && salario <= 700){
            porcem = 15;
        }else if(salario > 700 && salario <= 1500){
            porcem = 10;
        }else{
            porcem = 5;
        }

        double acrescimoSalario = (salario / 100) * porcem;

        System.out.println("Salário (R$): " + salario);
        System.out.println("Percentual (%): " + porcem);
        System.out.println("Aumento (R$): " + acrescimoSalario);
        System.out.println("");
        System.out.println("============ | TOTAL | ============" );
        System.out.println("SALÁRIO REAJUSTADO: " + (salario + acrescimoSalario));
    }
}
