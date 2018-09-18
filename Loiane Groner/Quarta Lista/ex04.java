import java.util.Scanner;
public class ex01{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int vetorA[] = new int[15];
        Double vetorB[] = new double[vetorA.length];
        
        for(int i=0; i<=vetorA.length; i++){
            System.out.print("Informe o valor " + (i+1));
            vetorA[i] = scan.nextInt(); 
            vetorB[i] = Math.sqrt(vetorA[i]);
        }
        
        DecimalFormat df = new DecimalFormat("###,###.###");

        for(int i=0; i <= vetorA.length; ++i){
            System.out.println("Valor adicionado no índice " + i + ": " + df.format(vetorB[i]));
        }
    }
}
