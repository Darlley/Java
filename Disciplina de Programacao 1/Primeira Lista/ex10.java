public class ex10{

    public static void main(String[] args){

        double alcool = Input.readDouble("Quantos (R$) ira abastecer em alcool: ");
        double gasolina = Input.readDouble("Quantos (R$) ira abastecer em gasolina: ");
        
        valorA = (alcool/1.60); 
        valorB = (gasolina/2.50);
        
        double valorA = valorA*8;
        double valorA = valorB*11;
        
        System.out.println("O veículo percorrerá " + valorA + " quilômetros com gasolina ou " + valorB + " quilômetros com álcool.);
    }
}
