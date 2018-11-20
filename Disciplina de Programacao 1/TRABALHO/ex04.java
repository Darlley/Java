public class ex04{
	public static void main(String[] args){
		String nomes[] = new String[10];
		double notas[][] = new double[10][3];
		double media[] = new double[10];
		
		// ENTRADA DE NOMES
		for(int i=0; i<=9;i++){
			nomes[i] = Input.readString("Aluno "+ (i+1) +": ");			
		}
		
		// ATRIBUIÇÃO DE NOTAS
		System.out.print("Notas do aluno "+ nomes[0] + ": \n");
		notas[0][0] = Input.readDouble("Nota 1: ");
		notas[0][1] = Input.readDouble("Nota 2: ");
		notas[0][2] = Input.readDouble("Nota 3: ");
		
		double maior = notas[0][0];
		double menor = notas[0][0];
		
		// MEDIA DE ALUNO 1
		media[0] = (notas[0][0] + notas[0][1] + notas[0][2])/3;
		double atual = media[0];
		
		for(int i=1; i<=9;i++){
			System.out.print("Notas do aluno "+ nomes[i] + "\n");
			for(int j=0; j<=2; j++){
				notas[i][j] = Input.readDouble("Informe a nota "+ (j+1) +" de " + nomes[i] +": ");

				// C- MAIOR NOTA DE PORTUGUÊS
				if(j == 1){
					if(maior < notas[i][j]){
						maior = notas[i][j];
					}else if(menor > notas[i][j]){
						menor = notas[i][j];
					}
				}
				
				// B- MEDIA
				if(j == 2){
					media[i] = (notas[i][0] + notas[i][1] + notas[i][2])/3;
					
					// D- CLASSIFICAÇÃO (INCONPLETO)
					if(atual < media[i]){
						// - - -
					}
					atual = media[i];
				}
			
			}
			System.out.println("");
		}
		
		System.out.println("B)");
		for(int i=0; i<=9;i++){
			System.out.println("MEDIA DE " + nomes[i] + ": " + media[i]);
		}
		System.out.println("");
		System.out.println("C)");
		System.out.println("MAIOR NOTA DE PORTUGUÊS: " + maior);
		System.out.println("MENOR NOTA DE PORTUGUÊS: " + menor);
	}
}
