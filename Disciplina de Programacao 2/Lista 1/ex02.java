/*2) Desenvolva um algoritmo para ler uma temperatura em graus Fahrenheit e apresentá-la convertida em graus Celsius. A fórmula de
conversão é: C <- (F - 32) * (5 / 9), sendo F a temperatura em Fahrenheit e C a temperatura em Celsius.*/

public class exemplo1{

	// C R I A R  M É T O D O
	public static void formula (double f){
		double celsius;
		celsius = ((f-32)*5/9);
		System.out.println(f + "º Fahrenheit convertido para Celsius é igual a " + celsius + "º."); 
	}

	// M É T O D O  P R I N C I P A L
	public static void main(String[] args){
		double fahrenheit;
		fahrenheit = Input.readDouble("Informe a temperatura: ");
		formula(fahrenheit);
	}

}
