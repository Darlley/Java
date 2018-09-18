import java.util.Scanner;
public class ex03{
    public static void main(String[] args){
        
        Scanner scan = new Scanner(System.in);
        int vetorA[] = new int[15], vetorB[] = new int[vetorA.length];
        
        for(int i=0; i<=vetorA.length; i++){
            System.out.print("Informe o valor " + (i+1));
            vetorA[i] = scan.nextInt(); 
        }

        for(int i=0; i <= vetorA.length; ++i){
            vetorB[i] = vetorA[i]*vetorA[i];
            System.out.println("Valor adicionado no índice " + i + ": " + vetorB[i]);
        }
    }
}
