import java.util.Scanner;

public class ex04 {

    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);

        System.out.println("Informe uma letra[em maiuscula]:");
        String umaLetra = scan.nextLine();

        switch(umaLetra){
            case "A":
            case "E":
            case "I":
            case "O":
            case "U":
            case "a":
            case "e":
            case "i":
            case "o":
            case "u":
                System.out.println("O valor informado é uma vogal!");
                break;
            default:
                System.out.println("O valor informado é uma consoante!");
        }
    }
}
