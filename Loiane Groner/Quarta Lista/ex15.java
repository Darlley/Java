import java.util.Scanner;
public class ex01{
    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);
        int par=0, impar=0, soma=0, vetorA[] = new int[10];

        for(int i=0; i<vetorA.length; i++){
            vetorA[i] = scan.nextInt();
            if(vetorA[i] % 2 == 0) {
                par++;
            }else{
                impar++;
            }
        }
        System.out.print("Percentual de pares: " + (vetorA.length/100)*par);
        System.out.print("Percentual de impares: " + (vetorA.length/100)*impar);
    }
}
