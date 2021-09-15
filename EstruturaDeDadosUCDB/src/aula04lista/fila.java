package aula04lista;

public class fila{
	
    public tipoNo cabeca;
    fila(){
        System.out.println("Criando fila...(construtor fila)");
    }

    public void insereInicio(int valor){
        if(cabeca == null){
            cabeca = new tipoNo();
            cabeca.setInfo(valor);
            cabeca.setProx(null);
        }else{
            tipoNo aux,novo;
            novo = new tipoNo();

            novo.setInfo(cabeca.getInfo());
            novo.setProx(null);

            cabeca.setInfo(valor);
            cabeca.setProx(novo);

        }
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

    public void remover(int value){ // INCONPLETO
        if(cabeca == null){
            System.out.println("A lista está vazia!");
        }else{
            if(value == 1 && cabeca.getProx() == null){
                cabeca = null;
            }else {
                tipoNo aux = cabeca;

                int i = 1;
                while (i != (value - 0)) {
                    aux = aux.getProx();
                    i++;
                }

                aux.setProx(cabeca.getProx().getProx());
            }
        }
    }

    public void concatenarListas(int[] l1, int[] l2){

        //for(int i=0; i<=l1.length; i++){
        //    for(int j=0; j<=l2.length; j++){
        //        if(){
        //
        //        }
        //    }
        //}
    }
	
    public void imprime(){
        tipoNo aux = cabeca;
        System.out.println("Impressao: ");
        while (aux != null) {
            System.out.print(aux.getInfo() + " ");
            aux = aux.getProx();
        }
        System.out.println("");
    }
	
    public void menu(){
        int valor,opcao=0;
	    System.out.print("\n------------ Menu ------------\n");
	    while(opcao!=-1){
            opcao = Input.readInt("\nDigite a opcao: \n(1) Insere Inicio ✓\n(2) Insere Fim ✓\n(3) Remove Inicio \n(4) Remove Fim \n(5) Imprime ✓\n(6) Remover n-ésimo\n(-1) Sair \nOpcao: ");

            switch(opcao){
			
                case 1: //insereInicio
                    valor = Input.readInt("Valor: ");
                    insereInicio(valor);
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

                case -1: //sair
                    System.out.println("Saindo!");
                    break;
                case 6:
                    valor = Input.readInt("Valor: ");
                    remover(valor);
                    break;

                case 7:
                    // pedir o tamanho da lista 1
                    //int valor1 = Input.readInt("Quantos elementos há na priemira lista? ");
                    // pedir os valores da lista 1
                    //for(int i=0; i<valor1; i++){
                    //    valor = Input.readInt("Valor: ");
                    //    insereFinal(valor);
                    //}


                    // pedir o tamanho da lista 2
                    //int valor2 = Input.readInt("Quantos elementos há na priemira lista? ");
                    // pedir os valores da lista 2

                    //concatenarListas(l1, l2);

                default:
                    System.out.println("Opcao invalida!");
                    break;
            }
	    }
    }

    public static void main(String args[]){
        System.out.println("\n************ Lista Encadeada Din�mica ************\n");
	    fila F = new fila();
	    F.menu();
	    System.out.println("\n************ Fim programa ************\n");
    }
}