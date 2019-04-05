/* Escreva uma classe “Funcionário” com os atributos matricula (int), nome
(String), departamento (int), salário (double) e função (String). Adicione na
classe um construtor que receba todos os parâmetros para inicializar os dados
de um funcionário.

Escreva uma main que tenha vetor da classe “Funcionário” e uma variável
inteira para ser usada como índice do vetor. O número de funcionários de uma
empresa para instanciar o vetor deve ser informado pelo usuário. Acrescente
os seguintes métodos à classe:

a. um método para adicionar funcionários no vetor definido na classe;
b. um método que possa imprimir a folha de pagamento informando o nome
dos funcionários e os seus respectivos salários;
c. um método que possa retornar o valor total da folha de pagamento;
d. um método que possa retornar o nome do funcionário que recebe o maior
salário;
e. um método que possa receber como parâmetro o número de um
determinado departamento e mostrar o nome e o cargo de todos os
funcionários daquele departamento;
f. um método que possa receber como parâmetro o nome de uma
determinada função e posteriormente imprimir o nome de todas as pessoas
que exercem essa função. */

public class funcionarios {

    // A T R I B U T O S
    public int matricula; 
    public String nome;
    public int departamento;
    public double salário;
    public String função;
    
    // construtor
    public funcionarios(){      
        this.matricula = Input.readInt("Matricula: ");
        this.nome = Input.readString("Nome: ");
        this.departamento = Input.readInt("Departamento: ");
        this.salário = Input.readDouble("Salário: ");
        this.função = Input.readString("Função: ");
    }
    
    public void imprimir(){      
        System.out.println(matricula);
        System.out.println(nome);
        System.out.println(departamento);
        System.out.println(salário);
        System.out.println(função);
    }
    
    public int getMatricula(){
        return matricula;
    }
    public String getNome(){
        return nome;
    }
    public int getDepartamento(){
        return departamento;
    }
    public double getSalario(){
        return salário;
    }
    public String getFuncao(){
        return função;
    }
    
    // M E T O D O  P R I N C I P A L
    public static void main(String[] args) {
        int opacao, qtd, cont = 0;

        funcionarios numFuncionarios[];
        qtd = Input.readInt("Informa a quantidade: ");
        numFuncionarios = new funcionarios[qtd];
        numFuncionarios[0] = new funcionarios();
  
        System.out.println("Inserir funcionário? ");
        opacao = Input.readInt();
        switch(opacao){
            case 1:
                if(cont < qtd){
                    numFuncionarios[cont] = new funcionarios();
                    cont++;
                }else{
                    System.out.println("!");
                }
                break;
            case 2: 
                if(cont < qtd){
                    numFuncionarios[cont].imprimir();
                }else{
                    for(int i=0; i<=qtd; i++){
                        numFuncionarios[i].imprimir();
                    }
                }
            case 3:
                double totalFolhaSalarial = 0;
                for(int i=0;i<=cont;i++){
                    totalFolhaSalarial = totalFolhaSalarial + numFuncionarios[i].getSalario();
                }
                System.out.println(totalFolhaSalarial);
                break;
            case 4: // M A I O R  S A L A R I O
                if(cont > 0){
                    double maior = numFuncionarios[0].getSalario();
                    String nomeMaior = numFuncionarios[0].getNome();
                    for(int i=1;i<=cont;i++){
                        if(maior < numFuncionarios[i].getSalario()){
                            maior = numFuncionarios[i].getSalario();
                            nomeMaior = numFuncionarios[i].getNome();
                        }
                    }
                    System.out.println("Maior salário é " + nomeMaior + " com R$: " + maior);
                }else{
                    System.out.println("Inserir funcionário!");
                }
                break;
            default:
                System.out.println("Saindo...");
        }
    }
}
