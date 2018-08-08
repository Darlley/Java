public class ex01{
  public static void main(String[] args){
	
    System.out.print("1) Calcular a área de um Círculo;\n");
    System.out.print("2) Calcular a área de um Triângulo;\n");
    System.out.print("3) Calcular a área de um Quadrado;\n");
    System.out.print("4) Calcular a área de um Retângulo;\n");

    int select = Input.readInt("Escolha: ");

    if(select == 1){
      System.out.print("Você escolheu a opção 1!\n");
      double raio = Input.readDouble("Informe o raio do circulo: ");
      raio = 3.14 * raio;
      System.out.print("A área do circulo é: " + raio);
    }else if(select == 2){
      System.out.print("Você escolheu a opção 2!\n");
      double base = Input.readDouble("Informe a base do triângulo: ");
      double altura = Input.readDouble("Informe a altura do triângulo: ");
      base = (base * altura)/2;
      System.out.print("A área do triângulo é: " + base);
    }else if(select == 3){
      System.out.print("Você escolheu a opção 3!\n");
      double lado1 = Input.readDouble("Informe o lado 1 do quadrado: ");
      double lado2 = Input.readDouble("Informe o lado 2 do quadrado: ");
      lado1 = lado1 * lado2;
      System.out.print("A área do quadrado é: " + lado1);
    }else{
      System.out.print("Você escolheu a opção 4!\n");
      double base = Input.readDouble("Informe a base do retangulo: ");
      double altura = Input.readDouble("Informe a altura do retangulo: ");
      base = base * altura;
      System.out.print("A área do retangulo é: " + base);
    }
  }
}
