public class ex04{
	public static void main(String args[]){
	
		double anos = Input.readDouble("A quantos anos você fuma? ");
		double cigarros = Input.readDouble("Quantos cigarros você fuma por dia? ");
		double carteira = Input.readDouble("Quantos esta a carteira de cigarro? ");
		double total;

		total = (((anos * 365) * cigarros) / 20) * carteira;
		
		System.out.println(total);
	}		
} 
