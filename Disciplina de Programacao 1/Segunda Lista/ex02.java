public class ex02{
  public static void main(String[] args){
    double lado1 = Input.readInt("Informe o lado 1: ");
    double lado2 = Input.readInt("Informe o lado 2: ");
    double lado3 = Input.readInt("Informe o lado 3: ");

    if(lado1 == lado2 && lado2 == lado3){
      System.out.println("Equilátero!");
    }else if(lado1 == lado2 || lado2 == lado3){
      System.out.println("Isósceles!");
    }else{
      System.out.println("Escaleno!");
    }
  }
}
