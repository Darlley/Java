// M O D E L O  A L U N O

package model;
public class alunoM {
    
    // A T R I B U T O S
    private int ra;
    String cpf;
    String nome;
    char sexo;
    private int codCurso;

    
    // C O N S T R U T O R
    public alunoM(){
        this.ra=0;
        this.cpf=" ";
        this.nome=" ";
        this.sexo=' ';
        this.codCurso=0;
    }
    
    public alunoM(int ra, String cpf, String nome, char sexo, int codCurso) {
        this.ra = ra;
        this.cpf = cpf;
        this.nome = nome;
        this.sexo = sexo;
        this.codCurso = codCurso;
    }
    
    
    
    
    
    // M É T O D O S
    
    // GETTERS 
    public int getRa() {
        return ra;
    }
    public String getCpf() {
        return cpf;
    }
    public String getNome() {
        return nome;
    }
    public char getSexo() {
        return sexo;
    }
    public int getCodCurso() {
        return codCurso;
    }

    // SETTERS
    public void setRa(int ra) {
        this.ra = ra;
    }
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    public void setCodCurso(int codCurso) {
        this.codCurso = codCurso;
    }
   
    // SAIDA DE DADOS
    public void imprimirAluno(){
        System.out.println("NOME:   " + this.getNome());
        System.out.println("RA:     " + this.getRa());
        System.out.println("CURSO:  " + this.getCodCurso());
        System.out.println("CPF:    " + this.getCpf());
        System.out.println("SEXO:   " + this.getSexo());
        
    }
}




// M O D E L O  A L U N O  M E S T R A D O

package model;
public class AlunoMestradoM extends alunoM{

    private String dataInicio;
    private String dataFim;
    private boolean bolsista;
    private String nomeProjeto;

    public AlunoMestradoM(int ra, String cpf, String nome, char sexo, int codCurso, String dataInicio, String dataFim, boolean bolsista, String nomeProjeto){
        super(ra, cpf, nome, sexo, codCurso);
        this.dataInicio = dataInicio;
        this.dataFim = dataFim;
        this.bolsista = bolsista;
        this.nomeProjeto = nomeProjeto;
    }
    
    public void imprimirAlunoMestradoM(){
        System.out.println("Data de Início: "+this.dataInicio);
        System.out.println("Data Término:   "+this.dataFim);
        System.out.println("Bolsista:   "+this.bolsista);
        System.out.println("Nome do Projeto:    "+this.nomeProjeto);
    }
}




// M A I N

package aluno;
import model.alunoM;
import model.AlunoMestradoM;
public class aluno {
    public static void main(String[] args) {
       System.out.println("============ MÉTODO CONSTRUTOR: ");
       alunoM aluno = new alunoM(175517, "067", "Darlley", 'M', 0);
       aluno.imprimirAluno();
       
       System.out.println("");
       
       System.out.println("============ MÉTODO SET: ");
       aluno.setCodCurso(262);
       aluno.setCpf("06775682158");
       aluno.setNome("Darlley");
       aluno.setSexo('M');
       aluno.setRa(175517);
       aluno.imprimirAluno();
       
       System.out.println("============ MÉTODO HERANÇA: ");
       AlunoMestradoM aluno2 = new AlunoMestradoM(175517, "06775682158", "Darlley", 'M', 0, "08/08/2019", "09/08/2019", true, "Computação");
       aluno2.imprimirAluno();
       aluno2.imprimirAlunoMestradoM();
    }
}
