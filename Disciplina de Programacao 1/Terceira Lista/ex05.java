public class ex05{
	public static void main(String[] args){
		int n1 = Input.readInt("Informe um número: ");

		if(n1 <= 9){
			System.out.print("O número informado tem 1 digito!");
		}else if(n1 <= 99){
			System.out.print("O número informado tem 2 digitos!");
		}else if(n1 <= 999){
			System.out.print("O número informado tem 3 digitos!");
		}else if(n1 <= 9999){
			System.out.print("O número informado tem 4 digitos!");
		}else{
			System.out.print("O número informado tem mais de 4 digitos!");
		}
	}
}
