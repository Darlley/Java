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
        System.out.println("RF: " + this.getRf());
        System.out.println("PROFISSÃO:  " + this.getProfissao());
        System.out.println("DATA DE NASCIMENTO: " + this.getDataNascimento());
        System.out.println("ÁREA:   " + this.getArea());
            System.out.println("QUALIFICAÇÃO:   " + this.getQualificao());
        System.out.println("CARGA HORÁRIA:  " + this.getCargaHoraria());
    }
}





package professor;
import model.professorM;

public class Professor {

    public static void main(String[] args) {
       System.out.println("============ MÉTODO CONSTRUTOR SEM PARÂMETROS: ");
       professorM professor2 = new professorM();
       professor2.imprimir();
       
       System.out.println("");
        
       System.out.println("============ MÉTODO CONSTRUTOR COM PARÂMETROS: ");
       professorM professor = new professorM(175517, "Professor", "16/06/1998", 'C', 'G', 6);
       professor.imprimir();
      
       System.out.println("");
       
       System.out.println("============ MÉTODO SET: ");
       professor.setRf(175517);
       professor.setProfissao("Professor");
       professor.setDataNascimento("16/06/1998");
       professor.setArea('C');
       professor.setQualificao('G');
       professor.setCargaHoraria(6);
       professor.imprimir();
    }
    
}
