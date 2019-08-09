public class Camisa {
    
    // ATRIBUTOS
    private int tamanho;
    private String tipo, cor;
    private char material;
    
    // CONSTRUTOR
    
    // SETTERS
    public void setTamanho(int tam){
        this.tamanho = tam;
    }
    public void setTipo(String tp){
        this.tipo = tp;
    }
    public void setCor(String cor){
        this.cor = cor;
    }
    public void setMaterial(char mat){
        this.material = mat;
    }
    
    // GETTERS
    public int getTamanho(){
        return this.tamanho;
    }
    public String getTipo(){
        return this.tipo;
    }
    public String getCor(){
        return this.cor;
    }
    public char getMaterial(){
        return this.material;
    }
    
    // IMPRESSÃO
    public void imprime(){
        System.out.println("Tamanho: "+this.getTamanho());
        System.out.println("Tipo: "+this.getTipo());
        System.out.println("Cor: "+this.getCor());
        System.out.println("Material: "+this.getMaterial());
        System.out.println("Valor: " + this.preco(this.getTamanho()));
    }
    
    public int preco(int tam){
        int valor=0;
        if(tam >= 20){
            valor = 50;
        }else{
            valor = 25;
        }
        return valor;
    }
    
    public static void main(String[] args) {
        
        System.out.println("DARLLEY ===");
        Camisa Darlley = new Camisa();
        Darlley.setTamanho(30);
        Darlley.setTipo("Social");
        Darlley.setCor("Preta");
        Darlley.setMaterial('A');
        Darlley.imprime();
        
        System.out.println("");
        
        System.out.println("MARIA ===");
        Camisa Maria = new Camisa();
        Maria.setTamanho(30);
        Maria.setTipo("Social");
        Maria.setCor("Rosa");
        Maria.setMaterial('B');
        Maria.imprime();
    }
    
}
