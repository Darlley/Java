public class ex05{

    public static void main(String[] args){

        double cobre;
        double zinco;
        double qtd = Input.readDouble("Qual a quantida de latão você  quer: ");

        cobre = (qtd/100) * 70;
        zinco = (qtd/100) * 30;

        System.out.println("Para " + qtd + "M² de latão, você preisará de: " + cobre + "M de cobre, e " + zinco + "M de zinco.");
    }
}
