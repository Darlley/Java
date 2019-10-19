package ListasSimplesmenteEncadeada;

public class ListaSimplesmenteEncadeada {
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
        //
        
    }
    
    public void removeLista(noLista L, int x){
        // CONTINUAR
    }
}
