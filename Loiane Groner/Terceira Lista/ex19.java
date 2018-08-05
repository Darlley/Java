import java.util.Scanner;

public class ex19{

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        double media = 0;
        int resp = 1;
        int i = 0;

        while(resp == 1){
            System.out.println("Informe uma nota: ");
            double nota = scan.nextDouble();
            System.out.println("Deseja continuar? [1] - Sim/[2] - Não");
            resp = scan.nextInt();

            nota += nota;
            i++;
            media = nota/i;
        }
        System.out.println("Media: " + media);
    }
}
