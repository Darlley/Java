import java.util.Scanner;
public class ex16{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int, a=0, b=0, c=0, d=0, vetorA[] = new int[10];
        
        for(int i=0; i<=9; i++){
            System.out.println("Informe um valor: ");
            vetor[i] = scan.nextInt();
            
            if(vetor[i] < 15){
                a += vetor[i];
            }else if(vetor[i] == 15){
                b++;
            }else{
                c += vetor[i];
                d++; 
            }
        }
        
        System.out.println("N < 15: " + a);
        System.out.println("N = 15: " + b);
        System.out.println("Média de N > 15: " + (c/d));
    }
}
