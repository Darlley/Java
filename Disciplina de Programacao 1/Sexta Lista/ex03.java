 public class ex03{
	public static void main(String args[]){
	
		int i = 0, vetor1 [] = new int[10], vetor2 [] = new int[10], vetor3 [] = new int[10];
		
		System.out.print("=== VETOR 1 ===\n");
		do{
			vetor1[i] = Input.readInt("Valor "+ (i+1) +": ");
			i++;
		}while(i<10);
		i=0;
		
		System.out.print("\n=== VETOR 2 ===\n");
		do{
			vetor2[i] = Input.readInt("Valor "+ (i+1) +": ");
			i++;
		}while(i<10);
		
		System.out.print("\n=== RESULTADO ===\n");
		for(i=0; i<10; i++){
			vetor3[i] = (vetor1[i] * vetor2[i]);
			System.out.print("\nIndice " + i + " = " + vetor3[i] + "\n");
		}

	}
}
