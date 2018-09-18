import java.util.Scanner;
public class ex08{
    public static void main(String[] args){
        
        Scanner scan = new Scanner(System.in);
        int vetorA[] = new int[10];
        int vetorB[] = new int[vetorA.length];
        int vetorC[] = new int[vetorA.length];
        
        System.out.print("VETOR A:");
        for(int i=0; i<vetorA.length; i++){
            System.out.print(i + "º valor: ");
            vetorA[i] = scan.nextInt();
        }
        
        System.out.print("VETOR B:");
        for(int i=0; i<vetorA.length; i++){
            System.out.print(i + "º valor: ");
            vetorB[i] = scan.nextInt();
            vetorC[i] = vetorA[i] * vetorB[i];
        }

        System.out.print("RESULTADO: ");
        for(int i=0; i <= vetorC.length; ++i){
            System.out.println("Valor adicionado no índice " + i + ": " + vetorC[i]);
        }
    }
}
