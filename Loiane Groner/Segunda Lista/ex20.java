import java.util.Scanner;

public class ex20 {

    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);
        
        System.out.println("Telefonou para a vítima?");
        String resp1  = scan.next();
        System.out.println("Esteve no local?");
        String resp2  = scan.next();
        System.out.println("Mora perto?");
        String resp3  = scan.next();
        System.out.println("Ja trabalhou com a vítima?");
        String resp4  = scan.next();
        System.out.println("Devia para a vítima?");
        String resp5  = scan.next();
        
        int cont = 0;
        
        if(resp1.equalsIngoreCase("S")){
          cont++;
        }
        
        if(resp2.equalsIngoreCase("S")){
          cont++;
        }
        
        if(resp3.equalsIngoreCase("S")){
          cont++;
        }
        
        if(resp4.equalsIngoreCase("S")){
          cont++;
        }
        
        if(resp5.equalsIngoreCase("S")){
          cont++;
        }
        
        if(cont == 2){
          System.out.println("Suspeita");
        }else if(cont == 3 || cont == 4){
          System.out.println("Cúmplice");
        }else if(cont == 5){
           System.out.println("Assassino");
        }else if(cont == 0){
           System.out.println("inocente");
        }
    }
}
