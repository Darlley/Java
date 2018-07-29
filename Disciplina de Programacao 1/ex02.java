import java.util.Scanner;

public class ex02{

    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);

        int totalSegundos;

        System.out.println("Informe o horario detalhadamente abaixo:");
        System.out.println("Horas: ");
        int horas = scan.nextInt();
        System.out.println("Minutos: ");
        int minutos = scan.nextInt();
        System.out.println("Segundos: ");
        int segundos = scan.nextInt();

        totalSegundos = ((60 * minutos) * (60 * horas)) + segundos;

        System.out.println("O horário " + horas + ":" + minutos + ":" + segundos + " tem " + totalSegundos + " segundos.");
    }
}
