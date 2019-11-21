package arvorebinaria;
public class ArvoreBinaria {
    private noArvore EProx;
    private noArvore DProx;
    
    /*public int minimoABB(noArvore T){
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
    }*/
    
    public noArvore buscaABB(noArvore T, int x){
        if(T == null){
            return null;
        }else if(T.getInfo() == x){
            return T;
        }else if(x < T.getInfo()){
            return buscaABB(T.getEProx(), x);
        }else{
            return buscaABB(T.getDProx(), x);
        }
    }
    public void insereABB(noArvore T, int x){
        if(T == null){
            System.out.println("OVERFLOW");
        }else{
            T.setInfo(x);
            T.setEProx(null);
            T.setDProx(null);
            
            if(x < T.getInfo()){
                insereABB(T, x);
            }else if(x > T.getInfo()){
                insereABB(T, x);
            }else{
                System.out.println("Já existe!");
            }
        }
    }
    
    public noArvore removeABB(noArvore T, int x){
        noArvore P, R;
        
        if(T != null){
            if(x > T.getInfo()){
                return null; //remove()
            }else{
                P = T;
                if(T.getEProx() == null){
                    T = T.getDProx();
                }else{
                    if(T.getDProx() == null){
                        T = T.getEProx();
                    }else{
                        R = P;
                        P = P.getDProx();
                        while(P.getEProx() != null){
                            R = P;
                            P = P.getEProx();
                        }
                        if(T == R){
                            R.setDProx(P.getDProx());
                        }else{
                            R.setEProx(P.getEProx());
                        }
                    }
                }
            }
            return P;
        }
        return T;
    }
    
    public void imprimeABB(noArvore T, int espaco){
        if(T != null){
            imprimeABB(T.getDProx(), espaco+1);
            for(int i = 1; i<=espaco; i++){
                System.out.println(" - ");
            }
            System.out.println(T.getInfo());
            imprimeABB(T.getEProx(), espaco+1);
        }
    }
    
    public static void main(String[] args){
        
    }
}
