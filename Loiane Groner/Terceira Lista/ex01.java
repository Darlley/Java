import java.util.Scanner;

public class ex01 {

    public static void main(String[] args){
        //peça nota entre 0 a 10, mensagem de erro caso valor maior que 10, continue pedindo ate o valor ser valido
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
