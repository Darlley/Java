import java.util.Scanner;

public class DobroArea {
    puclic static void main(String[] args){

        Scanner scan = new Scanner(System.in);

        System.out.println("Informe o comprimento de um lado: ");
        double lado = scan.nextDouble();
        double area = lado * lado;
        double dobroArea = area * 2;

        System.out.println("O dobro da área é " + dobroArea);
    }
}
