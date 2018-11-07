public class ex04{
	public static void main(String[] args){
		String nomes[] = new String[10];
		double notas[][] = new double[10][3];
		
		for(int i=0; i<=9;i++){
			nomes[i] = Input.readString("Aluno "+ i+1 +": ");			
		}
		
		for(int i=0; i<=9;i++){
			System.out.print("Notas do aluno "+nomes[i]);
			for(int j=0; j<=9; j++){
				notas[i][j] = Input.readDouble("Informe a nota "+ j +": ");
			}
			System.out.println("");
		}
		
	}
}
