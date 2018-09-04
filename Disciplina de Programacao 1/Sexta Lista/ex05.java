public class ex05{
    public static void main(String args[]){
        int acumulador = 0, vetorA [] = new int[50], vetorB [] = new int[50], i = 0, j = 49;

        while(vetorA[i] == vetorB[j]){
            acumulador = vetorA[i] - vetorB[j];
            i++;
            j--;
        }
        System.out.println(acumulador);

    }
}
