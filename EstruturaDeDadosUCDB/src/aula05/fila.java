package aula05;

public class fila{
	
    public tipoNo cabeca;
    fila(){
        System.out.println("Criando fila...(construtor fila)");
    }
    
    public tipoNo getCabeca(){
        return cabeca;
    }
		
    public void insereFinal(int info){
        if(cabeca == null){
            cabeca = new tipoNo();
            cabeca.setInfo(info);
            cabeca.setProx(null);
        }else{
            tipoNo aux,novo;
			
            novo = new tipoNo();
            novo.setInfo(info);
            novo.setProx(null);

            aux = cabeca;
            while (aux.getProx() != null) {
                aux = aux.getProx();
            }

            aux.setProx(novo);
	}
		
		System.out.println("Elemento "+info+" inserido com sucesso! ");
    }
	
    
	
    public void removeInicio(){
        if(cabeca!=null){
            int valor=cabeca.getInfo();
            System.out.println("Elemento "+valor+" removido com sucesso! ");
            cabeca=cabeca.getProx();
	}
    }
	
   /*public void removeNesimo(int n){
       int i=0;
       tipoNo aux;
       aux = cabeca;
       if(n==1){           
           cabeca = cabeca.getProx();
       }else{
           while((i+i)!=n){
               aux = aux.getProx();
               i++;
           }
           aux.setProx(aux.getProx().getProx());
       }
   } */
	
    public void imprime(){
        tipoNo aux = cabeca;
        System.out.println("Impressao: ");
        while (aux != null) {
            System.out.print(aux.getInfo() + " ");
            aux = aux.getProx();
        }
        System.out.println("");
    }
	
    
    public void removeEnesimo(int n){
    
        if(cabeca==null) //lista vazia
            System.out.println("Lista vazia!");
        else{
            if(n==1){ //remover o primeiro elemento
                cabeca = cabeca.getProx(); 
            }else{
                int i=1;
                tipoNo aux = cabeca;
                while(i!=(n-1)){
                    aux = aux.getProx();
                    i++;
                }
                aux.setProx(aux.getProx().getProx());
            }
        
        }
    }
    public void novaFila(fila f2){
        tipoNo aux  = this.getCabeca();
        tipoNo aux2 = f2.getCabeca();
        fila f3;
        
        f3 = new fila();
        
        while(aux!=null && aux2!=null){
            if(aux.getInfo() < aux2.getInfo()){
                f3.insereFinal(aux.getInfo());
                aux=aux.getProx();
                //this.removeInicio();
            }else{
                f3.insereFinal(aux2.getInfo());
                aux2=aux2.getProx();
                //f2.removeInicio();
            }
        }
        if(aux == null){
            while(aux2!=null){
                f3.insereFinal(aux2.getInfo());
                 aux2=aux2.getProx();               
            }
        }else{
            while(aux!=null){
                f3.insereFinal(aux.getInfo());
                aux=aux.getProx();
            }
        }
        f3.imprime();
    }
    
    public void menu(){
        int valor,opcao=0;
	System.out.print("\n------------ Menu ------------\n");
	while(opcao!=-1){
            opcao = Input.readInt("\nDigite a opcao: \n(1) Insere Inicio \n(2) Insere Fim \n(3) Remove Inicio \n(4) Remove Fim \n(5) Imprime\n(6) Remove n-esimo\n(-1) Sair \nOpcao: ");
            switch(opcao){
			
                case 1: //insereInicio
                    valor = Input.readInt("Valor: ");
                    //insereInicio(valor);
		break;
				
		case 2: //insereFinal
                    valor = Input.readInt("Valor: ");
                    insereFinal(valor);
		break;
				
		case 3: //removeInicio
                    removeInicio();
		break;
				
                case 4: //removeFinal
                    //removeFinal();
		break;
				
		case 5: //imprime
                    imprime();
		break;
			
                case 6:
                    int n;
                    n = Input.readInt("N: ");
                    removeEnesimo(n);
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
        System.out.println("\n************ Lista Encadeada Din�mica ************\n");
	fila F1 = new fila();
	F1.menu();
        
        fila F2 = new fila();
	F2.menu();
        
        F1.novaFila(F2);
	System.out.println("\n************ Fim programa ************\n");
    }
}