/* Crie um programa para descrever restaurantes. O programa deve armazenar
o nome, o endereço, o preço médio e o tipo de comida.
a) Crie um método que inicialize os dados com zero e outro que inicialize os
dados com um valor fixo.
b) Crie um método para solicitar os dados para o usuário.
c) Crie uma função para imprimir os dados de um restaurante.
d) Escreva um programa com vários restaurantes e solicite a entrada dos
dados pelo usuário. Em seguida, o programa pergunta o tipo de comida ao
usuário (e o preço máximo que ele aceita gastar) e lista todos os restaurantes
que a oferecem. A lista de restaurantes deve ser apresentada de forma
completa, com nome, endereço e preço médio.*/
public class ex {
    public static void procurar (String c, double p) {
        String nome;
        String endereco;
        
        System.out.println("NOME");
        System.out.println("ENDEREÇO");
        System.out.println("PREÇO MÉDIO");
        
    }
    public static void main(String[] args) {
        
        String comida;
        double preco;
        
        comida = Input.readString("Informe o tipo de comida deseja ser oferecida: ");
        preco = Input.readInt("Informe o preço máximo do serviço: ");
        
        procurar(comida, preco);
        
    }
}
