import java.util.Scanner;
public class ex11{
    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);
        int par=0, vetorA[] = new int[10];

        for(int i=0; i<vetorA.length; i++){
            System.out.print("Informe um valor: ");
            vetorA[i] = scan.nextInt();
            
            if(vetorA[i] % 2 == 0){
                par++;
            }
        }
        System.out.print("Quantidade de pares: " + par);
    }
}
