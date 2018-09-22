import java.util.Scanner;
public class ex01{
    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);
        int soma=0, vetorA[] = new int[10];

        for(int i=0; i<vetorA.length; i++){
            vetorA[i] = scan.nextInt();
            soma += vetorA[i];
        }
        System.out.print("Soma dos números contidos no vetor: " + soma);
    }
}
