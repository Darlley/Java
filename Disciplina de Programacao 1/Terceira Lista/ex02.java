public class ex02{
	public static void main(String[] args){
		int n1 = Input.readInt("Informe um número: ");
		int n2 = Input.readInt("Informe outro número: ");
		int aux = n1;

		System.out.print("O valor de " + n1 + " elevado a " + n2 + " é "); 

		for(int i=1; i<n2; i++){
			n1 *= aux;
		}

		System.out.print(n1);
		
	}
}
