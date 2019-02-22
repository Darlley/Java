/* Dada uma matriz P, de tamanho n x m, faça um método que:
a) Some os quadrados dos elementos da primeira coluna;
b) Some os elementos da segunda linha;
c) Some os elementos da diagonal principal (em caso de quadrada);
d) Some todos os elementos;
e) Some os elementos de índice ímpar da segunda linha
Todos esses retornos devem estar em um vetor de resposta a ser impresso na
main. */

public class Exemplo {
    public static void imprimeMatriz(int m[][]) {
        for(int i=0; i<m.length; i++){
            for(int j=0; j<m.length; j++){
                m[i][j] = Input.readInt("Informe um valor para a coluna "+j+" da linha "+i+": ");
            }
        }
    }
    public static void calculaMatriz(int m[][]){
        int somaB = 0;
        int somaD = 0;
        int somaE = 0;
        
        for(int i=0; i<m.length; i++){
            for(int j=0; i<m.length; i++){
                // a) Some os quadrados dos elementos da primeira coluna;
                if(j==0){
                    m[i][j] = m[i][j] * m[i][j]; 
                }
                
                // b) Some os elementos da segunda linha;
                if(i==1){
                    somaB += m[i][j];
                }
                
                // c) Some os elementos da diagonal principal (em caso de quadrada);
                /* if(m[][].length == m[][].length && i==j){
                    soma += m[i][j];
                } */
                
                // d) Some todos os elementos;
                somaD += m[i][j];
                
                // e) Some os elementos de índice ímpar da segunda linha
                if((i==1) && (j%2 != 0)){
                    somaE += m[i][j];
                }
                
            }
        }
    }
    public static void main(String[] args) {
        int[][] p;
        int n;
        int m;
        n = Input.readInt("Qual o tamanho de linhas: ");
        m = Input.readInt("Qual o tamanho de colunas: ");
        p = new int[n][m];
        
        imprimeMatriz(p);
        calculaMatriz(p);
        
        
    }
}
