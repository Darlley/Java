public class ex03{
    public static void main(String[] args){
    
    int num, cod;
    double qtd = 0, residencial = 0, comercial = 0, industrial = 0;
    
    while(cod != 0){
    
      num = Input.readInt("Informe o número do consumidor: ");
      qtd = Input.readInt("Informe a quantidade de kWh consumidos no mês: ");
      cod = Input.readInt("Informe o código do consumidor: ");

      switch(cod){
        case 1:
          qtd = (qtd * 0.3);
          residencial += qtd;
          break;
        case 2:
          qtd = (qtd * 0.5);
          comercial += qtd;
          break;
        case 3:
          qtd = (qtd * 0.7);
          industrial += qtd;
          break;
        default:
          System.out.print("Código inválido!");
      }
      
      System.out.print("O custo total para " + num + ": R$" + qtd + "\n");
      System.out.print("   =========\n");
    }
    
    System.out.print("1. TOTAL CUSTO RESIDENCIAL: " + residencial);
    System.out.print("2. TOTAL CUSTO COMERCIAL: " + comercial);
    System.out.print("3. TOTAL CUSTO INDUSTRIAL: " + industrial);
    System.out.print("MÉDIA DE CONSUMO ENTRE 1 E 2: " + (residencial + comercial)/2);
    
  }
}
