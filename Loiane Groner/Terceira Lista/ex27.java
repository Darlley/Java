import java.util.Scanner;

public class ex17{

    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);
        
        double temp;
        double soma = 0;
        double menor = Double.MAX_VALUE;
        double maior = Double.MIN_VALUE;
        
        System.out.println("Quantas temperaturas: ");
        int qtdTemperatura = scan.nextInt();
        
        for(int i=1; i<=qtdTemperaturas; i++){
          System.out.println("Informe a temperatura " + i + ": ");
          temp = scan.nextDouble();
          
          soma += temp;
          
          if(temp > maior){
            maior = temp;
          }
          
          if(temp < menor){
            menor = temp;
          }

        }
        System.out.println("Média: " + (soma/qtdTemperatura));
        System.out.println("Menor temperatura: " + menor);
        System.out.println("Maior temperatura: " + maior);
    }
}
