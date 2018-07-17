import java.util.Scanner;

public class ex01 {

    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);

        bolean notaValida = false;
        
        do{
            System.out.println("Informe uma nota entre 0 e 10: ");
            double nota = scan.nextDouble();

            if(nota > 0 && nota <= 10) {
                notaValida = true;
                System.out.println("Você digitou: " + nota);
            }else{
                System.out.println("Nota inválida, digite novamente");
            }
        } while (!notaValida);
    }
}
