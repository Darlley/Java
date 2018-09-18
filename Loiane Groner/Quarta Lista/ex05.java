import java.util.Scanner;
public class ex05{
    public static void main(String[] args){
        
        Scanner scan = new Scanner(System.in);
        int vetorA[] = new int[15], vetorB[] = new int[vetorA.length];
        
        for(int i=0; i<=vetorA.length; i++){
            System.out.print("Informe o valor " + (i+1));
            vetorA[i] = scan.nextInt(); 
            vetorB[i] = vetorA[i]*i;
        }

        for(int i=0; i <= vetorA.length; ++i){
            System.out.println("Valor adicionado no índice " + i + ": " + vetorB[i]);
        }
    }
}
