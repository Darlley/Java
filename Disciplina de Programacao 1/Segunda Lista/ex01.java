public class ex01{
  public static void main(String[] args){
	int tempoA = Input.readInt("Quanto tempo o funcionário A trabalha na empresa? ");
	double salarioA = Input.readDouble("Qual o salário do funcionáro? ");
	
	int tempoB = Input.readInt("Quanto tempo o funcionário B trabalha na empresa? ");
	double salarioB = Input.readDouble("Qual o salário do funcionáro? ");
	
	int tempoC = Input.readInt("Quanto tempo o funcionário C trabalha na empresa? ");
	double salarioC = Input.readDouble("Qual o salário do funcionáro? ");
	
	if(tempoA > 5){
		salarioA += (salarioA/100)*20;
	}else if(tempoB > 5){
		salarioB += (salarioB/100)*20;
	}else if(tempoC > 5){
		salarioC += (salarioC/100)*20;
	}
	
	salarioA += salarioB + salarioC;
	
	System.out.println(salarioA);
  }
}
