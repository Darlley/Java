import java.util.Scanner;

public class ex10 {

    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);

        System.out.println("Informe o turno em que estuda: ");
        System.out.println("ATENÇÃO: V para vespertino, M para Matutino e N para Noturno!");
        String turnoInformado = scan.nextLine();

        String mensagem;

        switch(turnoInformado) {
            case "M":
            case "m":
                mensagem = "Bom dia!";
                break;
            case "V":
            case "v":
                mensagem = "Boa tarde!";
                break;
            case "N":
            case "n":
                mensagem = "Boa noite!";
                break;
            default:
                mensagem = "Valor inválido!";

        }
    }
}
