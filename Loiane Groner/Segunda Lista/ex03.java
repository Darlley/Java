import java.util.Scanner;

public class ex03 {

    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);

        System.out.println("Informe seu sexo [M/F]: ");
        String umSexo = scan.nextLine();

        if(umSexo.equalsIgnoreCase("f")){
            System.out.println("O sexo é Feminino!");
        }else if(umSexo.equalsIgnoreCase("m")){
            System.out.println("O sexo é masculino!");
        }else{
            System.out.println("Sexo Inválido!");
        }
    }
}
