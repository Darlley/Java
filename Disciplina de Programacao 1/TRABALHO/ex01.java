public class ex01{
	public static void main(Sting[] args){
		int m, n, modelo[][], verifica[][];
		modelo = new int[9][9];
		verifica = new int[3][3];
		
		// PRIMEIRA MATRIZ 
		for(int i=0; i<=8;i++){
			for(int j=0; j<=8;i++){
				modelo[i][j] = Input.readInt("Informe o valor de ["+i+"]["+j+"]: ");
			}				
		}
		
		// SEGUNDA MATRIZ
		System.out.print("VERIFICA SE UM DETERMINADO PADRÃO EXISTE NA MATRIZ!");	
		for(int i=0;i<=2;i++){
			for(int j=0;j<=2;j++){
				verifica[i][j] = Input.readInt("Informe o valor de ["+i+"]["+j+"]: ");
			}
		}
		
		// VERIFICAÇÃO
		for(int i=0;i<=8;i++){
			for(int j=0;j<=8;j++){
				while(modelo[i][j] != verifica[i][j]){
				
				}
			}
		}
	}
}
