/* Crie o algoritmo CALCULADORA que apresente o menu abaixo e permita
que o usuário efetue quantas e quais operações desejar com dois
números lidos na opção 1 - Entrada de Dados. Ou seja, o usuário deve
poder escolher a opção 1, digitar dois números e, em seguida, voltar
ao menu para escolher qualquer das 4 operações. Após o usuário
efetuar a escolha da operação, mostre o resultado e volte ao menu
para que uma nova operação possa ser escolhida ou uma nova entrada
de dados possa ser feita.
1 - Entrada de dados
2 - Adição
3 - Subtração
4 - Multiplicação
5 - Divisão
6 - Encerrar
Escolha uma das operações:
Para mostrar o menu de opções use uma função.
Use funções para implementar as opções 2, 3, 4 e 5. Em cada função
use como parâmetros os dois valores numéricos lidos na opção 1; os
quais serão usados nas operações de adição, subtração, multiplicação
ou divisão, dependendo da operação realizada pela função. Cada função
deve retornar o resultado da operação realizada.
Na operação de divisão o denominador não pode ser nulo. Use uma
função para verificar este fato antes de efetuar a divisão. Esta
função deve ter como parâmetro o denominador da divisão e retornar
verdadeiro caso o denominador seja nulo e falso caso contrário. */

public class exemplo{

	// C R I A R  M É T O D O  F O R M U L A
	public static void imprimeMenu(){
		System.out.println("====== M E N U ======");
		System.out.println("1 - Entrada de dados");
		System.out.println("2 - Adição");
		System.out.println("3 - Subtração");
		System.out.println("4 - Multiplicação");
		System.out.println("5 - Divisão");
		System.out.println("6 - Encerrar");
	}
	public static void soma(double v1, double v2){
            System.out.println("Soma: " + (v1 + v2));
	}
        public static void subtracao(double v1, double v2){
            System.out.println("Subtracao: " + (v1 - v2));
	}
        public static void multiplicacao(double v1, double v2){
            System.out.println("Multiplicacao: " + (v1 * v2));
	}
        public static void divisao(double v1, double v2){
            System.out.println("Divisao: " + (v1 / v2));
	}
    
	// M É T O D O  P R I N C I P A L
	public static void main(String[] args){
	
		double valor1=0;
		double valor2=0;
		int selecionar = 0;
				
		while(selecionar < 1 && selecionar > 6){
			selecionar = Input.readInt("Escolha uma opção de [1] à [6]: ");
		}
		
                while (selecionar != 6){
                    imprimeMenu();
                    selecionar = Input.readInt("Escolha uma opção: ");
                
                    switch (selecionar) {

                            case 1: 
                                valor1 = Input.readDouble("Informe o primeiro valor: ");
                                valor2 = Input.readDouble("Informe o segundo valor: ");
                                break;
                            case 2:
                                while(selecionar != 1){
                                    selecionar = Input.readInt("Selecione a opção [1]: ");
                                    while(selecionar != 1) {
                                        selecionar = Input.readInt("Selecione a opção [1]: ");
                                    }
                                    valor1 = Input.readDouble("Informe o primeiro valor: ");
                                    valor2 = Input.readDouble("Informe o segundo valor: ");
                                }
                                soma(valor1, valor2);
                                break;
                            case 3:
                                    while(selecionar != 1){
                                            selecionar = Input.readInt("Selecione a opção [1]: ");
                                            while(selecionar != 1) {
                                                    selecionar = Input.readInt("Selecione a opção [1]: ");
                                            }
                                            valor1 = Input.readDouble("Informe o primeiro valor: ");
                                            valor2 = Input.readDouble("Informe o segundo valor: "); 

                                    }
                                    subtracao(valor1, valor2);
                                    break;
                            case 4:
                                    while(selecionar != 1){
                                            selecionar = Input.readInt("Selecione a opção [1]: ");
                                            while(selecionar != 1) {
                                                    selecionar = Input.readInt("Selecione a opção [1]: ");
                                            }
                                            valor1 = Input.readDouble("Informe o primeiro valor: ");
                                            valor2 = Input.readDouble("Informe o segundo valor: "); 

                                    }
                                    multiplicacao(valor1, valor2);
                                    break;
                            case 5:
                                    while(selecionar != 1){
                                            selecionar = Input.readInt("Selecione a opção [1]: ");
                                            while(selecionar != 1) {
                                                    selecionar = Input.readInt("Selecione a opção [1]: ");
                                            }
                                            valor1 = Input.readDouble("Informe o primeiro valor: ");
                                            valor2 = Input.readDouble("Informe o segundo valor: "); 

                                    }
                                    divisao(valor1, valor2);
                                    break;
                            case 6:
                                    selecionar = 7;

                    }
                }
		
	}
}
