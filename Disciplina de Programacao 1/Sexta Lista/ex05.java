blic class ex05{
    public static void main(String args[]){
        int acumulador = 0, vetorA [] = new int[5], vetorB [] = new int[5], i = 0, j = 4;
        
        for(i=0; i<5; i++){
            vetorA[i] = Input.readInt("VETOR A - Valor " + (i+1) + ": ");
            vetorB[i] = Input.readInt("VETOR B - Valor " + (i+1) + ": ");
        }
		i = 0;
		
        while(i <= 5 && j >= 0){
            acumulador += vetorA[i] - vetorB[j];
            i++;
            j--;
        }
		
        System.out.println("RESULTADO: " + acumulador);
    }
}
