import java.util.Scanner;

public class ex018{

    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);

        boolean primo = true;

        System.out.println("Informe um número: ");
        int number = scan.nextInt();

        for(int i = 2; i < number; i++){
            if(number % i == 0){
                System.out.println("Não é primo!");
                primo = false;
                break;
            }
        }

        if(primo){
            System.out.print("O número digitado é Primo!");
        }
    }
}
