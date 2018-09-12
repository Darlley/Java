public class ex04{
	public static void main(String args[]){
		int primo = 100, i=0, vetor [] = new int[10];
		
		do{
			vetor[i] = primo++;
			System.out.print(primo + "\n");
			i++;
		}while(primo<110);
	}
}
