package arvorebinaria;
public class noArvore {
    private int info;
    private noArvore EProx;
    private noArvore DProx;

    public int getInfo() {
        return info;
    }

    public void setInfo(int info) {
        this.info = info;
    }

    public noArvore getEProx() {
        return EProx;
    }

    public void setEProx(noArvore EProx) {
        this.EProx = EProx;
    }

    public noArvore getDProx() {
        return DProx;
    }

    public void setDProx(noArvore DProx) {
        this.DProx = DProx;
    }
   
}
