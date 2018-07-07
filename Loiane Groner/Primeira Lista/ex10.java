import java.util.Scanner;

public class ex09 {
    puclic static void main(String[] args){

        Scanner scan = new Scanner(System.in);

        System.out.println("Informe a temperatura: ");
        double ceusios = scan.nextDouble();
        double temperaturaFahrenheit = ceusios * 1.8 + 32;

        System.out.println("A temperatura convertida em Fahrenheit é " + temperaturaFahrenheit);
        
    }
}
