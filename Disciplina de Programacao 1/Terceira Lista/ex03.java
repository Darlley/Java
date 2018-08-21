public class ex03{
	public static void main(String[] args){
		int n1 = Input.readInt("Informe um número: ");
		int n2 = Input.readInt("Informe outro número: ");
		int impar;

		for(int i=n1; i<=n2; i++){

			if(n1 % 2 != 0){
				System.out.print(n1 + "\n");
			}
			n1++;
		}
	}
}
