package Controller;
import model.alunoM;
import java.util.ArrayList;

public class alunoC {
    public ArrayList<alunoM> vetAlunoM;
    
    // CONSTRUTOR
    public alunoC(){
        vetAlunoM=new ArrayList<alunoM>();
    }
    public void insereAlunoM(alunoM alunoM){
        vetAlunoM.add(alunoM);
    }
    public void listaGeralAlunoC(){
        for(alunoM dados:vetAlunoM){
            dados.imprimirAluno();
        }
    }
}



package Controller;
import model.professorM;
import java.util.ArrayList;
import model.alunoM;

public class professorC {
    public ArrayList<professorM> vetProfessorM;
    
    // CONSTRUTOR
    public professorC(){
        vetProfessorM = new ArrayList<professorM>();
    }
    public void insereProfessorM(professorM professorM){
        vetProfessorM.add(professorM);
    }
    public void listaGeralProfessorC(){
        for(professorM dados:vetProfessorM){
            dados.imprimir();
        }
    }
}



package model;
public class professorM {
    
    // A T R I B U T O S
    
    private int rf;
    private String profissao;
    private String dataNascimento;
    private char area;
    private char qualificao;
    private float cargaHoraria;

    
    // M É T O D O S 
    
    // CONSTRUTOR SEM PARÂMETRO
    public professorM() {
        this.rf = 175517;
        this.profissao = "Professor";
        this.dataNascimento = "16/06/1998";
        this.area = 'C';
        this.qualificao = 'G';
        this.cargaHoraria = 6;
    }
    
    // CONSTRUTOR COOM PARÂMETROS
    public professorM(int rf, String profissao, String dataNascimento, char area, char qualificao, float cargaHoraria) {
        this.rf = rf;
        this.profissao = profissao;
        this.dataNascimento = dataNascimento;
        this.area = area;
        this.qualificao = qualificao;
        this.cargaHoraria = cargaHoraria;
    }
   
    // GETTERS
    public int getRf() {
        return rf;
    }
    public String getProfissao() {
        return profissao;
    }
    public String getDataNascimento() {
        return dataNascimento;
    }
    public char getArea() {
        return area;
    }
    public char getQualificao() {
        return qualificao;
    }
    public float getCargaHoraria() {
        return cargaHoraria;
    }

    // SETTERS
    public void setRf(int rf) {
        this.rf = rf;
    }
    public void setProfissao(String profissao) {
        this.profissao = profissao;
    }
    public void setDataNascimento(String dataNascimento) {
        this.dataNascimento = dataNascimento;
    }
    public void setArea(char area) {
        this.area = area;
    }
    public void setQualificao(char qualificao) {
        this.qualificao = qualificao;
    }
    public void setCargaHoraria(float cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }
    
    
    // SAIDA DE DADOS
    public void imprimir(){
        System.out.println("======================");
        System.out.println("RF: " + this.getRf());
        System.out.println("PROFISSÃO:  " + this.getProfissao());
        System.out.println("DATA DE NASCIMENTO: " + this.getDataNascimento());
        System.out.println("ÁREA:   " + this.getArea());
        System.out.println("QUALIFICAÇÃO:   " + this.getQualificao());
        System.out.println("CARGA HORÁRIA:  " + this.getCargaHoraria());
        System.out.println("======================");
    }
}





package aluno;
import model.alunoM;
import model.AlunoMestradoM;
import Controller.alunoC;
import Controller.professorC;
import model.professorM;
public class aluno {
    public static void main(String[] args) {
       alunoM aluno = new alunoM(123, "1414", "Aluno", 'E', 262);
       alunoC aluno3 = new alunoC();
       aluno3.insereAlunoM(aluno);

       aluno3.listaGeralAlunoC();
       
       professorM professor;
       professorC professor1 = new professorC();
       
       professor = new professorM(175517, "Professor", "16/06/1998", 'C', 'G', 6);
       professor1.insereProfessorM(professor);
       
       professor = new professorM(11, "Alex", "10/10/2010", 'C', 'G', 6);
       professor1.insereProfessorM(professor);
       
       professor = new professorM(11, "Alex", "10/10/2010", 'C', 'G', 6);
       professor1.insereProfessorM(professor); 
       
       professor1.listaGeralProfessorC();
       
       /*System.out.println("============ MÉTODO CONSTRUTOR: ");
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
       aluno2.imprimirAlunoMestradoM();*/
    }
}
