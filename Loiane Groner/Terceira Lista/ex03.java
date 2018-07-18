import java.util.Scanner;

public class ex03 {

    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);
        
        boolean infoValida = false;
        String nome, sexo, estadoCivil;
        int idade;
        double salario;
        
        
        // NOME
        
        do{
            System.out.println("Informe um nome: ");
            nome = scan.next();
            if(nome.length() > 3){
                infoValida = true;
            } else {
                System.out.println("Tamanho do nome inválido!");
                System.out.println("Informe um nome(até 3 caracteres): ");
            }
        }while(!infoValida)
        infoValida = false;
        
        
        // IDADE
        
        do{
            System.out.println("Informe a idade: ");
            idade = scan.nextInt();
            
            if(idade >= 0 && idade <= 150){
                infoValida = true;
            } else {
                System.out.println("Idade precisa ser entre 0 e 150!");
            }   
        }while(!infoValida)

            
        // SALÁRIO
            
        do{
            System.out.println("Informe o salário: ");
            salario = scan.nextDouble();
            
            if(salario > 0){
                infoValida = true;
            } else {
                System.out.println("Salário precisa ser maior que 0!");
            }   
        }while(!infoValida)
        infoValida = false;


        //sexo
        do{
            System.out.println("Informe o sexo: ");
            sexo = scan.next();
            
            if(sexo.equalsIgnoreCase("f") || sexo.equalsIgnoreCase("m")){
                infoValida = true;
            } else {
                System.out.println("Tipo SEXO inválido!");
            }   
        }while(!infoValida)
        infoValida = false;

    
        //Estado Civíl
        do{
            System.out.println("Informe o Estado Civíl: ");
            estadoCivil = scan.next();
            
            if(estadoCivil.equalsIgnoreCase("s") || sexo.equalsIgnoreCase("c" || estadoCivil.equalsIgnoreCase("v") || sexo.equalsIgnoreCase("d")){
                infoValida = true;
            } else {
                System.out.println("Tipo ESTADO CIVIL inválido!");
            }   
        }while(!infoValida)
        infoValida = false;
        
               
        // SAÍDA
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("Salário: " + salario);
        System.out.println("Sexo: " + sexo);
        System.out.println("Estado Civil: " + estadoCivil);
    }
}
