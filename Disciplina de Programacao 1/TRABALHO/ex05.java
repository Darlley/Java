public class ex05{
	public static void main(String[] args){
		int custos[][] = new int[4][4];
		int cidadei=0,cidadej=0,total=0,rota=0,i,j;
		char resposta='S';	
		
		
		custos[0][0] = 4; 
		custos[0][1] = 1; 
		custos[0][2] = 2;
		custos[0][3] = 3;
		custos[1][0] = 5;
		custos[1][1] = 2;
		custos[1][2] = 1;
		custos[1][3] = 400;
		custos[2][0] = 2;
		custos[2][1] = 1;
		custos[2][2] = 3;
		custos[2][3] = 8;
		custos[3][0] = 7;
		custos[3][1] = 1;
		custos[3][2] = 2;
		custos[3][3] = 5;
		
		while(resposta == 'S'){	
			System.out.println("Digite a rota: ");
			cidadei = Input.readInt("Linha(1-4): ");	
			cidadej = Input.readInt("coluna(1-4): ");	
			
			total = total + custos[cidadei-1][cidadej-1];
			
			resposta = Input.readChar("Deseja continuar S/N? ");
		}
		System.out.println("Custo total: "+total);
	
	}
}
