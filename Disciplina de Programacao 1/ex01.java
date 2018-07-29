import java.util.Scanner;

public class ex01{

    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);

        int idade;

        System.out.println("Qual seu nome? ");
        String nome = scan.nextLine();
        System.out.println("Informe sua idade detalhadamente abaixo:");
        System.out.println("Anos: ");
        int idAno = scan.nextInt();
        System.out.println("Meses: ");
        int idMes = scan.nextInt();
        System.out.println("Dias: ");
        int idDia = scan.nextInt();

        idade = (365 * idAno) + (30 * idMes) + idDia;

        System.out.println(nome + ", você já viveu " + idade + " dias.");
    }
}
