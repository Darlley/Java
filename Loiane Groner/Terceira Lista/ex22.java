import java.util.Scanner;

public class ex22{

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Informe a quantidade de CD: ");
        int cds = scan.nextInt();

        double preco;
        double soma = 0;

        for(int i = 1; i <= cds; i++){
            System.out.println("Informe o valor do CD " + i + ":");
            preco = scan.nextDouble();

            soma += preco;
        }

        double media = soma / cds;
        System.out.println("Média: " + media);
    }
}
