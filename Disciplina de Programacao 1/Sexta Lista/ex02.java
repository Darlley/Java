 public class ex02{
	public static void main(String args[]){
	
		int i = 0, x, indice, vetor [] = new int[20]; 
		boolean naoachou;
		
		do{
			vetor[i] = Input.readInt("Valor "+ (i+1) +": ");
			i++;
		}while(i<20);
	
		i=0;
		indice = 0;
		
		while(i<20){
			if(vetor[i] % 2 == 0){
				System.out.println("\nIndice: "+i);
				indice++;
			}
			i++;	
		}
		System.out.println("Total pares: " + indice);

	}
}
