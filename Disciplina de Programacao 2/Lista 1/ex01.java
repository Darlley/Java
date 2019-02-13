/*1) Desenvolva um algoritmo para ler uma temperatura em graus Celsius e apresentá-la convertida em graus Fahrenheit. A fórmula de conversão
é: F <- (9 * C + 160) / 5, sendo F a temperatura em Fahrenheit e C a temperatura em Celsius.*/

public class exemplo1{

	// C R I A R  M É T O D O  F O R M U L A
	public static void formula (double c){
		double fahrenheit;
		fahrenheit = (9 * c + 160)/5;
		System.out.println(c + "º Celsius convertido para Fahrenheit é igual a " + fahrenheit + "º."); 
	}

	// M É T O D O  P R I N C I P A L
	public static void main(String[] args){
		double celsius;
		celsius = Input.readDouble("Informe a temperatura: ");
		formula(celsius);
	}

}
