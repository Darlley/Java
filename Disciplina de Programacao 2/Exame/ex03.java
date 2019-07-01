/* 
✓ Crie uma classe para representar datas. 
✓ 1. Represente uma data usando três atributos: o dia, o mês, e o ano. 
✓ 2. Sua classe deve ter um construtor que inicializa os três atributos e verifica a validade dos valores fornecidos. 
✓ 3. Forneça um construtor sem parâmetros que inicializa a data com a data atual fornecida pelo sistema operacional. 
✓ 4. Forneça um método set um get para cada atributo. 
✓ 5. Forneça um método para imprimir a data. Considere que a data deve ser formatada mostrando o dia, o mês e o ano separados por barra (/). 
✓ 6. Forneça uma operação para avançar uma data para o dia seguinte. 
✓ 7. Escreva um aplicativo de teste que demonstra as capacidades da classe.
*/

import java.util.Date;
import java.text.SimpleDateFormat;
        
public class Data { // Crie uma classe para representar datas. 
    // 1. Represente uma data usando três atributos: o dia, o mês, e o ano.
    public int dia;
    public int mes;
    public int ano;
    
    // 2. Sua classe deve ter um construtor que inicializa os três atributos e verifica a validade dos valores fornecidos.
    public Data(){
	boolean bissexto;
        
        // DATA ATUAL
        Date data = new Date();
        SimpleDateFormat formatador = new SimpleDateFormat("dd/MM/yyyy");
        System.out.println("DATA ATUAL: " + formatador.format( data ) + "\n");
        
	ano = Input.readInt("Informe o ano: ");
	if(ano%4 == 0 && !(ano%100 == 0 && ano%400 != 0)){ // Anos bissextos
            bissexto = true;
        }else{
            bissexto = false;
        }
        
	mes = Input.readInt("Informe o mês: ");
	while(mes < 1 || mes > 12){
            mes = Input.readInt("Informe o mês corretamente (1 até 12): ");
	}
        
        dia = Input.readInt("Informe o dia: ");
	switch(mes){ // Validação dias do mês
            case 1:
                if(dia < 1 || dia > 31){
                    dia = Input.readInt("Informe o dia correto [1-31]: ");
                }
                break;
            case 2:
                if(bissexto != true && (dia < 1 || dia > 28)){
                    dia = Input.readInt("Informe o dia correto [1-28]: ");
		}else if(bissexto == true && (dia < 1 || dia > 29)){
                    dia = Input.readInt("Informe o dia correto [1-29]: ");
		}
                break;
            case 3:
                if(dia < 1 || dia > 31){
                    dia = Input.readInt("Informe o dia correto [1-31]: ");
		}
                break;
            case 4:
		if(dia < 1 || dia > 30){
                    dia = Input.readInt("Informe o dia correto [1-30]: ");
		}
                break;
            case 5:
		if(dia < 1 || dia > 31){
                    dia = Input.readInt("Informe o dia correto [1-31]: ");
                }
                break;
            case 6:
		if(dia < 1 || dia > 30){
                    dia = Input.readInt("Informe o dia correto [1-30]: ");
		}
                break;
            case 7:
		if(dia < 1 || dia > 31){
                    dia = Input.readInt("Informe o dia correto [1-31]: ");
		}
                break;
            case 8:
		if(dia < 1 || dia > 31){
                    dia = Input.readInt("Informe o dia correto [1-31]: ");
                }
                break;
            case 9:
		if(dia < 1 || dia > 30){
                    dia = Input.readInt("Informe o dia correto [1-30]: ");
                }
                break;
            case 10:
		if(dia < 1 || dia > 31){
                    dia = Input.readInt("Informe o dia correto [1-31]: ");
		}
                break;
            case 11:
                if(dia < 1 || dia > 30){
                dia = Input.readInt("Informe o dia correto [1-30]: ");
                }
                break;
            case 12:
                if(dia < 1 || dia > 31){
                    dia = Input.readInt("Informe o dia correto [1-31]: ");
                }
                break;
        }
        
        
    }

    //METODOS GETTERS
    public int getDia(){
        return dia;
    }
    public int getMes(){
        return mes;
    }
    public int getAno(){
        return ano;
    }
    
    //METODOS SETTERS
    public void setDia(int dia){
        this.dia = dia;
    }
    public void setMes(int mes){
        this.mes = mes;
    }
    public void setAno(int ano){
        this.ano = ano;
    }
    
    public static void main(String[] args) {
        int continuar = 1, avançar = 1;
        while(continuar == 1){
            continuar = Input.readInt("Deseja formatar uma data?\n1- para SIM;\n2- para NÃO;\nESCOLHA: ");
            System.out.println("");
            if(continuar != 2){
                Data dia = new Data();
                System.out.println("\n------------\n| " + dia.getDia() + "/" + dia.getMes() + "/" + dia.getAno() + " |\n------------\n");
                while(avançar != 2){
                    avançar = Input.readInt("Deseja avançar um dia?\n1- para SIM;\n2- para NÃO;\nESCOLHA: ");
                    dia.setDia(dia.getDia() + 1);
                    System.out.println("\n------------\n| " + dia.getDia() + "/" + dia.getMes() + "/" + dia.getAno() + " |\n------------\n");
                }
            }
        }
        
       
    }
}
