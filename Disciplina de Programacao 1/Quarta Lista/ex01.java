public class ex01{
  public static void main(String[] args){
	double media = 0;
	int c =0, s = 0, v = 0, d = 0;
	
	for(int i = 1; i <= 20;i++){
		int idade = Input.readInt("Informe sua idade: ");
		char estadoCivil = Input.readChar("Informe seu estado civil: ");
		
		
		switch(estadoCivil){
			case 'C':
				c++;
				break;
			case 'S':
				s++;
				break;
		    case 'V':
				v++;
				media += idade;
				break;
		    case 'D':
				d++;
				break;
		    default:
				System.out.print("ERRO!");

		}
		
	}
		
	System.out.println("a) a quantidade de pessoas casadas: " + c);
	System.out.println("b) a quantidade de pessoas solteiras: " + s);
	System.out.println("c) a média das idades das pessoas viúvas: " + (media = media/20));
	System.out.println("d) a porcentagem de pessoas desquitadas ou separadas dentre todas as pessoas analisadas: " + (d*0.2);
	
  }
}
