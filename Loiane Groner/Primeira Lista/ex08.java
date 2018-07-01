import java.util.Scanner;

public class SalarioPorHora {

    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);

        System.out.println("Informe quanto ganha por hora: ");
        double salarioHora  = scan.nextDouble();
        System.out.println("Informe quantas horas trabalha: ");
        double horasTrabalhadas  = scan.nextDouble();

        double salarioMensal = salarioHora * horasTrabalhadas;

        System.out.println("Seu salário ao final do mês é de " + salarioMensal);
    }
}
