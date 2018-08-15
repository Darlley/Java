public class ex01{
	public static void main(String args[]){
	
		double nota = 0, media = 0, maior = 0, menor = 0;
		int i = 0, j = 1;
		
		System.out.println("====== INDICE =====");	
		System.out.println("0 - Parar");
		System.out.println("1 - Continuar");
		System.out.println("===================\n");
		
		
		while(j == 1){
	
			nota = Input.readDouble("Informe a nota " + (++i) + ": ");
			
			if(media < nota){
				menor = nota;
			}else{
				maior = nota;
			}
			media = nota;
			j = Input.readInt("Deseja continuar[0/1]? ");
		}
		
		media = (menor + maior) / i;
		
		System.out.println("A media é: " + media);
		System.out.println("O menor é: " + menor);
		System.out.println("O maior é: " + maior);
		
	}
}
