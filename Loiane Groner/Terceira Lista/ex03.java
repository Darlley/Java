import java.util.Scanner;

public class ex03 {

    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);

        // NOME
        System.out.println("Informe um nome(até 3 caracteres): ");
        String nome = scan.nextLine();

        if(nome.length() > 3){
            System.out.println("Tamanho do nome inválido!");
            System.out.println("Informe um nome(até 3 caracteres): ");
            nome = scan.nextLine();
        }

        // IDADE
        System.out.println("Informe uma idade(até 150): ");
        int idade = scan.nextInt();

        if(idade > 150){
            System.out.println("Tamanho idade inválido!");
            System.out.println("Informe uma idade(até 150): ");
            idade = scan.nextInt();
        }


        // SALÁRIO
        System.out.println("Informe um salário(Maior que 0): ");
        double salario = scan.nextDouble();

        if(salario <= 0){
            System.out.println("Quantidade salário inválido!");
            System.out.println("Informe um salário(Maior que 0): ");
            salario = scan.nextDouble();
        }


        //sexo
        System.out.println("Informe um sexo(M, F): ");
        String sexo = scan.nextLine();

        if(sexo != "M" && sexo != "F"){
            System.out.println("Tipo sexo inválido!");
            System.out.println("Informe um sexo(M, F): ");
            sexo = scan.nextLine();
        }

        //Estado Civíl
        System.out.println("Informe um estado cívil[S, C, V ou D]: ");
        String estadoCiv = scan.nextLine();

        if(estadoCiv != "S" && estadoCiv != "C" && estadoCiv != "V" && estadoCiv != "D"){
            System.out.println("Tipo estado civíl inválido!");
            System.out.println("Informe um estado cívil[S, C, V ou D]: ");
            estadoCiv = scan.nextLine();
        }

    }
}
