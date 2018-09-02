public class ex05{
  public static void main(String[] args){
  
    int matricula, frequencia, aprovado, reprovado, reprovadoB;
    double nota1 = 0, nota2 = 0, nota3 = 0, notaFinal = 0, maior = 0, menor = 0;
    String situacao;
    
    for(int i = 0; i < 5; i++){ 
      matricula = Input.readInt("\nInforme o número da matrícula do aluno: ");
      frequencia = Input.readInt("Informe a quantidade de aulas frequêntadas pelo aluno: ");
      nota1 = Input.readDouble("Informe a nota 1: ");
      nota2 = Input.readDouble("Informe a nota 2: ");
      nota3 = Input.readDouble("Informe a nota 3: ");
      notaFinal = (nota1 + nota2 + nota3)/3;

      if(notaFinal >= 5 && frequencia >= 40){
        situacao = "APROVADO!"
        aprovado++;
        
      }else if(frequencia < 40){
        situacao  = "REPROVADO!"
        reprovado++;
        reprovadoB++;
      }else{
        situacao  = "REPROVADO!"
        reprovado++;
      }
      
      if(nota1 > nota2 && nota1 > nota3){
        maior = nota1;
        if(nota2 > nota3){
          menor = nota3;
        }else{
          menor = nota2;
        }
      }else if(nota1 < nota2 && nota2 > nota3){
        maior = nota2;
        if(nota1 > nota3){
          menor = nota3;
        }else{
          menor = nota1;
        }
      else{
        maior = nota3
        if(nota2 > nota1){
          menor = nota1;
        }else{
          menor = nota2;
        }
      }
      
      System.out.print("Aluno " + matricula + " teve a média de " + notaFinal + " e esta " + situacao + "\n");
    }
    System.out.print("A maior nota é " + maior + "! \nA menor nota é " + menor);
    System.out.print("Total de alunos reprovados: " + reprovados);
    System.out.print("Percentagem de alunos reprovados por freqüência abaixo da mínima necessária: " + ((5/100)*reprovadosB));
    
  }
}
