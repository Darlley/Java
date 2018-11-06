public class ex02{
	public static void main(String[] args){
		int modelo[][];
		modelo = new int[10][10];
		
		// PRIMEIRA MATRIZ
		for(int i=0; i<=9;i++){
			for(int j=0; j<=9;j++){
				if(i!=0){
					modelo[i][j] = (j+1)*(i+1);
				}else{
					modelo[i][j] = j+1;
				}
				System.out.println(modelo[i][j]);
			}				
		}
	}
}
