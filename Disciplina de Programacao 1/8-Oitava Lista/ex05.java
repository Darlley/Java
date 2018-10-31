public class ex05{
  public static void main(String[] args){
    int m, matrizA[][], matrizB[][], matrizC[][];
    
    m = Input.readInt("Quantidade linhas e colunas: ");
    matrizA = matrizB = matrizC = new int[m][m];
    
    for(int i=0; i<m; i++){
        for(int j=0; j<m; j++){
		  System.out.println("ENTRADA: MATRIZ["+i+"]["+j+"]");
		  matrizA[i][j] = Input.readInt("Informe um valor para a MatrizA["+i+"]["+j+"]: ");
		  matrizB[i][j] = Input.readInt("Informe um valor para a MatrizB["+i+"]["+j+"]: ");
        }
    }
	for(int i=0; i<m; i++){
        for(int j=0; j<m; j++){
			System.out.println("SAIDA: MATRIZ["+i+"]["+j+"]");
			matrizC[i][j] = (matrizA[i][j] * matrizB[i][j]);
			System.out.println(matrizC[i][j]);
		}
	}
  }  
}
