public class ex07{

    public static void main(String[] args){

        double jose = 1.50;
        double pedro = 1.10;

        double ano = scan.nextDouble("Informe a quantidade de anos: ");
        
        jose += (2 *  ano);
        pedro += (3 * ano);
        
        System.out.println("Em " + ano + " anos...");
        System.out.println("José terá: " + jose + "cm.");
        System.out.println("Pedro terá: " + pedro + "cm.");
    }
}
