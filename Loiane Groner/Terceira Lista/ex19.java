import java.util.Scanner;

public class ex19{

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Informe a quantidade de notas: ");
        int notas = scan.nextInt();

        double soma = 0;
        double media = 0;
        double nota = 0;

        for(int i = 0; i<notas;i++){
            System.out.println("Informe a nota " + (i+1) + ": ");
            nota = scan.nextInt();

            soma += nota;
        }

        media = soma / notas;

        System.out.println("Soma: " + soma);
        System.out.println("Media: " + media);
    }
}
