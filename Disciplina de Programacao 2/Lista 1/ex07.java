/* Faça um programa que mostra a soma e a média dos elementos de um vetor */

public class ex07{

	// C R I A R  M É T O D O  F O R M U L A
	public static void formula (int t){

		int[] elementos = new int[t];
		int soma = 0;
		
		for(int i=0; i<t; i++){
			elementos[i] = Input.readInt("Informe o " + (i+1)+ "º elemento: ");
			System.out.println(soma + " + " + elementos[i]);
			soma += elementos[i];
			System.out.println(" = " + soma);
			
		}
		
		System.out.println("Total: " + soma);
		System.out.println("Média: " + (soma/t));	

	}

	// M É T O D O  P R I N C I P A L
	public static void main(String[] args){
		
		int tamanho_Vetor;
		
		tamanho_Vetor = Input.readInt("Informe a quantidade de elementos: ");
		formula(tamanho_Vetor);
		
	}

}
