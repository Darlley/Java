public class ex08{

    public static void main(String[] args){

        double area;

        double largura = Input.readDouble("Informe a largura do retângulo: ");
        double altura = Input.readDouble("Informea a altura do retângulo: ");
        
        area = largura * altura;
        
        System.out.println("O retângulo tem uma área de " + area + "M.");
    }
}
