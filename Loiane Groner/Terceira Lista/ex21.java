import java.util.Scanner;

public class ex21{

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Informe a quantidade de turmas: ");
        int numTurmas = scan.nextInt();

        int numAlunos;
        int soma = 0;
        boolean invalido = true;

        for(int i = 1; i <= numTurmas; i++){

            invalido = true;
            do {
                System.out.println("Informe o numero de alunos da turma " + i + ":");
                numAlunos = scan.nextInt();

                if (numAlunos <= 40) {
                    invalido = false;
                }else{
                    System.out.println("Numero de alunos inválido!");
                }
            }while(invalido);

            soma += numAlunos;
        }

        double media = soma / numTurmas;
        System.out.println("Média: " + media);
    }
}
