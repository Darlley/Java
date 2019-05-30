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

public class Funcionario {

    // A T R I B U T O S
    public int matricula; 
    public String nome;
    public int departamento;
    public double salário;
    public String função;
    
    // construtor
    public Funcionario(){      
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
    
    public void folhaPagamento(int qtd){
        
    }
    
    // M E T O D O  P R I N C I P A L
    public static void main(String[] args) {
        int opacao, qtd, dpt, cont = 0, continuar = 1;
        String nome, func;

        Funcionario numFuncionarios[];
        qtd = Input.readInt("Informa a quantidade de funcionarios: ");
        numFuncionarios = new Funcionario[qtd];
        
        while(continuar == 1){
            System.out.println("\n= = = = = = = = = MENU = = = = = = = = =");
            System.out.println("Digite\n[1] para inserir funcionário;\n[2] Para Pesquisar salário com nome;\n[3] para calcular valor total da folha de pagamento;\n[4] Para saber maior salário;\n[5] Para pesquisar funcionários pelo departamento;\n[6] Para pesquisar funcionarios pelas funções\n[7] Para imprimir dados dos funcionários;\n[ENTER] Para sair;\n= = = = = = = = = = = = = = = = = =");
            opacao = Input.readInt();
        
            switch(opacao){
                case 1: // A) ADICIONAR FUNCIONÁRIO
                    if(cont < qtd){
                        numFuncionarios[cont] = new Funcionario();
                        cont++;
                    }else{
                        System.out.println("Esgotado");
                    }
                    break;
                case 2: // B) PESQUISAR SALÁRIO (NOME)
                    if(cont > 0){
                        nome = Input.readString("Informe um nome: ");
                        for(int i=0;i<=cont;i++){
                            if(numFuncionarios[i].nome.equals(nome)){
                                System.out.println("Salário: RS " + numFuncionarios[i].getSalario());
                            }else{
                                System.out.println("Funcionário não encontrado!");
                            }
                            break;
                        }
                    }else{
                        System.out.println("Adicione mais funcionário!");
                    }
                    break;
                case 3: // C) VALOR TOTAL DA FOLHA DE PAGAMENTO
                    double totalFolhaSalarial = 0;
                    continuar = cont;
                    while(cont > 0){
                        totalFolhaSalarial += totalFolhaSalarial + numFuncionarios[cont].getSalario();
                        cont--;
                    }
                    cont = continuar;
                    continuar = 1;
                    System.out.println(totalFolhaSalarial);
                    break;
                case 4: // D) FUNCIONÁRIO COM MAIOR SALÁRIO
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
                case 5: // E) PESQUISAR FUNCIONÁRIO (APARTAMENTO)
                    dpt = Input.readInt("Informe o número do departamento: ");
                    for(int i=1;i<=cont;i++){
                        if(numFuncionarios[i].departamento == dpt){
                            System.out.println(numFuncionarios[i].getNome());
                        }
                    }
                    break;
                case 6: // E) PESQUISAR FUNCIONÁRIO (FUNÇÃO)
                    func = Input.readString("Informe o número do departamento: ");
                    for(int i=1;i<=cont;i++){
                        if(numFuncionarios[i].função == func){
                            System.out.println(numFuncionarios[i].getNome());
                        }
                    }
                    break;
                case 7:
                    // IMPRIMIR DADOS
                    if(cont < qtd){
                        numFuncionarios[cont].imprimir();
                    }else{
                        for(int i=0; i<=qtd; i++){
                            numFuncionarios[i].imprimir();
                        }
                    }
                    break;
                default:
                    System.out.println("Saindo...");
            }
        }
    }
}
