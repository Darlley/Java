import java.util.Scanner;

public class ex01 {

    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);

  // - - - - - - - - - - - - - - - - - - - - 

        System.out.println("Quando voce ganha por hora?");
        double salarioHora = scan.nextDouble();
        System.out.println("Quantas horas você trabalha no mês?");
        double horasTotal = scan.nextDouble();

  // - - - - - - - - - - - - - - - - - - - -

        double salarioTotal = salarioHora * horasTotal;
        double inss = (salarioTotal/100) * 8;
        double impostoRenda = (salarioTotal/100) * 11;
        double sindicato = (salarioTotal/100) * 5;
        double salarioDescontado = impostoRenda + inss + sindicato;
        double salarioFinal = salarioTotal - salarioDescontado;

  // - - - - - - - - - - - - - - - - - - - -

        System.out.println("Seu Salario Bruto é de: " + salarioTotal);
        System.out.println("Seu Imposto de Renda é de: " + impostoRenda);
        System.out.println("Seu INSS é de: " + inss);
        System.out.println("Seu Imposto de Sindicato: " + sindicato);
        System.out.println("================ | TOTAL | ================");
        System.out.println("O total descontado de seu salário é de: " + salarioDescontado);
        System.out.println("Seu Salário Líquido é de: " + salarioFinal);

    }
}
