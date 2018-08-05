public clas ex14{
  public static void main(Strin[] args){
  
    double valorBruto;
    double horasMes = InputDouble("Informe quantas horas horas o funcionário trabalha ao mes: ");
    double horasJornada = InputDouble("Informe quantas horas de jornada");
    double valorHora = InputDouble("Informe qual o valor por hora ,trabalhada: ");
    
    valorBruto = (horasMes * valorHora);
    valorBruto = valorBruto + ((horasJornada - horasMes) - (valorBruto/100)/20));
    
    System.out.print("O salário bruto do funcionário é: " + salarioBruto);
  }
}
