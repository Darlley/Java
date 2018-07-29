import java.util.Scanner;

public class ex18{

    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);
        
        int count = 0;
        
        System.out.println("Informe um número: ");
        int number = scan.nextInt
        
        for(int i = 0; i < number; i++){
          if(number % i == 0){
            count++;
          }
        }
        
        if(count == 2){
          System.out.print("O número digitado é Primo!")
        }else{
          System.out.print("O número digitado não é Primo!")
        }
    }
}
