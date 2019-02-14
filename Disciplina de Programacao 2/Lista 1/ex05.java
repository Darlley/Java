/* Elaborar um programa para efetuar o cálculo e a apresentação do valor de uma prestação em atraso, utilizando a fórmula: PRESTACAO <- VALOR + (VALOR * (TAXA / 100) * TEMPO). */

public class ex05{

	// C R I A R  M É T O D O
	public static void calculaPrestacao (double v, double tp, double tx){

		System.out.println("Prestação: " + (v + (v * (tx / 100) * tp)));
		
	}

	// M É T O D O  P R I N C I P A L
	public static void main(String[] args){
    
		double tempo;
		double taxa;
		double valor;
		
		valor = Input.readDouble("Informe valor da compra: ");
		tempo = Input.readDouble("Informe a quantidade de vezes parceladas: ");
		taxa = Input.readDouble("Informe a taxa da prestação: ");
		
		calculaPrestacao(valor, tempo, taxa);
        
	}

}
