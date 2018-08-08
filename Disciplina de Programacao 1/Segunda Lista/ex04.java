public class ex04{
  public static void main(String[] args){
    double horas = Input.readDouble("Informe as horas trabalhadas: ");
    double valorH = Input.readDouble("Informe o valor da hora: ");
    valorH += (valorH*horas);
    if(valorH < 1.903){
      System.out.print("Isento de impostos!");
    }else if(valorH >= 1.903 && valorH < 2.826){
      valorH -= ((valorH/100) * 7.5);
    }else if(valorH >= 2.826 && valorH < 3.751){	
      valorH -= ((valorH/100) * 15);
    }else if(valorH >= 3.751 && valorH < 4.664){
      valorH -= ((valorH/100) * 22.5);
    }else{
      valorH -= ((valorH/100) * 27.5);
    }

    System.out.print("Valor dos impostos: " + valorH);
  }
}
