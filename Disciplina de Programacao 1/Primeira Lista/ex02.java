public class ex02{
	public static void main(String args[]){
	
		int horas;
		int minutos;
		int segundos;
		int totalSegundos;
		
		horas = Input.readInt("Informe as horas: ");
		minutos = Input.readInt("Informe os minutos: ");
		segundos = Input.readInt("Informe os segundos: ");
	
		totalSegundos = (horas * 60) * 60;
		totalSegundos = totalSegundos + (minutos * 60);
		totalSegundos = totalSegundos + segundos;
		
		System.out.println(horas + ":" + minutos + ":" + segundos + " tem " + totalSegundos + " segundos.");		
		
	}		
