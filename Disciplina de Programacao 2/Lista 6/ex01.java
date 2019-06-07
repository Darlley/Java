public class UCDB { 
    String endereço;
    int anoFundação;
    Curso numCursos[];
    Professor numProfessores[];
    

    public UCDB(){
        endereço = Input.readString("Informe o endereço da universidade: ");
        anoFundação = Input.readInt("Informe o ano da fundação da universidade: ");
        numCursos = new Curso[30];
        numProfessores = new Professor[100];
    }
    
    // MÉTODOS CURSO
    public void addCurso(int cont){
	numCursos[cont] = new Curso();	
    }
    public void infoCursos(int contC){
	for(int i=0;i<contC;i++){
            numCursos[i].imprime();
        }
    }
    public void consultarCurso(int contC){
        String nome;
        int cont = 0;
        nome = Input.readString("Informe a área do curso: ");
        for(int i=0;i<=contC;i++){
            if(numCursos[i].areaCurso.equals(nome)){
                System.out.println("Cursos encontrados!\n" + i +
                                   ": "+ numCursos[i].nomeCurso);
                cont++;
            }
            if(i == contC && cont == 0){
                System.out.println("Cursos não encontrado!");
            }
            
        }
    }
    
    // MÉTODOS PROFESSOR
    public void addProfessor(int contP){
        numProfessores[contP] = new Professor();
    }
    public void infoProfessor(int contP){
	for(int i=0; i<contP; i++){
            numProfessores[i].imprime();
        }
    }
    public void consultarProfessorS(int contP){
        Double salario;
        int cont = 0;
        salario = Input.readDouble("Informe o salário para pesquisa: ");
        for(int i=0;i<=contP;i++){

            if(numProfessores[i].salario == salario){
                System.out.println("Professores encontrados!\n" + i +
                                   ": "+ numProfessores[i].nome);
                cont++;
            }
            if(i == contP && cont == 0){
                System.out.println("Professores não encontrados!");
            }
            
        }
    }
    public void consultarProfessorI(int contP){
        Double idade;
        int cont = 0;
        idade = Input.readDouble("Informe a idade para pesquisa: ");
        for(int i=0;i<=contP;i++){

            if(numProfessores[i].idade == idade){
                System.out.println("Professores encontrados!\n" + i +
                                   ": "+ numProfessores[i].nome);
                cont++;
            }
            if(i == contP && cont == 0){
                System.out.println("Professores não encontrados!");
            }
            
        }
    }
    public void calculaProfessor(int contP){
        double soma = 0;
        for(int i=0;i<=contP;i++){
            soma += numProfessores[i].salario; 
        }
        System.out.println("Gastos total com professores:\nR$" + soma);
    }
    
    public static void main(String[] args) {
        int continuar = 1, contC = 1, contP = 1, opcao;
        UCDB adm = new UCDB();
        
        while(continuar == 1){
            System.out.println("\n= = = = = = = = = MENU = = = = = = = = =");
            System.out.println("Digite\n[1] para inserir funcionário;\n[2] Para Pesquisar salário com nome;\n[3] para calcular valor total da folha de pagamento;\n[4] Para saber maior salário;\n[5] Para pesquisar funcionários pelo departamento;\n[6] Para pesquisar funcionarios pelas funções\n[7] Para imprimir dados dos funcionários;\n[ENTER] Para sair;\n= = = = = = = = = = = = = = = = = =");
            opcao = Input.readInt();
        
            switch(opcao){
                case 1: //cadastrar cursos
                    if(contC<=0){
                        adm.addCurso(contC);
                        contC++;
                    }else{
                        System.out.println("Esgotado!");
                    }
                    break;
                case 2: //cadastrar professores
                    if(contP<=0){
                        adm.addProfessor(contP);
                        contC++;
                    }else{
                        System.out.println("Esgotado!");
                    }
                    break;
                case 3: //consultar cursos pela área
                    if(contC > 0){
                        adm.consultarCurso(contC);
                    }else{
                        System.out.println("Adicione mais cursos!");
                    }
                    break;
                case 4: //consultar professores por salário
                    if(contP > 0){
                        adm.consultarProfessorS(contP);
                    }else{
                        System.out.println("Adicione professores!");
                    }
                    break;
                case 5: //consultar professores por idade
                    if(contP > 0){
                        adm.consultarProfessorI(contP);
                    }else{
                        System.out.println("Adicione professores!");
                    }
                    break;
                case 6: //calcular gasto mensal com professores
                    if(contP > 0){
                        adm.calculaProfessor(contP);
                    }else{
                        System.out.println("Adicione professores!");
                    }
                    break;
                case 7: //mostrar cursos
                    if(contC>0){
                        adm.infoCursos(contC);
                    }else{
                        System.out.println("Adicione cursos!");
                    }
                    break;
                case 8: //mostrar professores
                    if(contP>0){
                        adm.infoProfessor(contP);
                    }else{
                        System.out.println("Adicione professores!");
                    }
                    break;
                default:
                    System.out.println("Saindo...");
            }
        }
    }
}
