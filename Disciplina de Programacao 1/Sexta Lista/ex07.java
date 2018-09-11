public class ex01{
	public static void main(String args[]){
    int i, vetor[]; 
    
    vetor = new int[9];
    
    for(i = 0; i<9; i++){
      vetor[i] = Input.readInt("Valor: ");
    }
    
    i = 0;
    
    while(vetor[i] != 0){
      SYstem.out.print(vetor[i] + ", ");
      i = vetor[i];
    }
    
  }
}
