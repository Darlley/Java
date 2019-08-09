public class Casaco {
    
    // ATRIBUTOS
    private char tipo, sexo;
    private String marca, tecido;
    private float preco;
    
    // SETTERS
    public void setTipo(char tp){
        this.tipo = tp;
    }
    public void setSexo(char sx){
        this.sexo = sx;
    }
    public void setMarca(String marca){
        this.marca = marca;
    }
    public void setTecido(String tecido){
        this.tecido = tecido;
    }
    public void setPreco(float preco) {
        this.preco = preco;
    }

    // GETTERS
    public char getTipo() {
        return tipo;
    }
    public char getSexo() {
        return sexo;
    }
    public String getMarca() {
        return marca;
    }
    public String getTecido() {
        return tecido;
    }
    public float getPreco() {
        return preco;
    }
    
    // CALCULAR
    public int frete(int qtd){
        int valor=0;
        
        if(qtd >= 10){
            valor = 200;
        }else if(qtd > 5 && qtd < 10){
            valor = 300;
        }else{ // qtd <= 5
            valor = 400;
        }
        return valor;
    }
    
    // IMPRIMIR
    public void imprime(){
        System.out.println("Tipo: "+this.getTipo());
        System.out.println("Sexo: "+this.getSexo());
        System.out.println("Marca: "+this.getMarca());
        System.out.println("Tecido: "+this.getTecido());
        System.out.println("Preço: "+this.getPreco());
    }
    
    public static void main(String[] args) {

        System.out.println("DARLLEY ===");
        Casaco Darlley = new Casaco();
        Darlley.setTipo('A');
        Darlley.setSexo('M');
        Darlley.setMarca("Coringa");
        Darlley.setTecido("Seda");
        Darlley.setPreco(25);
        Darlley.imprime();
        System.out.println("Frete: "+Darlley.frete(5));
    }
}
