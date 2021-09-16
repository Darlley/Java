package prova.ex02;

public class fila {

    public tipoNo cabeca;
    private tipoNo ultimo;

    fila() {
        System.out.println("Criando fila...(construtor fila)");
    }

    public void insereInicio(int valor) {
        if (cabeca == null) {
            cabeca = new tipoNo();
            cabeca.setInfo(valor);
            cabeca.setProx(null);
        } else {
            tipoNo aux, novo = new tipoNo();
            if (ultimo != null) {
                ultimo.setProx(novo);
            }

            novo.setInfo(cabeca.getInfo());
            novo.setProx(cabeca.getProx());
            novo.setAnt(cabeca);

            cabeca.setInfo(valor);
            cabeca.setProx(novo);
        }
        cabeca.setAnt(null); // no incio sempre sera nulo
    }

    public void insereFinal(int info) {

        if (cabeca == null) {
            cabeca = new tipoNo();
            cabeca.setInfo(info);
            cabeca.setProx(null);
            ultimo.setAnt(null);
        } else {
            tipoNo aux, novo = new tipoNo();
            if (ultimo != null) {
                ultimo.setProx(novo);
            }

            novo.setInfo(info);
            novo.setProx(null);
            novo.setAnt(ultimo);

            aux = cabeca;
            while (aux.getProx() != null) {
                aux.setAnt(aux);
                aux = aux.getProx();

            }

            aux.setProx(novo);
            novo.setAnt(aux);
        }

        /* https://github.com/Darlley/Java/blob/master/TADS-ED/ListasDuplamenteEncadeada/classeprincipal.java

        noLista novo = new noLista();

        if(novo == null){
            System.out.println("OVERFLOW");
        }else{
            novo.setChave(x);
            novo.setProx(null);
            if(listaVazia() == true){
                this.primeiro = null;
                this.ultimo.setProx(novo);
            }
            this.ultimo = novo;
        }
        */


        System.out.println("Elemento " + info + " inserido com sucesso! ");

    }

    public void remove(int value) {
        int valor = 0;

        if(cabeca==null) { //lista vazia
            System.out.println("Lista vazia!");
        } else if (cabeca != null && cabeca.getProx() == null) {
            valor = cabeca.getInfo();
            System.out.println("Elemento " + valor + " removido com sucesso! ");
            cabeca = cabeca.getProx();
            cabeca.setAnt(null);
        }else {
            int i=1;
            tipoNo aux = cabeca;
            while(i!=(value-1)){
                aux = aux.getProx();
                i++;
            }
            System.out.println("Anterior antigo: " + aux.getAnt().getInfo());
            aux.getProx().getProx().setAnt(aux);
            aux.setProx(aux.getProx().getProx());
            System.out.println("Novo anterior: " + aux.getAnt().getInfo());
        }
    }

    public void imprime() {
        tipoNo aux = cabeca;
        System.out.print("Impressao: ");
        while (aux != null) {
            System.out.print(aux.getInfo() + " ");
            aux = aux.getProx();
        }
        System.out.println("");
    }

    public void menu(int fila) {
        int valor = 0, opcao = 0;
        System.out.print("\n------------ MENU FILA " + fila + " ------------\n");
        while (opcao != -1) {
            opcao = Input.readInt("\nDigite a opcao: \n(1) Insere Inicio \n(2) Insere Fim \n(3) Remove \n(4) Imprime\n(-1) Sair \nOpcao: ");
            switch (opcao) {

                case 1: //insereInicio
                    valor = Input.readInt("Valor: ");
                    insereInicio(valor);
                    break;

                case 2: //insereFinal
                    valor = Input.readInt("Valor: ");
                    insereFinal(valor);
                    break;

                case 3: //remover
                    valor = Input.readInt("Posição: ");
                    remove(valor);
                    break;

                case 4: //imprime
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


    public static void main(String args[]) {
        System.out.println("Exercício 2 incompleto...");
        System.out.println("\n************ Lista Dinamica Duplamente Encadeada ************\n");

        fila F1 = new fila();
        F1.menu(1);
        System.out.println("\n************ Fim programa ************\n");

    }
}