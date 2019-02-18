/* Deseja-se armazenar, de uma turma composta de 30 alunos, o nome e a
média de cada aluno. Para isso serão informados o nome, a nota da
primeira prova, a nota da segunda prova e os pontos extras de
participação de cada aluno. A média deve ser calculada sobre as duas
primeiras notas. Os pontos de participação serão somados na média
final mas sempre obedecendo o limite máximo de 10 para a média.
Após a entrada de dados deve-se exibir a relação de alunos com os
seus nomes e médias. (Sugestão de métodos solicitaNota,
calculaMedia, exibeAluno e finalizaPrograma).  */

public class ex09{

	// C R I A R  M É T O D O
	public static void calculaMedia(String n, int n1, int n2, int ptex){
		double media;
		double rest;
		
		System.out.println("\n" + n + " = = = = =");
		media = (n1+n2)/2;
		
        // Se a média for menor que 10 (para não extrapolar o valor máximo): adiciona os pontos extras (
		if(media < 10){
			media = media + ptex;
		}
        
        // Se a média for maior que 10: subtraio com 10 (para nota máxima) e o resto subtraio com a média total (resultando em 10)
		if(media > 10){
			rest = media - 10;
			media = media - rest; 
		} 
		
		System.out.println("MEDIA: " + media + "\n");
		
		
	}

	// M É T O D O  P R I N C I P A L
	public static void main(String[] args){
		String nome;
		int nota_1;
		int nota_2;
		int ponto_extra;
		int count = 0;
		
		while(count < 30){
			++count;
			System.out.println("\n========= ALUNO " + count + " =========");
			
			nome = Input.readString("Informe o nome do aluno: ");
			nota_1 = Input.readInt("Informe a primeira nota: ");
			nota_2 = Input.readInt("Informe a segunda nota: ");
			ponto_extra = Input.readInt("Informe os pontos extras do aluno: ");
			
			calculaMedia(nome, nota_1, nota_2, ponto_extra);
		}
	}

}
