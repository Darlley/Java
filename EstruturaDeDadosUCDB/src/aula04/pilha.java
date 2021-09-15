/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula04;

/**
 *
 * @author pericles.lopes
 */
public class pilha {
    public tipoNo topo;
    
    public void empilha (int valor){
        if(topo == null){ //pilha esta vazia
            tipoNo novo;
            novo = new tipoNo();
            novo.setInfo(valor);
            novo.setProx(null);
            topo = novo;
        }else{ //pilha nao esta vazia
            tipoNo novo;
            novo = new tipoNo();
            novo.setInfo(valor);
            novo.setProx(topo);
            topo = novo;
        }
    }
    
     
    
    public void desempilha(){            
        if(topo == null){
            System.out.println("Pilha vazia!");
        }else{
            System.out.println("Removido "+topo.getInfo());
            topo = topo.getProx();
        }
    }
    
    public void imprime(){
        tipoNo aux;
        aux = topo;        
        System.out.println("Impressão: ");
        
        if(aux == null){
            System.out.println("Pilha vazia!");
        }else{
            while(aux != null){
                System.out.println(aux.getInfo());
                aux = aux.getProx();
            }
        }
    }
    
     public void menu(){
        int valor,opcao=0;
	System.out.print("\n------------ Menu ------------\n");
	while(opcao!=-1){
            opcao = Input.readInt("\nDigite a opcao: \n(1) Empilha ✓\n(2) Desempilha ✓\n(3) Imprime\n(-1) Sair \nOpcao: ");
            switch(opcao){
			
                case 1: //empilha
                    valor = Input.readInt("Valor: ");
                    empilha(valor);
		break;
				
		case 2: //desempilha
                    desempilha();                    
		break;
				
		case 3: //imprime
                    imprime();
		break;				                
				
		case -1: //sair
                    System.out.println("Saindo!");
		break;
				
		default:
                    System.out.println("Opcao invalida!");
		break;
			
            }
		
    }
   }
   public static void main(String args[]){
    pilha p;
    p = new pilha();
    p.menu();
   }
}
