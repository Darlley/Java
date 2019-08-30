package novotadsbd;

import Controle.BancoDeDados;
import Modelo.alunoM;
import Controle.AlunoC;
import java.sql.ResultSet;

public class NovoTadsBd {

    public static void main(String[] args) {
        alunoM alm=new alunoM(15, "Renato", 21, 262, "20/01/18");
        AlunoC alc=new AlunoC();
        //alc.CadastroAluno(alm);
        try{
            ResultSet dados=alc.BuscaTodos();
            
            while(dados.next()){
                System.out.println("");
                System.out.println("RA      : "+dados.getInt("ra"));
                System.out.println("NOME    : "+dados.getString("pnome"));
                System.out.println("IDADE   : "+dados.getInt("idade"));
                System.out.println("CURSO   : "+dados.getInt("codCurso"));
                System.out.println("DATA    : "+dados.getString("data"));
                System.out.println("- - - - - - - ");
            }
            
            /*ResultSet dados=alc.BuscaPorRA();
            while(dados.next()){
                System.out.println("RA      : "+dados.getInt("ra"));
            }*/
            
        }catch(Exception erro){
            erro.printStackTrace();
        }
        
      
    }
}





package Modelo;

public class alunoM {
    private int ra;
    private String pnome;
    private int idade;
    private int codCurso;
    private String data;
    public String getRa;

    public alunoM(int ra, String pnome, int idade, int codCurso, String data) {
        this.ra = ra;
        this.pnome = pnome;
        this.idade = idade;
        this.codCurso = codCurso;
        this.data = data;
    }

    // METODOS GETTERS
    public int getRa() {
        return ra;
    }
    public String getPnome() {
        return pnome;
    }
    public int getIdade() {
        return idade;
    }
    public int getCodCurso() {
        return codCurso;
    }
    public String getData() {
        return data;
    }

    // MÉTODOS SETTERS
    public void setRa(int ra) {
        this.ra = ra;
    }
    public void setPnome(String pnome) {
        this.pnome = pnome;
    }
    public void setIdade(int idade) {
        this.idade = idade;
    }
    public void setCodCurso(int codCurso) {
        this.codCurso = codCurso;
    }
    public void setData(String data) {
        this.data = data;
    }

   

    
}






package Controle;

import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

public class BancoDeDados {
    
    // Objeto de conexão com BD
    public Connection conect;
    
    // Objeto de comandos SQL
    public Statement state;
    
    // Objeto com dados SQL
    private ResultSet result;

    public void abrirConexao(){
        
        try{
            Class.forName("org.postgresql.Driver");
            conect = DriverManager.getConnection("jdbc:postgresql://localhost:5432/IES","postgres", "123456");
            System.out.println("Conectado ao PostGreSQL.");        
        }catch(Exception e){
            System.out.println("Falha ao tentar a conexão");
            e.printStackTrace();
        }
       
        try{
            state = (Statement) conect.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);      
        }catch(Exception e){
            System.out.println("Falha no Cursor de Execução");
            e.printStackTrace();
        }
    }
    
    public Connection getConnection(){
        return conect;
    }
    
    public Statement getStatement(){
        return state;
    }
    
    public void fecharConexao(){
        if(conect != null){
            try{ 	 	
                conect.close();
                System.out.println("Conexão Postgre FECHADA");
            }catch(SQLException erro){
                erro.printStackTrace();
            }
        }
    }
}






package Controle;
import Modelo.alunoM;
import java.sql.ResultSet;
import java.sql.Statement;

public class AlunoC {
    BancoDeDados bd=new BancoDeDados();
    ResultSet consultarBase;
    
    public void CadastroAluno(alunoM alm){
        
        try{
            //conexão com BD 
            bd.abrirConexao();
            //Comando SQL para dar INSERT                          
            String sql_ins="insert into aluno values('"+alm.getRa()+"','"+alm.getPnome()+"','"+alm.getIdade()+"','"+alm.getCodCurso()+"','"+alm.getData()+"')";
            //Executa o comando SQL via Statement
            bd.getStatement().execute(sql_ins);
            
            //Encerra a conexão com BD
            bd.fecharConexao();
        }catch(Exception erro){
            erro.printStackTrace();
        }
    }
    
    public ResultSet BuscaTodos(){
        try{
            bd.abrirConexao();
            String sql_sel="select * from aluno";
            String string;
            consultarBase = bd.getStatement().executeQuery(sql_sel);
            System.out.println("BuscaTodos OK");
            bd.fecharConexao();
        }catch(Exception erro){
            erro.printStackTrace();
        }
        return consultarBase;
    }
    
    public ResultSet BuscaPorRA(int ra){
        
        try{
            bd.abrirConexao();
            String sql_sel="select ra from aluno";
            String string;
            consultarBase = bd.getStatement().executeQuery(sql_sel);
            System.out.println("BuscaPorRA OK");
            bd.fecharConexao();
        }catch(Exception erro){
            erro.printStackTrace();
        }
        
        return consultarBase;
    }
}
