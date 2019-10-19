package ListasDuplamenteEncadeada;

public class ListaDuplamenteEncadeada {
    private noLista primeiro;
    private noLista ultimo;
    
    public void inicializaLista(){
        this.primeiro = null;
        this.ultimo = null;
    }
    
    public boolean listaVazia(){
        return this.ultimo == null;
    }
    
    
    public void insereInicio(int x){
        noLista novo = new noLista();
        
        if(novo == null){
            System.out.println("OVERFLOW");
        }else{
            novo.setChave(x);
            novo.setProx(this.primeiro);
            this.primeiro = novo;
            if(this.ultimo == null){
                this.ultimo = novo;
            }
        }
    }
    
    public void insereFinal(int x){
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
    }
    
    
    public void insereOrdenado(int x){
        noLista novo = new noLista();
        noLista aux = new noLista();
        
        if(listaVazia() || x <= this.primeiro.getChave()){
            insereInicio(x);
        }else if(x >= this.ultimo.getChave()){
            insereFinal(x);
        }else{
            if(novo == null){
                 System.out.println("OVERFLOW");
            }else{
                novo.setChave(x);
                aux = this.primeiro;
                while(x > aux.getChave()){
                    aux = aux.getProx();
                }
                novo.setProx(aux.getProx());
                novo.setAnt(aux);
                novo.setAnt(novo);
                aux.setProx(novo);
            }
        }
        
    }
}
