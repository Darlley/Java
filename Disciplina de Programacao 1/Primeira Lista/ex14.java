public clas ex14{
  public static void main(Strin[] args){
  
    double valorBruto;
    double horasMes = Input.readDouble("Informe quantas horas horas o funcionário trabalha ao mes: ");
    double horasJornada = Input.readDouble("Informe quantas horas de jornada");
    double valorHora = Input.readDouble("Informe qual o valor por hora ,trabalhada: ");
    
    valorBruto = (horasJornada * valorHora);
    valorBruto = valorBruto + ((horasJornada - horasMes) - (valorBruto/100)/20));
    
    System.out.print("O salário bruto do funcionário é: " + salarioBruto);
  }
}
