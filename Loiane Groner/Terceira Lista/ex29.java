import java.util.Scanner;

public class ex29{

    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);
    
        System.out.println("Informe um número: ");
        int num = scan.nextInt();
        
        for(int i=1; 1<=num; i++){
          boolean primo = true;
          
          for(int j=2; j<i; j++){
            if(ni % j == 0){
                primo = false;
            }
          }

          if(primo){
              System.out.print(i);
          }
        }
        
    }
}
