import java.util.Scanner;
public class ex9{
    public static void main(String[] args){
        
        Scanner scan = new Scanner(System.in);
        int vetorA[] = new int[10];
        int vetorB[] = new int[vetorA.length];
        
        for(int i=0; i<vetorA.length; i++){
            System.out.print(i + "º valor: ");
            vetorA[i] = scan.nextInt();
            vetorB[i] = vetorA[i] % 2;
        }
        
        System.out.print("RESULTADO: ");
        for(int i=0; i <= vetorC.length; ++i){
            System.out.println("Valor adicionado no índice " + i + ": " + vetorC[i]);
        }
    }
}
