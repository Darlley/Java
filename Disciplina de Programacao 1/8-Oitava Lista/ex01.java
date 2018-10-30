public class ex01{
  public static void main(Sting[] args){
    int l, c, matriz[][];
    
    l = input.readInt("Quantidade linhas: ");
    c = input.readInt("Quantidade colunas: ");
    
    matrix = new int[l][c];
    
    for(int i=0; i<l; i++){
      for(int j=0; j<c; i++){
        matriz[i][j] = input.readInt("Informe um número ");
      }
    }
    
    int min = matriz[0][0];
    int max = matriz[0][0];
    
    for(int i=0; i<l; i++){
      for(int j=0; j<c; i++){
        if(matriz[i][j] > max){
          max = matriz[i][j];
        }
        if(matriz[i][j] < min){
          min = matriz[i][j];
        }
      }
    }
    
    Syste.out.println("Mínimo: " + min);
    Syste.out.println("Máximo: " + max);
  }
}
