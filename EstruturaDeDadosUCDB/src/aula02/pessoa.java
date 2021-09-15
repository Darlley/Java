/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula02;

/**
 *
 * @author pericles.lopes
 */
public class pessoa {
    public int chave;
    public String nome;
    public String endereco;
    
    public pessoa(int chave,String nome,String endereco){
        this.chave=chave;
        this.nome=nome;
        this.endereco=endereco;
    }
    
    public void setChave(int chave){
        this.chave=chave;
    }
    public void setNome(String nome){
        this.nome=nome;
    }
    public void setEndereco(String endereco){
        this.endereco=endereco;
    }
    
    public int getChave(){
        return chave;
    }
    
    public String getNome(){
        return nome;
    }
    
    public String getEndereco(){
        return endereco;
    }
    
}
