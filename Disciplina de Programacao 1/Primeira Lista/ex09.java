public class ex09{

    public static void main(String[] args){

        double lucro;

        double pao = Input.readDouble("Pães vendidos: ");
        double leite = Input.readDouble("Leite vendidos: ");
        double bolo = Input.readDouble("Bolos vendidos: ");
        
        lucro = ((0.15 * pao) - (0.9 * pao)) + ((1 * leite) - (0.70 * leite)) + ((5 * bolo) + (3 * bolo));
        
        System.out.println("Lucro das vendas no dia: " + lucro);
    }
}
