public class ex01{
	public static void main(String[] args){
	
		char sexo = 'f', experiencia = 's', fim = 'n';
		int idade=0, idadeE=0, a=0, b=0, c=0, d=0, e=0, maior=0, menor=0, contador=1;
		
		while(fim != 's' && fim != 'S'){
			System.out.println("============= CANDIDATO " + contador + "=============");
			contador++;
			
			//ENTRADA DE DADOS
			idade = Input.readInt("Idade: ");
			sexo = Input.readChar("Sexo: ");
			experiencia = Input.readChar("Experiencia: ");
			
			// VERIFICAÇÕES
			// A) e B)
			if(sexo == 'f' || sexo == 'F'){
				a++;
			}else{
				b++;
			}
			
			// C)
			if(experiencia == 's' || experiencia == 'S'){
				c += idade;
				idadeE++;
			}
			
			// D)
			if((sexo == 'f' || sexo == 'F') && idade < 35 && (experiencia == 's' || experiencia == 'S')){
				d++;
			}
			
			// E)
			if((sexo == 'm' || sexo == 'M') && idade > 45){
				e++;
			}
			
			// F)
			if((sexo == 'f' || sexo == 'F') && (experiencia == 's' || experiencia == 'S')){
				if(idade > maior && idade > menor){
					maior = idade;
				}else{
					menor = idade;
				}
			}
			
			// FIM
			fim = Input.readChar("Deseja sair? \nSIM - s | NAO - n \n");
		}
		
		// GERAR RELATÓRIO
		System.out.println("\n============= RELATORIO =============");
		
		// SAIDA "A"
		System.out.println("A) Número de candidatos do sexo feminino: " + a);
		
		// SAIDA "B"
		System.out.println("B) Número de candidatos do sexo masculino: " + b);
		
		// SAIDA "C"
		if(idadeE>0){
			System.out.println("C) A idade média dos homens que já têm experiência no serviço: " + (c/idadeE));
		}else{
			System.out.println("C) A idade média dos homens que já têm experiência no serviço: " + 0);
		}
		
		// SAIDA "D"
		System.out.println("D) Número de mulheres com idade inferior a 35 anos e com experiência no serviço: " + d);
		
		// SAIDA "E"
		if(e>0){
			System.out.println("E) A porcentagem dos homens com mais de 45 anos entre o total dos homens: " + (((double)100/e)*b)); // SAIDA COM ERRO
		}else{
			System.out.println("E) A porcentagem dos homens com mais de 45 anos entre o total dos homens: " +0);
		}
		
		// SAIDA "F"
		System.out.println("F) A menor idade entre as mulheres que já têm experiência no serviço: " + menor);
	}
}
