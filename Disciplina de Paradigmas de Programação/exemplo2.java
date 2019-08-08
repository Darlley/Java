package model;
public class alunoM {
   
    // A T R I B U T O S
    private int ra;
    private String cpf;
    private String nome;
    private char sexo;
    private int codCurso;

    
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
    public void imprimir(){
        System.out.println("NOME: " + this.getNome());
        System.out.println("RA: " + this.getRa());
        System.out.println("CURSO: " + this.getCodCurso());
        System.out.println("CPF: " + this.getCpf());
        System.out.println("SEXO: " + this.getSexo());
        
    }
}





package aluno;
import model.alunoM;
public class Aluno {
    public static void main(String[] args) {
       alunoM aluno = new alunoM();
       
       aluno.setCodCurso(262);
       aluno.setCpf("06775682158");
       aluno.setNome("Darlley");
       aluno.setSexo('M');
       aluno.setRa(175517);
       
       aluno.imprimir();
               
    }
}
