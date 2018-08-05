public clas ex16{
  public static void main(Strin[] args){
  
    double debito = Input.readDouble("Informe o valor do débito do cliente: ");
    double valorMulta = Input.readDouble("Informe a porcentagem de multa: ");
    double valorJuros = Input.readDouble("Informe o valor da porcentagem de juros mensais: ");
    double dias = Input.readDouble("Informe o numero de dias do atraso: ");
    
    debito = debito + ((dias - 30) * valorJuros) + ((debito/100)*valorMulta);
    
    System.out.print("O débito total a pagar do cliente é R$" + debito);
  }
}
