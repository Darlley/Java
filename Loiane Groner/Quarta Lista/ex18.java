import java.util.Scanner;
public class ex18{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int, maior=0, menor=0, vetorA[] = new int[10];
        
        for(int i=0; i<=9; i++){
            System.out.println("Informe uma idade: ");
            vetor[i] = scan.nextInt();
            
            if(maior < vetor[i]){
                maior = vetor[i];
            }else if(vetor[i] < menor){
              menor = vetor[i];
            }
        }
        
        System.out.println("MAIOR: " + maior);
        System.out.println("MENOR: " + menor);
    }
}
