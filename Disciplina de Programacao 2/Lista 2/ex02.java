/* P R O B L E M A
Crie um programa para descrever restaurantes. O programa deve armazenar
o nome, o endereço, o preço médio e o tipo de comida.
a) Crie um método que inicialize os dados com zero e outro que inicialize os
dados com um valor fixo.
b) Crie um método para solicitar os dados para o usuário.
c) Crie uma função para imprimir os dados de um restaurante.
d) Escreva um programa com vários restaurantes e solicite a entrada dos
dados pelo usuário. Em seguida, o programa pergunta o tipo de comida ao
usuário (e o preço máximo que ele aceita gastar) e lista todos os restaurantes
que a oferecem. A lista de restaurantes deve ser apresentada de forma
completa, com nome, endereço e preço médio. 

I N I C I O */
public class ex02 {
    public static void incicializaRestaurantes(String nomes[], String enderecos[], String comida[], double precosMedios[], int numRest) {
        for(int i=0; i< numRest; i++){
            nomes[i] = "0";
            enderecos[i] = "0";
            comida[i] = "0";
            precosMedios[i] = 0.0;
        }
    }
    public static void imprimeRestaurantes(String nomes[], String enderecos[], String comida[], double precosMedios[], int numRest) {
        System.out.println("");
        System.out.println("RESTAURANTES");
        for(int i=0; i< numRest; i++){
            System.out.println("Restaurante " + (i+1) + " = " + nomes[i] + " " + enderecos[i] + " " + comida[i] + " " + precosMedios[i]);
        }
        System.out.println("");
    }
    public static void incicializaRestaurantesUsuario(String nomes[], String enderecos[], String comida[], double precosMedios[], int numRest){
        for(int i=0; i< numRest; i++){
            System.out.println("");
            nomes[i] = Input.readString("Informe o nome do restaurante " + (i+1) + ": ");
            enderecos[i] = Input.readString("Informe o endereço do restaurante " + (i+1) + ": ");
            comida[i] = Input.readString("Informe o tipo de comida do restaurante " + (i+1) + ": ");
            precosMedios[i] = Input.readDouble("Informe o preço médio do restaurante " + (i+1) + ": ");
        }
    }
    public static void main(String[] args) {
        String nomes[], enderecos[], comida[];
        double[] precosMedios;
        int numRest;
        
        numRest = Input.readInt("Informe a quantidade de restaurantes: ");
        nomes = new String[numRest];
        enderecos = new String[numRest];
        comida = new String[numRest];
        precosMedios = new double[numRest];
        
        incicializaRestaurantes(nomes, enderecos, comida, precosMedios, numRest);
        imprimeRestaurantes(nomes, enderecos, comida, precosMedios, numRest);
        
        incicializaRestaurantesUsuario(nomes, enderecos, comida, precosMedios, numRest);
        imprimeRestaurantes(nomes, enderecos, comida, precosMedios, numRest);
        
    }
}
