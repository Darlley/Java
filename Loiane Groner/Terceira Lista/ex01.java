import java.util.Scanner;

public class ex01 {

    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);

        String mensagem = "Informe uma nota entre 0 e 10: ";

        System.out.println(mensagem);
        int nota = scan.nextInt();

        while (nota > 10) {
            System.out.println("Infome uma nota válida: ");
            nota = scan.nextInt();
        }

    }
}
