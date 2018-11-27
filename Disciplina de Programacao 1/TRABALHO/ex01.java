public class ex01{
	public static void main(String args[]){
		int m0 [][] = new int[9][9];
		int m1 [][] = new int[3][3];
		int x=0,i,j;
		
		for(i=0;i<8;i++){
			for(j=0;j<8;j++){
				m0[i][j] = (int)(Math.random()*2);
				System.out.println(m0[i][j]);
				
			}
		}
		
		for(i=0;i<2;i++){
			for(j=0;j<2;j++){
				m1[i][j] = m0[i][j];
			}
		}
		
		for(i=0;i<2;i++){
			for(j=0;j<2;j++){
				if(m0[i][j]==m1[i][j]){
					x = x + 1;
				}
				if(m0[i][j+3]==m1[i][j]){
					x = x + 1;
				}
				if(m0[i+3][j]==m1[i][j]){
					x = x + 1;
				}
				if(m0[i][j+6]==m1[i][j]){
					x = x + 1;
				}
				if(m0[i+6][j]==m1[i][j]){
					x = x + 1;
				}
			}
		}
		
		if(x==5){
			System.out.println("Padrao encontrado");
		}else{
			System.out.println("Padrao nao encontrado");
		}
	}
}
