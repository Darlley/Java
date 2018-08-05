public clas ex17{
  public static void main(Strin[] args){
  
  double valor = Input.readDouble("Informe o valor que quer converter: ");
  double preco = Input.readDouble("Informe o valor atual do dólar: ");
  
  valor = valor * preco;
  
  System.out.print("O valor convertido é R$" + valor);
  }
}
