import java.util.Scanner;

public class ex18 {

    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);
        
        System.out.println("Informe um número: ");
        int numero1  = scan.nextInt();
        
        System.out.println("Informe outro número: ");
        int numero2  = scan.nextInt();
        
        System.out.println("Qual operação deseja realizar?: ");
        String operador  = scan.nextInt();
        
        double operacao = 0; 
        boolean valida = true;
        
        switch(operador){
          case "+":
            operacao = numero1 + numero2;
            break;
          case "-":
            operacao = numero1 - numero2;
            break;
          case "*":
            operacao = numero1 * numero2;
            break;
          case "/":
            operacao = numero1 / numero2;
            break;
          defaut: 
            System.out.println("Operador inválido");
            valida = false;
        }
        
        System.out.println("Resultado: " + operacao);
        
        if(valida){
            if(operacao % 2 == 0){
                  System.out.println("O número resultante é par!")
            }else{
                  System.out.println("O número resultante é impar")
            }

            if(operacao >= 0){
                System.out.println("O número resultante é positivo!")
            }else{
              System.out.println("O número resultante é negativo!")
            }
        }
    }
}




