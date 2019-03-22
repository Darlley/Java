/* Crie uma classe chamada Invoice que possa ser utilizado por uma loja de suprimentos de informática para representar uma fatura de um
item vendido na loja. Uma fatura deve incluir as seguintes informações como atributos:

o número do item faturado,
a descrição do item,
a quantidade comprada do item e
o preço unitário do item.

Sua classe deve ter um construtor que inicialize os quatro atributos. Se a quantidade não for positiva, ela deve ser configurada como 0.
Se o preço por item não for positivo ele deve ser configurado como 0.0. Forneça um método set e um método get para cada variável de
instância. Além disso, forneça um método chamado getInvoiceAmount que calcula o valor da fatura (isso é, multiplica a quantidade pelo
preço por item) e depois retorna o valor como um double. Escreva um aplicativo de teste que demonstra as capacidades da classe Invoice.
*/

public class Invoice { 
// DO INGLÊS: "FATURA"
    
    //  A T R I B U T O S
    int numero;
    String desc;
    int qtd;
    double preco;
    
    // C O N S T R U T O R
    public Invoice(int numero, String desc, int qtd, double preco){
        this.numero = numero;
        this.desc = desc;
        this.qtd = qtd;
	this.preco = preco;
	if(this.preco < 0){     // "Se o preço por item não
            this.preco = 0.0;   // for positivo ele deve ser
        }                       // configurado como 0.0"
    }
    
    // M E T O D O S  S E T T E R S
    public void setNumero(int numero){
        this.numero = numero;
    }
    public void setQtd(int qtd){
        this.qtd = qtd;
    } 
    public void setDesc(String desc){
	this.desc = desc;
    }
    public void setPreco(double preco){
	this.preco = preco;
    }
    
    // M E T O D O S  G E T T E R S
    public int getNumero(){
        return numero;
    }
    public int getQtd(){
        return qtd;
    }
    public String getDesc(){
        return desc;
    }
    public double getPreco(){
        return preco;
    }
    // M E T O D O  C A L C U L A
    public double getInvoiceAmount(){
        return preco * qtd; 
    }
    
    // M E T O D O  P R I N C I P A L
    public static void main(String[] args) {
        Invoice venda;
        venda = new Invoice(5,"Teclado", 2, 250.0);

        System.out.println("Item: \n==== " + venda.getDesc() + " ====\n"); //DESCRIÇÃO
        System.out.println("Código de '" + venda.getDesc() + "': " + venda.getNumero());
        System.out.println("Quantidade: " + venda.getQtd());
        System.out.println("TOTAL: " + venda.getInvoiceAmount());
    }
}
