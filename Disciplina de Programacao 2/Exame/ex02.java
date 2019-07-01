/* A fim de representar empregados em uma firma, crie uma classe chamada Empregado que inclui as três informações a seguir como 
atributos: • um primeiro nome, • um sobrenome, e • um salário mensal. Sua classe deve ter um construtor que inicializa os três 
atributos. Forneça um método set e get para cada atributo. Se o salário mensal não for positivo, configure-o como 0.0. Escreva um 
aplicativo de teste que demonstra as capacidades da classe. Crie duas instâncias da classe e exiba o salário anual de cada instância. 
Então dê a cada empregado um aumento de 10% e exiba novamente o salário anual de cada empregado. */

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
        this.primeiroNome = nome;
    }
    public void setSobrenome(String sobrenome){
        this.sobrenome = sobrenome;
    }
    public void setSalario(double salario){
        this.salarioMensal = salario;
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
        System.out.println("TOTAL SALÁRIO: " + total);
    }
    public void aumento(Empregado funcionarios){
        double aumento = funcionarios.getSalario();
        aumento += funcionarios.getSalario()*10/100;
        funcionarios.setSalario(aumento); 
    }
    
    public static void main(String[] args) {
        int leitor, ligado = 1, contadorFuncionarios = 0;
        Empregado funcionarios[] = new Empregado[2];
        
        while(ligado != 0){
            System.out.println("=====  M E N U  =====");
            leitor = Input.readInt("1- Para cadastrar funcionário;\n2- Para calcular o valor anual do salario;\n3- Aumentar salário em 10%;\n4- Para mostrar;\nESCOLHA: ");
            System.out.println("");
            switch(leitor){
                case 1:
                    System.out.println("===== CADASTRAR FUNCIONÁRIO =====\n");
                    System.out.println("- - - - - - - - - - - - -");
                    System.out.println("| LIMITE DE CADASTROS: 2 |\n| VOCÊ JA CADASTROU: " + contadorFuncionarios + "   |\n- - - - - - - - - - - - -");
                    if(contadorFuncionarios < 2){
                        System.out.println("");
                        funcionarios[contadorFuncionarios] = new Empregado();
                        contadorFuncionarios = contadorFuncionarios+1;  
                    }
                    
                    System.out.println("");
                    break;
                case 2:
                    int indice;
                    System.out.println("===== CALCULAR SALÁRIO ANUAL =====\n");
                    if(contadorFuncionarios != 0){
                        for(int i=0; i<contadorFuncionarios;i++){ // Enquanto indice for menor ou igual que o total de funcionarios
                            System.out.println("NOME FUNCIONÁRIO: " + funcionarios[i].getNome() + " " + funcionarios[i].getSobrenome());
                            funcionarios[i].calcularSalario(funcionarios[i]);
                            if((i+1)<contadorFuncionarios){ // Se tiver mais, quebrar linha
                                System.out.println("- - - - - - - - - -");
                            }
                        }
                    }
                    System.out.println("");
                    break;
                case 3: // AUMENTO DE 10%
                    System.out.println("===== AUMENTAR 10% =====\n");
                    for(int i=0; i<contadorFuncionarios; i++){
                        System.out.println("NOME FUNCIONÁRIO: " + funcionarios[i].getNome() + " " + funcionarios[i].getSobrenome());
                        System.out.println("ANTIGO SALÁRIO: " + funcionarios[i].getSalario());
                        funcionarios[i].aumento(funcionarios[i]);
                        System.out.println("NOVO SALÁRIO: " + funcionarios[i].getSalario());
                        if((i+1)<contadorFuncionarios){ // Se tiver mais, quebrar linha
                            System.out.println("- - - - - - - - - -");
                        }
                    }
                    System.out.println("");
                    break;
                case 4: // MOSTRAR FICHA
                    System.out.println("===== FUNCIONÁRIOS =====\n");
                    System.out.println("------------");
                    System.out.println("| TOTAL: " + contadorFuncionarios + " |\n------------");
                    for(int i=0; i<contadorFuncionarios; i++){
                        System.out.println("NOME: " + funcionarios[i].getNome());
                        System.out.println("SOBRENOME: " + funcionarios[i].getSobrenome());
                        System.out.println("SALÁRIO: " + funcionarios[i].getSalario());
                        System.out.println();
                        if((i+1)<contadorFuncionarios){ // Se tiver mais, quebrar linha
                            System.out.println("- - - - - - - - - -");
                        }
                    }
                    System.out.println("");
                    break;
                default:
                    ligado = 0;
            }
        }
    }
}
