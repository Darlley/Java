public class ex02{
    public static void main(String[] args){
        int vetorA[] = new int[8], vetorB[] = new int[vetorA.length];
        vetorA[0] = 1;
        vetorA[1] = 2;
        vetorA[2] = 4;
        vetorA[3] = 6;
        vetorA[4] = 8;
        vetorA[5] = 10;
        vetorA[6] = 12;
        vetorA[7] = 14;

        for(int i=0; i <= vetorA.length; ++i){
            vetorB[i] = vetorA[i]*2;
            System.out.println("Valor adicionado no índice " + i + ": " + vetorB[i]);
        }
    }
}
