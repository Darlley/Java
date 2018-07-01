import java.util.Scanner;

public class ConvercaoTemperatura {
    puclic static void main(String[] args){

        Scanner scan = new Scanner(System.in);

        System.out.println("Informe a temperatura: ");
        double temperaturaFahrenheit  = scan.nextDouble();
        double ceusios = 5 * (temperaturaFahrenheit-32)/9;

        System.out.println("A temperatura convertida em celsius é " + ceusios);
    }
}
