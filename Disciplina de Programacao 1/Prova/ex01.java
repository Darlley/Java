/*Uma empresa decidiu fazer um levantamento em relação aos
candidatos que se apresentarem para preenchimento de vagas no
seu quadro de funcionários. Supondo que você seja o programador
dessa empresa, faça um programa que leia para cada candidato a
idade, o sexo (M ou F) e a experiência no serviço (S ou N). Para
encerrar a entrada de dados, digite S para sair. Implemente os
seguintes relatórios:

a) número de candidatos do sexo feminino (0,5);
b) número de candidatos do sexo masculino (0,5);
c) a idade média dos homens que já têm experiência no serviço (1,0);
d) número de mulheres com idade inferior a 35 anos e com
experiência no serviço (1,0);
e) a porcentagem dos homens com mais de 45 anos entre o total dos
homens (1,5);
f) a menor idade entre as mulheres que já têm experiência no serviço
*/

public class ex01{
	public static void main(String[] args){
	
		char sexo = 'f', experiencia = 's', fim = 'n';
		int idade=0, idadeE=0, a=0, b=0, c=0, d=0, e=0, maior=0, menor=0;

		while(fim != 's'){
			
			//ENTRADA DE DADOS
			idade = Input.readInt("Idade: ");
			sexo = Input.readChar("Sexo: ");
			experiencia = Input.readChar("Experiencia: ");
			
			// VERIFICAÇÕES
			// A) e B)
			if(sexo == 'f'){
				a++;
			}else{
				b++;
			}
			
			// C)
			if(experiencia == 's'){
				c += idade;
				idadeE++;
			}
			
			// D)
			if(sexo == 'f' && idade < 35 && experiencia == 's'){
				d++;
			}
			
			// E)
			if(sexo == 'm' && idade > 45){
				e++;
			}
			
			// F)
			if(sexo == 'f' && experiencia == 's'){
				if(idade > maior && idade > menor){
					maior = idade;
				}else{
					menor = idade;
				}
			}
			
			// FIM
			fim = Input.readChar("Deseja sair? \nSIM - s | NAO - n\n");
		}
		
		System.out.println("A) Número de candidatos do sexo feminino: " + a);
		System.out.println("B) Número de candidatos do sexo masculino: " + b);
		System.out.println("C) A idade média dos homens que já têm experiência no serviço: " + (c/idadeE));
		System.out.println("D) Número de mulheres com idade inferior a 35 anos e com experiência no serviço: " + d);
		System.out.println("E) A porcentagem dos homens com mais de 45 anos entre o total dos homens: " + (100/e)*b);
		System.out.println("F) A menor idade entre as mulheres que já têm experiência no serviço: " + menor);
	}
}
