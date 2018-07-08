// AULA 04

import java.awt.Dimension;
import java.awt.Toolkit;

public class ex02 {
  public static void main(String[] args){
    Dimension telaTamanho = Toolkit.getDefaultToolkit().getScreenSize();
    
    int larguraTela = (int) telaTamanho.getWidth();
    int alturaTela = (int) telaTamanho.getHeight();
    
    System.out.println("Sua tela tem resolução " + larguraTela + " x " + alturaTela);
  }
}
