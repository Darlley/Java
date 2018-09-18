import java.util.Scanner;
public class ex10{
    public static void main(String[] args){
        
        Scanner scan = new Scanner(System.in);
        int vetorA[] = new int[10];
        int vetorB[] = new int[vetorA.length];
        
        for(int i=0; i<=vetorA.length; i++){
            System.out.print((i+1) + "º valor: ");
            vetorA[i] = scan.nextInt();
            vetorB[i] = vetorA[i] % 2;
        }
        
        System.out.print("RESULTADO: ");
        for(int i=0; i <= vetorB.length; i++){
            System.out.println("Valor adicionado no índice " + i + ": " + vetorB[i]);
        }
    }
}
