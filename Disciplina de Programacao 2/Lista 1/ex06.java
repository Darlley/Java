/* Implemente o cálculo de potência: dada uma base e o expoente, retornar a base elevada ao expoente(Exponencial). Passe por parâmetro a base e o expoente. Não utilizar a função pow. */

public class ex06{

	// C R I A R  M É T O D O
	public static void potenciaco(int b, int ex){
		
		int base = b;
		for(int i=1; i<ex; i++){
			b *= base;
		} 
		System.out.println(base + " ^ " + ex + " = " + b);
        
	}

	// M É T O D O  P R I N C I P A L
	public static void main(String[] args){
    
		int base;
		int expoente;

		base = Input.readInt("Informe a base: ");
		expoente = Input.readInt("Informe o expoente: ");
		
		potenciaco(base, expoente);
        
	}

}
