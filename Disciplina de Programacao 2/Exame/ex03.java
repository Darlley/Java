/* Crie uma classe para representar datas. 1. Represente uma data usando três atributos: o dia, o mês, e o ano. 2. Sua classe deve ter um construtor que inicializa os três atributos e verifica a validade dos valores fornecidos. 3. Forneça um construtor sem parâmetros que inicializa a data com a data atual fornecida pelo sistema operacional. 4. Forneça um método set um get para cada atributo. 5. Forneça um método para imprimir a data. Considere que a data deve ser formatada mostrando o dia, o mês e o ano separados por barra (/). 6. Forneça uma operação para avançar uma data para o dia seguinte. 7. Escreva um aplicativo de teste que demonstra as capacidades da classe. */

 3. Forneça um construtor sem parâmetros que inicializa a data com a data atual fornecida pelo sistema operacional. 4. Forneça um método set um get para cada atributo. 5. Forneça um método para imprimir a data. Considere que a data deve ser formatada mostrando o dia, o mês e o ano separados por barra (/). 6. Forneça uma operação para avançar uma data para o dia seguinte. 7. Escreva um aplicativo de teste que demonstra as capacidades da classe.
	
public class Datas { // Crie uma classe para representar datas. 
		// 1. Represente uma data usando três atributos: o dia, o mês, e o ano.
    public int dia, mes ano;
    
		// 2. Sua classe deve ter um construtor que inicializa os três atributos e verifica a validade dos valores fornecidos.
    public Empregado(){
				boolean bissexto;
				ano = Input.readInt("Informe o ano: ");
					// Anos bissextos
					if((ano%4 == 0 && !(ano%100 == 0 && ano%400 != 0){
						bissexto = true;
					}
				mes = Input.readInt("Informe o mês: ");
					while(mes < 1 || mes > 12){
						mes = Input.readInt("Informe o mês corretamente (1 até 12): ");
					}
        dia = Input.readInt("Informe o dia: ");
					// Validação dias do mês
					switch(mes){ 
						case 1:
							if(dia < 1 || dia > 31){
								dia = Input.readInt("Informe o dia correto [1-31]: ");
							}
						case 2:
							if((bissexto != true && (dia < 1 || dia > 28)){
								dia = Input.readInt("Informe o dia correto [1-28]: ");
							}else if(bissexto == true && (dia < 1 || dia > 29)){
								dia = Input.readInt("Informe o dia correto [1-29]: ");
							}
						case 3:
							if(dia < 1 || dia > 31){
								dia = Input.readInt("Informe o dia correto [1-31]: ");
							}
						case 4:
							if(dia < 1 || dia > 30){
								dia = Input.readInt("Informe o dia correto [1-30]: ");
							}
						case 5:
							if(dia < 1 || dia > 31){
								dia = Input.readInt("Informe o dia correto [1-31]: ");
							}
						case 6:
							if(dia < 1 || dia > 30){
								dia = Input.readInt("Informe o dia correto [1-30]: ");
							}
						case 7:
							if(dia < 1 || dia > 31){
								dia = Input.readInt("Informe o dia correto [1-31]: ");
							}
						case 8:
							if(dia < 1 || dia > 31){
								dia = Input.readInt("Informe o dia correto [1-31]: ");
							}
						case 9:
							if(dia < 1 || dia > 30){
								dia = Input.readInt("Informe o dia correto [1-30]: ");
							}
						case 10:
							if(dia < 1 || dia > 31){
								dia = Input.readInt("Informe o dia correto [1-31]: ");
							}
						case 11:
							if(dia < 1 || dia > 30){
								dia = Input.readInt("Informe o dia correto [1-30]: ");
							}
						case 12:
							if(dia < 1 || dia > 31){
								dia = Input.readInt("Informe o dia correto [1-31]: ");
				}
			}
    }
    
    
    public static void main(String[] args) {
    }
}
