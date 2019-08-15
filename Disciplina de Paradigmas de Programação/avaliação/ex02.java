// F I L M E  M O D E L O

package model;
public class filmeM {
    
    // A T R I B U T O S
    private String titulo, sinopse, elenco;
    private int duracao, ano;
    private char genero;

    
    // C O N S T R U T O R E S
    public filmeM(){
        this.titulo="";
        this.sinopse="";
        this.elenco="";
        this.duracao=0;
        this.ano=0;
        this.genero='a';
    }
    
    public filmeM(String titulo, String sinopse, String elenco, int duracao, int ano, char genero){
        this.titulo=titulo;
        this.sinopse=sinopse;
        this.elenco=elenco;
        this.duracao=duracao;
        this.ano=ano;
        this.genero=genero;
    }
    
    
    // M É T O D O S
    
    // SETTERS
    public void setTitulo(String titulo){    
        this.titulo = titulo;   
    }
    public void setSinopse(String sinopse) {
        this.sinopse = sinopse;
    }
    public void setElenco(String elenco) {
        this.elenco = elenco;
    }
    public void setDuracao(int duracao) {
        this.duracao = duracao;
    }
    public void setAno(int ano) {
        this.ano = ano;
    }
    public void setGenero(char genero) {
        this.genero = genero;
    }
    
    // GETTERS 
    public String getTitulo() {
        return titulo;
    }
    public String getSinopse() {
        return sinopse;
    }
    public String getElenco() {
        return elenco;
    }
    public int getDuracao() {
        return duracao;
    }
    public int getAno() {
        return ano;
    }
    public char getGenero() {
        return genero;
    }

    // SAIDA DE DADOS
    public void imprimirFilme() {
        System.out.println("TITULO:   " + this.getTitulo());
        System.out.println("SINÓPSE:     " + this.getSinopse());
        System.out.println("ELENCO:  " + this.getElenco());
        System.out.println("DURAÇÃO:    " + this.getDuracao());
        System.out.println("ANO:   " + this.getAno());
        System.out.println("GÊNERO:   " + this.getGenero());
    }
}




// S É R I E  M O D E L O
package model;
public class filmeSerieM extends filmeM{

    private boolean serie;

    public filmeSerieM(String titulo, String sinopse, String elenco, int duracao, int ano, char genero, boolean serie){
        super(titulo, sinopse, elenco, duracao, ano, genero);
        this.serie = serie;
    }
    
    public void imprimirFilmeSerieM(){
        System.out.println("É uma série: " + this.serie);
    }
}



// M É T O D O  P R I N C I P A L
package filme;
import java.util.Scanner; // https://www.devmedia.com.br/entrada-de-dados-classe-scanner/21366
import model.filmeM;
import model.filmeSerieM;
public class filme {
    public static void main(String[] args) {
        // LEITURA DE DADOS
        Scanner leia = new Scanner(System.in); // import java.util.Scanner (LINHA 108)
        
        int escolha;
        System.out.println("Para cadastrar um filme digite -1-\nPara cadastrar uma série digite -2-\nPara sair digite -0-\n");
        escolha = leia.nextInt(); // Scanner leia = new Scanner(System.in); (LINHA 114)
        
        while(escolha != 0){
            if(escolha == 1){
                System.out.println("============ MÉTODO CONSTRUTOR: ");
                filmeM filme = new filmeM("Teste titulo", "Teste sinopse", "Eu", 3,2019, 'A');
                filme.imprimirFilme();

                System.out.println("");

                System.out.println("============ MÉTODO SET: ");
                filme.setTitulo("Teste titulo");
                filme.setSinopse("Teste sinopse");
                filme.setElenco("Eu");
                filme.setDuracao(3);
                filme.setAno(2019);
                filme.setGenero('A');
                filme.imprimirFilme();
            }else if(escolha == 2){
                System.out.println("============ MÉTODO HERANÇA: ");
                filmeSerieM serie = new filmeSerieM("Teste titulo", "Teste sinopse", "Eu", 3,2019, 'A', true);
                serie.imprimirFilme();
                serie.imprimirFilmeSerieM();
            }else{
                escolha=0;
            }
        }   
    }
}
