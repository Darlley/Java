public class ex01{
  public static void main(String[] args){
    double total = 0, dias = 0; 
    int i = 1;
    
    while(i == 1){
      dias = Input.readDouble("Informe quantos dias o cliente ficou hospedado: ");
      
      if(dias < 10){
        dias = (50 * dias) + 15;
      }else{
        dias = (50 * dias) + 8;
      }
      
      total += dias;
      System.out.print("A conta do cliente deu: R$" + dias + "\n= = = = = = = = = = = = =\n");
      i = Input.readDouble("Deseja consultar o valor de outro cliente? [1]Sim [0]Não");
    }  
    System.out.print("O VALOR TOTAL É DE R$" + total;);
    
  }
}
