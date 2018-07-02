import java.util.Scanner;

public class ex01 {

    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);

        String umSexo;
        System.out.println("Informe seu sexo [M/F]: ");
        umSexo = scan.nextLine();

        if(umSexo == "F"){
            System.out.println("O sexo é Feminino!");
        }else if(umSexo == "M"){
            System.out.println("O sexo é masculino!");
        }else{
            System.out.println("Sexo Inválido!");
        }
    }
}
