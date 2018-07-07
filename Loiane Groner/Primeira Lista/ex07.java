import java.util.Scanner;

public class ex07 {
    puclic static void main(String[] args){

        Scanner scan = new Scanner(System.in);

        System.out.println("Informe o comprimento de um lado: ");
        double lado = scan.nextDouble();
        
        //double area = lado * lado;
        double area = Math.pow(lado, 2);
        double dobroArea = area * 2;

        System.out.println("A área do quadrado é " + area);
        System.out.println("O dobro da área é " + dobroArea);
        
    }
}
