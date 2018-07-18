import java.util.Scanner;

public class ex02 {

    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);

        boolean infoValidas = false;
        do {
            System.out.println("Digite o nome de usuário: ");
            String nome = scan.next();

            System.out.println("Digite sua senha: ");
            String senha = scan.next();
            
            if(nome.equalsIgnoreCase(senha)){
                System.out.print("Senha e usuario não podem ser parecidos!");
            } else {
                infoValidas = true;
                System.out.println("Completado com sucesso!");
            }
        } while (!infoValidas);

    }
}
