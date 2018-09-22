import java.util.Scanner;
public class ex01{
    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);
        int impar=0, soma=0, vetorA[] = new int[10];

        for(int i=0; i<vetorA.length; i++){
            vetorA[i] = scan.nextInt();
            if(vetorA[i] % 2 != 0) {
                soma += vetorA[i];
                impar++;
            }
        }
        System.out.print("Quantidade de pares: " + (soma/impar));
    }
}
