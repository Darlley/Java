import java.util.Scanner;
public class ex17{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int, a=0, vetorA[] = new int[10];
        
        for(int i=0; i<=9; i++){
            System.out.println("Informe uma idade: ");
            vetor[i] = scan.nextInt();
            
            if(vetor[i] > 35){
                a++;
            }
        }
        
        System.out.println("Quantidade de idades superiores a 35: " + a);    
    }
}
