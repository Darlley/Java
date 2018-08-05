public clas ex18{
  public static void main(Strin[] args){
  
  double quantidadeKw = Input.readDouble("Informe a quantidade da energia elétrica em Kw consumidos: ");
  double valorKw = Input.readDouble("Informe o valor cobrado por Kw: ");
  double valorTaxa = Input.readDouble("Informe o valor da taxa: ");
  
  valorTaxa = (quantidadeKw * valorKw) + valorTaxa;
  
  System.out.print("O valor a pagar é de R$" + valorTaxa);
  }
}
