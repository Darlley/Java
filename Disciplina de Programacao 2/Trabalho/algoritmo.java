public class Jogo {
    public static void main(String[] args) {
        // DECLARAÇÕES
        String tabela[][];
        tabela = new String[7][7];
        int numQTD;
        String center;
        
        // ENTRADA DE DADOS
        numQTD = Input.readInt("Número final de peças: ");
        center = Input.readString("A ultima peça deve estar [1]-centralizada ou [2]-não centralizada? ");
        
        /* ******************************
                    C R I A R
                    T A B E L A
           ****************************** */
        
        // COLUNA 1
        tabela[0][0] = "-";
        tabela[0][1] = "-";
        tabela[0][2] = "•";
        tabela[0][3] = "•";
        tabela[0][4] = "•";
        tabela[0][5] = "-";
        tabela[0][6] = "-";
        
        // COLUNA 2
        tabela[1][0] = "-";
        tabela[1][1] = "-";
        tabela[1][2] = "•";
        tabela[1][3] = "•";
        tabela[1][4] = "•";
        tabela[1][5] = "-";
        tabela[1][6] = "-";
        
        // COLUNA 3
        tabela[2][0] = "•";
        tabela[2][1] = "•";
        tabela[2][2] = "•";
        tabela[2][3] = "•";
        tabela[2][4] = "•";
        tabela[2][5] = "•";
        tabela[2][6] = "•";
        
        // COLUNA 4
        tabela[3][0] = "•";
        tabela[3][1] = "•";
        tabela[3][2] = "•";
        tabela[3][3] = " ";
        tabela[3][4] = "•";
        tabela[3][5] = "•";
        tabela[3][6] = "•";
        
        // COLUNA 5
        tabela[4][0] = "•";
        tabela[4][1] = "•";
        tabela[4][2] = "•";
        tabela[4][3] = "•";
        tabela[4][4] = "•";
        tabela[4][5] = "•";
        tabela[4][6] = "•";
        
        // COLUNA 6
        tabela[5][0] = "-";
        tabela[5][1] = "-";
        tabela[5][2] = "•";
        tabela[5][3] = "•";
        tabela[5][4] = "•";
        tabela[5][5] = "-";
        tabela[5][6] = "-";
        
        // COLUNA 7
        tabela[6][0] = "-";
        tabela[6][1] = "-";
        tabela[6][2] = "•";
        tabela[6][3] = "•";
        tabela[6][4] = "•";
        tabela[6][5] = "-";
        tabela[6][6] = "-";
        
        
        // MOSTRAR TABELA
        for(int i=0; i<7; i++){
            for(int j=0; j<7; j++){
                if(j < 6){
                    System.out.print("|" + tabela[i][j]);
                }else{
                    System.out.println("|" + tabela[i][j] + "|");
                }
            }
        }
        
        // ******************************
        
    }
}
