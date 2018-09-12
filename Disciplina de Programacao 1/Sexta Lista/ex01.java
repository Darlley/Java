 public class ex01{
	public static void main(String args[]){
	
		int i = 0, x, indice, vetor [] = new int[20]; 
		boolean naoachou;
		
		do{
			vetor[i] = Input.readInt("Valor indíce " + i + ": ");
			i++;
		}while(i<20);

		x = Input.readInt("Valor de X: ");
	
		i=0;
		indice = 0;
		
		naoachou = true;
		while(i<20 && naoachou==true){
			if(vetor[i] == x){
				indice = i;
				naoachou = false;
			}
			i++;	
		}
		
		if(indice!=0){
			System.out.println("O valor "+ x +" esta no indice "+ indice + "!");
		}else{
			System.out.println("O valor "+x+" nao esta no vetor!");
		}
	}
}
