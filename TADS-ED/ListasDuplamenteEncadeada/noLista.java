package ListasDuplamenteEncadeada;

public class noLista {
    private int chave;
    private noLista prox;
    private noLista ant;

    public int getChave() {
        return chave;
    }

    public void setChave(int chave) {
        this.chave = chave;
    }

    public noLista getProx() {
        return prox;
    }

    public void setProx(noLista prox) {
        this.prox = prox;
    }

    public noLista getAnt() {
        return ant;
    }

    public void setAnt(noLista ant) {
        this.ant = ant;
    }
 
}
