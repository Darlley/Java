import java.util.Scanner;
public class ex01{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int, a=0, b=0, c=0, vetorA[] = new int[10];
        
        for(int i=0; i<=9; i++){
            System.out.println("Informe um valor: ");
            vetor[i] = scan.nextInt();
            
            if(vetor[i] < 15){
                a += vetor[i];
            }else if(vetor[i] == 15){
                b++;
            }else{
                c += vetor[i];
                
            }
        }
        
        System.out.println("Soma: " + a);
        System.out.println("Quantidade: " + b);
        System.out.println("Média: " + ((c/100)*10));
        
        
        
    }
}
