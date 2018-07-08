import java.util.Scanner;

public class ex09 {

    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);

        System.out.println("Informe o primeiro número: ");
        int primeiroNumero  = scan.nextInt();

        System.out.println("Informe o segundo número: ");
        int segundoNumero  = scan.nextInt();

        System.out.println("Informe o terceiro número: ");
        int terceiroNumero  = scan.nextInt();

        if(primeiroNumero > segundoNumero && segundoNumero > terceiroNumero){
            System.out.println(primeiroNumero + ", " + segundoNumero + ", " + terceiroNumero);  
        }else if(segundoNumero >= primeiroNumero && segundoNumero > terceiroNumero && primeiroNumero >= terceiroNumero){
            System.out.println(segundoNumero + ", " + primeiroNumero + ", " + terceiroNumero);
        }else if(segundoNumero > primeiroNumero && segundoNumero >= terceiroNumero && primeiroNumero <= terceiroNumero){
            System.out.println(segundoNumero + ", " + terceiroNumero + ", " + primeiroNumero);
        }else if(segundoNumero > primeiroNumero && segundoNumero <= terceiroNumero){
            System.out.println(terceiroNumero + ", " + segundoNumero + ", " + primeiroNumero);
        }else if(segundoNumero < primeiroNumero && primeiroNumero < terceiroNumero){
            System.out.println(terceiroNumero + ", " + primeiroNumero + ", " + segundoNumero);
        }else if(segundoNumero < terceiroNumero && terceiroNumero <= primeiroNumero){
            System.out.println(primeiroNumero + ", " + terceiroNumero + ", " + segundoNumero);
        }else{
            System.out.println(terceiroNumero + ", " + segundoNumero + ", " + primeiroNumero);
        }
    }
}
