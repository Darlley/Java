public class ex04{
  public static void main(String[] args){
    int a, b, c, d;
    
    for(int i = 0; i < 20; i++){
      int idade = Input.readInt("Informe sua idade: ");
      double peso = Input.readDouble("Informe seu peso: ");
      double altura = Input.readDouble("Informe sua altura: ");
      String olhos = Input.readString("Informe a cor de seus olhos: ");
      String cabelo = Input.readString("Informe a cor de seus cabelos: ");
      
      if(idade > 50 && peso < 60){
        a++;
      }
      if(altura < 1.5){
        b++;
      }
      if(olhos == 1){
        c++;
      }
      if(cabelo == 4 && olhos != 1){
        d++;
      }
    }
    
    System.out.print("Quantidade de pessoas com idade superior a 50 anos e peso inferior a 60 quilos: " + a);
    System.out.print("Média das idades das pessoas com altura inferior a 1,5 metros: " + (20/b));
    System.out.print("Porcentagem de pessoas com olhos azuis: " + (20/100)*c);
    System.out.print("Quantidade de pessoas ruivas e que não possuem olhos azuis: " + d);
    
  }
}
