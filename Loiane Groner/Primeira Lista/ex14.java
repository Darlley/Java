import java.util.Scanner;

public class ex11 {

    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);

        System.out.println("Informe o tamanho do arquivo: ");
        double arquivoTamanho  = scan.nextDouble();
        System.out.println("Informe a velocidade da internet: ");
        double internetVelocidade  = scan.nextDouble();
        
        double tempoBaixar = arquivoTamanho / internetVelocidade;
        
        System.out.println("O tempo de dowload é de " + tempoBaixar);
    }
}
