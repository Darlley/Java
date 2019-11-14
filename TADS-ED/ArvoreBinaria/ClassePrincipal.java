package arvorebinaria;
public class ArvoreBinaria {
    private noArvore EProx;
    private noArvore DProx;
    
    public int minimoABB(noArvore T){
        noArvore P;
        
        if(T.getInfo() == null){
            return null;
        }else{
            P = T;
            while(P.getEProx() != null){
                P = P.getEProx();
            }
            return P.getInfo();
        }
        
    }
    public void buscaABB(noArvore T, int x){
        if(T.getInfo() == null){
            return null;
        }if else(T.getInfo() == x){
            return T.getInfo();
        }if else(x < T.getInfo()){
            return buscaABB(T.getEProx(), x);
        }else{
            return buscaABB(T.getDProx(), x);   
        }
    }
    public void insereABB(noArvore T, int x){
        if
    }
}
