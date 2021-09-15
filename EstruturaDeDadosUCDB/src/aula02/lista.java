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
public class lista {
    public pessoa L[];
    int n;
    
    public lista(){
        L = new pessoa[10];
        n = 0;
    }
    
    public void insere(int num, String nome, String end){
        L[n++] = new pessoa(num,nome,end);
    }
    
    public void imprimeLista(){
        for(int i=0;i<n;i++){
            System.out.println(L[i].getChave()+" "+L[i].getNome()+" "+L[i].getEndereco()+" ");
        }
    }
    
    public int busca(int x){
        int i=0,posicao=-1;
        while(i<n){
            if(L[i].getChave() == x){
                posicao = i;
                i=n;
            }else
                i++;
        }
        return posicao;
    }
    
    public static void main(String args[]){
        lista l;
        l = new lista();
        l.insere(1,"Nome1","End1");
        l.imprimeLista();
        System.out.println("Busca chave 1: "+l.busca(1));
        System.out.println("Busca chave 2: "+l.busca(2));
    }
}
