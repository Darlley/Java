/* Elaborar um programa para calcular e apresentar o valor do volume de uma lata de óleo, utilizando a fórmula: VOLUME <- 3.14159 * R ^ 2 * ALTURA. */

public class ex03{

	// C R I A R  M É T O D O
	public static void calculaVolume (double r, double a){
		
		System.out.println("Volume: " + ((3.14159)*(Math.pow(r, 2))*a)); 
		
	}

	// M É T O D O  P R I N C I P A L
	public static void main(String[] args){
		double raio;
		double altura;
		
		raio = Input.readDouble("Informe o raio: ");
		altura = Input.readDouble("Informe a altura: ");
		calculaVolume(raio, altura);
	}

}
