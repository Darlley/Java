/* A fim de representar empregados em uma firma, crie uma classe chamada Empregado que inclui as três informações a seguir como atributos: • um primeiro nome, • um sobrenome, e • um salário mensal. Sua classe deve ter um construtor que inicializa os três atributos. Forneça um método set e get para cada atributo. Se o salário mensal não for positivo, configure-o como 0.0. Escreva um aplicativo de teste que demonstra as capacidades da classe. Crie duas instâncias da classe e exiba o salário anual de cada instância. Então dê a cada empregado um aumento de 10% e exiba novamente o salário anual de cada empregado. */

public class Empregado {
    public String primeiroNome;
    public String sobrenome;
    public double salarioMensal;
    
    public Empregado(){
        primeiroNome = Input.readString("Informe o (primeiro) nome: ");
        sobrenome = Input.readString("Informe o sobrenome: ");
        salarioMensal = Input.readDouble("Informe valor do salário: ");
    }
    
    //METODOS SETTERS
    public void setNome(String nome){
        this.primeiroNome = primeiroNome;
    }
    public void setSobrenome(String capital){
        this.sobrenome = sobrenome;
    }
    public void setSalario(double dimensao){
        this.sobrenome = sobrenome;
    }
        
    //METODOS GETTERS
    public String getNome(){
        return primeiroNome;
    }
    public String getSobrenome(){
        return sobrenome;
    }
    public double getSalario(){
        return salarioMensal;
    }
    
    public void calcularSalario(Empregado funcionarios){
        Double total;
        total = funcionarios.getSalario() * 12;
    }
    
    public static void main(String[] args) {
        int leitor, ligado = 1, contadorFuncionarios = 0;
        Empregado funcionarios[] = new Empregado[2];
        
        while(ligado != 0){
            leitor = Input.readInt("1- Para cadastrar funcionário;\n2- Para calcular o valor anual do salario;\n3- Para mostrar;\nESCOLHA: ");
            switch(leitor){
                case 1:
                    if(contadorFuncionarios < 2){
                        funcionarios[contadorFuncionarios] = new Empregado();
                        
                    }
                    contadorFuncionarios = contadorFuncionarios+1;
                    break;
                case 2:
                    int indice;
                    if(contadorFuncionarios != 0){
                        for(int i=0; i<2;i++){
                            System.out.println("\nTotal anual do salário de " + funcionarios[i].getNome());
                            funcionarios[i].calcularSalario(funcionarios[i]);
                        }
                    }
                    break;
                case 3: // PARA TESTAR
                    for(int i=0; i<2; i++){
                        System.out.println(funcionarios[i].primeiroNome);
                    }
                    break;
                default:
                    ligado = 0;
            }
        }
    }
}
