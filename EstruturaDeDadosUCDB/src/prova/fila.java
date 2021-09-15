package prova;

public class fila {

    public tipoNo cabeca;

    fila() {
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
    public void insereFinal(int info) {
        if (cabeca == null) {
            cabeca = new tipoNo();
            cabeca.setInfo(info);
            cabeca.setProx(null);
        } else {
            tipoNo aux, novo;

            novo = new tipoNo();
            novo.setInfo(info);
            novo.setProx(null);

            aux = cabeca;
            while (aux.getProx() != null) {
                aux = aux.getProx();
            }

            aux.setProx(novo);
        }

        System.out.println("Elemento " + info + " inserido com sucesso! ");
    }
    public void removeInicio() {
        if (cabeca != null) {
            int valor = cabeca.getInfo();
            System.out.println("Elemento " + valor + " removido com sucesso! ");
            cabeca = cabeca.getProx();
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
        int valor =0, opcao = 0;
        System.out.print("\n------------ MENU FILA " + fila + " ------------\n");
        while (opcao != -1) {
            opcao = Input.readInt("\nDigite a opcao: \n(1) Insere Inicio \n(2) Insere Fim \n(3) Remove Inicio \n(4) Imprime\n(-1) Sair \nOpcao: ");
            switch (opcao) {

                case 1: //insereInicio
                    valor = aula03.Input.readInt("Valor: ");
                    if(fila==1){
                        while(valor%2 != 0){
                            System.out.println("Adicione somente números pares!");
                            valor = aula03.Input.readInt("Valor: ");
                        }
                        insereInicio(valor);
                    }else{
                        while(valor%2 == 0){
                            System.out.println("Adicione somente números impares!");
                            valor = aula03.Input.readInt("Valor: ");
                        }
                        insereInicio(valor);
                    }

                    break;

                case 2: //insereFinal
                    valor = aula03.Input.readInt("Valor: ");
                    if(fila==1){
                        while(valor%2 != 0){
                            System.out.println("Adicione somente números pares!");
                            valor = aula03.Input.readInt("Valor: ");
                        }
                        insereFinal(valor);
                    }else{
                        while(valor%2 == 0){
                            System.out.println("Adicione somente números impares!");
                            valor = aula03.Input.readInt("Valor: ");
                        }
                        insereFinal(valor);
                    }

                    break;

                case 3: //removeInicio
                    removeInicio();
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
        System.out.println("\n************ Lista Encadeada Dinamica ************\n");

        int resposta = Input.readInt("Qual exercício (1, 2)? ");
        if(resposta == 1) {

            fila F1 = new fila();
            F1.menu(1);

            fila F2 = new fila();
            F2.menu(2);

            System.out.print("Primeira fila, ");
            F1.imprime();
            System.out.print("Segunda fila, ");
            F2.imprime();

        }
        else if(resposta == 2) {
            fila F1 = new fila();
            F1.menu(1);
        }
        else{
            System.out.println("\n************ Fim programa ************\n");
        }

    }
}