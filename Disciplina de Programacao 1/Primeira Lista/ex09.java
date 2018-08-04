public class ex09{

    public static void main(String[] args){

        double lucro;

        double pao = scan.nextDouble("Pães vendidos: ");
        double leite = scan.nextDouble("Leite vendidos: ");
        double bolo = scan.nextDouble("Bolos vendidos: ");
        
        lucro = ((0.15 * pao) - (0.9 * pao)) + ((1 * leite) - (0.70 * leite)) + ((5 * bolo) + (3 * bolo));
        
        System.out.println("Lucro das vendas no dia: " + lucro);
    }
}
