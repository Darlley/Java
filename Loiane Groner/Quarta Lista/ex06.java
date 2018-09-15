import java.util.Scanner;
public class ex06{
    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);
        int vetorA[] = new int[15], vetorB[] = new int[vetorA.length], vetorC[] = new int[vetorA.length];

        for(int i=0; i<vetorA.length; i++){
            vetorA[i] = scan.nextInt();
            vetorB[i] = scan.nextInt();
        }

        for(int i=0; i <= vetorA.length; ++i){
            vetorC[i] = vetorA[i] + vetorB[i];
            System.out.println("Valor adicionado no índice " + i + ": " + vetorC[i]);
        }
    }
}
