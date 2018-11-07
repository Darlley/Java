public class ex03{
	public static void main(String[] args){
		int soma = 0, somaDP = 0, somaDS = 0, par = 0, impar = 0, modelo[][];
		modelo = new int[10][10];
		
		
		for(int i=0; i<=9;i++){
			for(int j=0; j<=9;j++){
				if(i!=0){
					modelo[i][j] = (j+1)*(i+1);
				}else{
					modelo[i][j] = j+1;
				}
			}				
		}
		
		for(int i=0; i<=9;i++){
			for(int j=0; j<=9;j++){
				// A 
				soma += modelo[i][j];
				
				// B
				if(modelo[i][j]%2==0){
					par++;
				}else{
					impar++;
				}
				
				// C
				if(j==i){
					somaDP += modelo[i][j];
				}
				
				// D
				if((i+j)==9){
					somaDS += modelo[i][j];
				}
				
			}
		}
		
		System.out.println("Soma: "+soma);
		System.out.println("Quantidade de números pares: "+par);
		System.out.println("Quantidade de números impares: "+impar);
		System.out.println("Soma dos números da diagonal primária: "+somaDP);
		System.out.println("Soma dos números da diagonal secundária: "+somaDS);
	}
}
