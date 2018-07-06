import java.util.Scanner;

public class ex01 {

    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);

        System.out.println("Digite o nome de usuário: ");
        String nome = scan.nextLine();

        System.out.println("Digite sua senha: ");
        String senha = scan.nextLine();

        do {
            System.out.println("Nome de usuário e senha não podem ser iguais");
            System.out.println("Digite sua senha: ");
            senha = scan.nextLine();
        }while (nome == senha);

    }
}
