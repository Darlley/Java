public class ex03{
	public static void main(String args[]){
	
		double custo = Input.readDouble("Valor de custo: ");
		double imposto = Input.readDouble("Valor de imposto: ");
		double lucro = Input.readDouble("Valor de lucro: ");
		double total;

		total = custo + ((custo/100)*imposto) + ((custo/100)*lucro);
		
		System.out.println("R$" + custo + " + R$" + imposto + " + R$" + lucro + " = " + total);
	}		
}
