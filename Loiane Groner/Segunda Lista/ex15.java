import java.util.Scanner;

public class ex15 {

    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);

        System.out.println("Informe o primeiro lado: ");
        int lado1  = scan.nextInt();
        System.out.println("Informe o segundo lado: ");
        int lado2  = scan.nextInt();
        System.out.println("Informe o terceiro lado: ");
        int lado3  = scan.nextInt();

        if(lado1 + lado2 > lado3 || lado1 + lado3 > lado2 || lado2 + lado3 > lado1){
            System.out.printl("Forma um triângulo!");
        }else if(lado1 == lado2 && lado2 == lado3){
            System.out.printl("Forma um triângulo Equilatero!");
        }else if(lado1 == lado2 || lado1 == lado3 || lado2 == lado3){
            System.out.printl("Forma um triângulo Isósceles!");
        }else(lado1 != lado2 && lado1 != lado3 && lado2 != lado3){
            System.out.printl("Forma um triângulo Escaleno!");
        }
    }
}
