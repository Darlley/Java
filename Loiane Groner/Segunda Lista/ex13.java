import java.util.Scanner;

public class ex13 {
    public static void main(String[] args) {
    
        Scanner scan = new Scanner(System.in);

        System.out.println("Informe o número: ");
        int dia = scan.nextInt();
        String correspondente = "";
        
        switch (dia){
            case 1:
                correspondente = "Domingo";
                break;
            case 2:
                correspondente = "Segunda";
                break;
            case 3:
                correspondente = "Terça";
                break;
            case 4:
                correspondente = "Quarta";
                break;
            case 5:
                correspondente = "Quinta";
                break;
            case 6:
                correspondente = "Sexta";
                break;
            case 7:
                correspondente = "Sábado";
                break;
            default:
                correspondente = "Valor inválido";
                break;
        }
        
        System.out.println(correspondente);

    }
}
