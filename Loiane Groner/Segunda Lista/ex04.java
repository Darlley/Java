import java.util.Scanner;

public class ex01 {

    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);

        String umaLetra;
        System.out.println("Informe uma letra[em maiuscula]:");
        umaLetra = scan.nextLine();

        switch(umaLetra){
            case "A":
            case "E":
            case "I":
            case "O":
            case "U":
                System.out.println("O valor informado é uma vogal!");
                break;
            case "B":
            case "C":
            case "D":
            case "F":
            case "G":
            case "H":
            case "J":
            case "K":
            case "L":
            case "M":
            case "N":
            case "P":
            case "Q":
            case "R":
            case "S":
            case "T":
            case "V":
            case "W":
            case "X":
            case "Y":
            case "Z":
                System.out.println("O valor informado é uma consoante!");
                break;
            default:
                System.out.println("Valor invalido!");
                break;
        }
    }
}
