import java.util.Scanner;

public class ex03{

    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);

        double total;

        System.out.println("Informe o custo do veículo:");
        double custo = scan.nextDouble();
        System.out.println("Informe a porcentagem de impostos: ");
        double porcem = scan.nextDouble();
        System.out.println("Informe a porcentagem do lucro: ");
        double lucro = scan.nextDouble();

        total = custo + ((custo/100) * porcem) + ((custo/100)* lucro);

        System.out.println(custo + " + " + porcem + " + " + lucro + " = " + total);
    }
}
