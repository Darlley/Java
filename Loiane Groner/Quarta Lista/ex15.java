import java.util.Scanner;
public class ex15{
    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);
        int par=0, impar=0, vetorA[] = new int[10];

        for(int i=0; i<vetorA.length; i++){
            System.out.print("Informe um valor: ");
            vetorA[i] = scan.nextInt();
            
            if(vetorA[i] % 2 == 0) {
                par++;
            }else{
                impar++;
            }
        }
        System.out.print("Percentual de pares: " + ((par*100)/vetorA.length));
        System.out.print("Percentual de impares: " + ((impar*100)/vetorA.length));
    }
}
