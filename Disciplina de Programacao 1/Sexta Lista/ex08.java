/*
Escreva um algoritmo que leia um vetor G de 10
posições do tipo caracter, que representa o gabarito de
uma prova. A seguir, para cada um dos 20 alunos da
turma, leia o vetor de respostas (R) do aluno de 10
posições do tipo caracter e conte o número de acertos.
Mostre o no de acertos do aluno e uma mensagem
APROVADO, se a nota for maior ou igual a 6; e mostre
uma mensagem de REPROVADO, caso contrário.
*/
public class ex08{
  public statc vod main(String[] args){
    int gabarito[], respostas[], i, j, acertos;
    gabarito[] = new Int[10];
    respostas[] = new Int[10];
    
    for(i=0; i<10; i++){
      gabarito[i] = Input.readInt("Exercíco " + (i+1));
    }
    
    for(j=0;j<=20;j++){
      respostas[j] = Input.readInt("Resposta: ");

      if(gabarito[j] == respostas[j]){
        acertos++;
      }
    }

    if(acertos >= 6){
      APROVADO!!!
    }else{
      REPROVADO!!!
    }
    
  }
}
