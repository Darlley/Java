public class ex02{
  public static void main(String[] args){
    int otimo = 0, bom = 0, regular = 0;

    System.out.print("INDICE:\n3 - ótimo,\n2 - bom,\n1 - Regular\n");

    for(int i = 1; i <= 15; i++){
      int idade = Input.readInt("\nInforme sua idade: ");
      int opcao = Input.readInt("O que achou do filme: ");

      switch(opcao){
        case 3:
          otimo += idade;
          break;
        case 2:
          bom++;
          break;
         case 1:
          regular++;
          break;
         default:
          System.out.print("ERRO!");
      }
    }
    
    System.out.print("\nMédia de 'ótimos': " + (otimo/15));
    System.out.print("\nQuantidade de pessoas que responderam 'regular': " + regular);
    System.out.print("\nPorcentagem de pessoas que responderam 'bom': " + ((15/100)*bom));
    
  }
}
