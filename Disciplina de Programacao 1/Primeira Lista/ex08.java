import java.util.Scanner;

public class ex08{

    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);

        double area;

        System.out.println("Informe a largura do retângulo: ");
        double largura = scan.nextDouble();
        System.out.println("Informea a altura do retângulo: ");
        double altura = scan.nextDouble();
        
        area = largura * altura;
        
        System.out.println("O retângulo tem uma área de " + area + "M.");
    }
}
