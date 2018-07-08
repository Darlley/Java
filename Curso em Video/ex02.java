import java.awt.Dimension;
import java.awt.Toolkit;

public class ex01 {
  public static void main(String[] args){
    Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
    
    int larguraTela = screenSize.getWidth();
    int alturaTela = screenSize.getHeight();
    
    System.out.println("Sua tela tem resolução " + larguraTela + " x " + alturaTela);
  }
}
