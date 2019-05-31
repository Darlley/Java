/*
Escreva uma classe chamada UCDB. A UCDB possui como características
endereço, ano de fundação, um número de pelo menos 30 diferentes cursos
e pelo menos 100 professores. Cada curso possui como atributo um nome,
uma área de atuação (saúde, exatas, humanas), uma data de início de
atividades e número de vagas abertas para entrada no vestibular. Já os
professores possuem como característica um nome, um registro de
funcionário, idade, endereço, telefone e salário. Construa uma main que
represente a UCDB e seja capaz de cadastrar cursos e professores. Construa
um construtor que não recebe argumentos para professores e cursos.
Construa um construtor que receba argumentos para professores e cursos.
Construa uma função que a partir da UCDB o usuário consiga listar as
informações dos professores e outra para listar as informações dos cursos.
Além disso, permita consultas aos cursos por área, aos professores por
salário e idade. Faça ainda uma funcionalidade que forneça o gasto mensal
da UCDB com os professores cadastrados. Faça um método para divulgar o
professor que recebe o maior salário e o professor que tem a maior idade.
Para finalizar construa um método para retornar o curso mais antigo de todos
os cursos cadastrados.
*/

public class UCDB {
    
    public String endereço;
    public String numCursos[][] = new String[4][30];
    public String numProfessores[][] = new String[6][100];
    public int anoFundação;
    
    // C O N S T R U T O R
    public UCDB(){}
    public void criarCurso(){
        String nomeCurso, areaCurso, dataInicioLetivo; //saúde, exatas, humanas
        int numVagas;

        for(int i=0; i<=30; i++){
            for(int j=0;j<=30; j++){
                numCursos[i][j].nomeCurso = Input.readString("");
                areaCurso = Input.readString("");
                dataInicioLetivo = Input.readString("");
                numVagas = Input.readInt("");
            }
        }        
    }
    public void cadastrarProfessor(){
        String nome, endereco, telefone;
        int registro, idade;
        double salario;
        
        for(int i=0; i<=100; i++){
        
        }
    }
    
    /*
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
    */
    
    // LISTAR INFORMAÇÃO DO PROFESSOR
    public void infoProfessor(){
        
    }
    // LISTAR INFORMAÇÃO DO CURSO
    public void infoCurso(){
    
    }
    public void maiorSalario(){
    }
    public void maiorIdadeProfessor(){
    }
    public void maiorIdadeCurso(){
    }
    
    public static void main(String[] args) {
        int qtdCursos, qtdProfessores, continuar = 1, opcao;
        UCDB cursos, professores;
        cursos = new UCDB();
        professores = new UCDB();
        
        while(continuar == 1){
            System.out.println("\n= = = = = = = = = MENU = = = = = = = = =");
            System.out.println("Digite\n[1] para inserir funcionário;\n[2] Para Pesquisar salário com nome;\n[3] para calcular valor total da folha de pagamento;\n[4] Para saber maior salário;\n[5] Para pesquisar funcionários pelo departamento;\n[6] Para pesquisar funcionarios pelas funções\n[7] Para imprimir dados dos funcionários;\n[ENTER] Para sair;\n= = = = = = = = = = = = = = = = = =");
            opcao = Input.readInt();
        
            switch(opcao){
                case 1: //cadastrar cursos
                    cursos.criarCurso();
                    break;
                case 2: //cadastrar professores
                    
                    break;
                case 3: //consultar cursos pela área
                    
                    break;
                case 4: //consultar professores por salário
                    
                    break;
                case 5: //consultar professores por idade
                    
                    break;
                case 6: //calcular gasto mensal com professores
                    
                    break;
                case 7: //mostrar cursos
                   
                    break;
                case 8: //mostrar professores
                    
                    break;
                default:
                    System.out.println("Saindo...");
            }
        }
    }
}
