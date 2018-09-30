import java.util.Scanner;
public class ex18{
    public static void main(String[] args){
        
        Scanner scan = new Scanner(System.in);
        int, indexMenor=0, indexMaior=0, maior=0, menor=0, vetorA[] = new int[10];
        
        for(int i=0; i<=9; i++){
            System.out.println("Informe uma idade: ");
            vetor[i] = scan.nextInt();
        }
        
        indexMenor = 0;
        menor = vetorA[0];
        indexMaior = 0;
        maior = vetorA[0];
        
        for(int i=1; i<vetorA.length; i++){
            
            if(vetorA[i] > maior){
                maior = vetorA[i];
                indexMaior = i;
            }else if(vetorA[i] < menor){
                menor = vetor[i];
                indexMenor = i;
            }
        }
        
        System.out.println("MAIOR: " + maior);
        System.out.println("Indice de MAIOR: " + indexMaior);
        System.out.println("MAIOR: " + maior);
        System.out.println("Indice de MENOR: " + indexMenor);
    }
}
