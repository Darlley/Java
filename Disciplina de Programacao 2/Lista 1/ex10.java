/* Escreva um algoritmo que leia um vetor de 10 posições e mostreo. Faça um procedimento que faça um vetor inverso, trocando o 1º
elemento com o último, o 2º elemento com o penúltimo e assim
sucessivamente. Mostre o novo vetor depois da troca. */

public class ex10{

	// C R I A R  M É T O D O
	public static void inverte(int[] v){
		int aux;
		
		aux = v[0];
		v[0] = v[9];
		v[9] = aux;
		
		aux = v[1];
		v[1] = v[8];
		v[8] = aux;
		
		aux = v[2];
		v[2] = v[7];
		v[7] = aux;
		
		aux = v[3];
		v[3] = v[6];
		v[6] = aux;
		
		aux = v[4];
		v[4] = v[5];
		v[5] = aux;
		
		System.out.println("\nI N V E R T I D O");
		for(int i=0; i<v.length;i++){
			System.out.println(v[i]);
		}
	}

	// M É T O D O  P R I N C I P A L
	public static void main(String[] args){
		int[] valores = new int[10];
		
		for(int i=0; i<valores.length; i++){	
			valores[i] = Input.readInt("Informe um valor: ");
		}
		inverte(valores);
	}

}
