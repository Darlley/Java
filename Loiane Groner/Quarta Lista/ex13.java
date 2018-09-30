import java.util.Scanner;
public class ex13{
    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);
        int soma=0, vetorA[] = new int[10];

        for(int i=0; i<vetorA.length; i++){
            vetorA[i] = scan.nextInt();
            if(vetorA[i] % 5 == 0) {
                soma += vetorA[i];
            }
        }
        System.out.print("Quantidade de pares: " + soma);
    }
}
