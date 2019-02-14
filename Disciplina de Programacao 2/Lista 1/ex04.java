/* Elaborar um programa para efetuar o cálculo da quantidade de litros de combustível gasta em uma viagem, utilizando um automóvel que faz 12 Km por litro. Para obter o cálculo, o usuário deve fornecer o tempo gasto e a velocidade média durante a viagem. Desta forma, será possível obter a distância percorrida com a fórmula DISTANCIA <- TEMPO * VELOCIDADE. Tendo o valor da distância, basta calcular a quantidade de litros de combustível utilizada na viagem com a fórmula: LITROS_USADOS <- DISTANCIA / 12. O programa deve apresentar os valores da velocidade média, tempo gasto na viagem. */

public class ex04{

	// C R I A R  M É T O D O
	public static void calculaCombustivel (double t, double v){
		
		// APRESENAÇÃO DE VALORES
		System.out.println("Tempo de duração: " + t);
		System.out.println("Velocidade média: " + v);
		
		// CALCULO QUANTIDADE DE COMBUSTIVEL
		System.out.println("Quantidade de combustivel: " + ((t*v)/12));
		
	}

	// M É T O D O  P R I N C I P A L
	public static void main(String[] args){
    
		double tempo;
		double velocidade;
		
		tempo = Input.readDouble("Informe o tempo de duração da viagem: ");
		velocidade = Input.readDouble("Informe a velocidade média durante a viagem: ");
		
		calculaCombustivel(tempo, velocidade);
        
	}

}
