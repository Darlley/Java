public class ex01{
    public static void main(String[] args){
        int vetorA[] = new int[5], vetorB[] = new int[5];
        vetorA[0] = 1;
        vetorA[1] = 2;
        vetorA[2] = 3;
        vetorA[3] = 4;
        vetorA[4] = 5;

        for(int i=0; i <= vetorA.length; i++){
            vetorB[i] = vetorA[i];
            System.out.println("Valor adicionado no índice " + i + ": " + vetorB[i]);
        }
    }
}
