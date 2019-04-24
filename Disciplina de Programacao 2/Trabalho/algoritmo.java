public class Jogo {
    /*public void restaUm(int u, int[][] tabela){
        int aux;
        //1
        for(int i=0;i<36;i++){
            for(int j=0;j<36;j++){       
                if(i==5 && j==3){
                    aux = tabela[3][3];
                    tabela[3][3] = tabela[5][3];
                    tabela[5][3] = aux;
                }
            }
        }
        //2
        for(int i=0;i<36;i++){
            for(int j=0;j<36;j++){       
                if(i==4 && j==3){
                    aux = tabela[4][3];
                    tabela[4][1] = tabela[4][3];
                    tabela[4][3] = aux;
                }
            }
        }
    }*/
    public static void main(String[] args) {
        String aux; //temporario
        // DECLARAÇÕES
        String tabela[][];
        tabela = new String[7][7];
        int numQTD;
        String center;
        
        // ENTRADA DE DADOS
        //numQTD = Input.readInt("Número final de peças: ");
        //center = Input.readString("A ultima peça deve estar [1]-centralizada ou [2]-não centralizada? ");
        
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
        System.out.println("");

        // 1
        System.out.println("👇 PRIMEIRO PASSO");
        System.out.println("");
        for(int i=0;i<7;i++){
            for(int j=0;j<7;j++){       
                if(i==5 && j==3){
                    aux = tabela[3][3];
                    tabela[3][3] = tabela[5][3];
                    tabela[4][3] = aux;
                    tabela[5][3] = aux;
                }
            }
        }
        for(int i=0; i<7; i++){ // MOSTRAR TABELA
            for(int j=0; j<7; j++){
                if(j < 6){
                    System.out.print("|" + tabela[i][j]);
                }else{
                    System.out.println("|" + tabela[i][j] + "|");
                }
            }
        }
        System.out.println("");

        //2
        System.out.println("👇 SEGUNDO PASSO");
        System.out.println("");
        for(int i=0;i<7;i++){
            for(int j=0;j<7;j++){       
                if(i==4 && j==3){
                    aux = tabela[4][3];
                    tabela[4][3] = tabela[4][1];
                    tabela[4][1] = aux;
                    tabela[4][2] = aux;

                }
            }
        }
        for(int i=0; i<7; i++){ // MOSTRAR TABELA
            for(int j=0; j<7; j++){
                if(j < 6){
                    System.out.print("|" + tabela[i][j]);
                }else{
                    System.out.println("|" + tabela[i][j] + "|");
                }
            }
        }
        System.out.println("");
        
        // 3
        System.out.println("👇 TERCEIRO PASSO");
        System.out.println("");
        for(int i=0;i<7;i++){
            for(int j=0;j<7;j++){       
                if(i==5 && j==3){
                    aux = tabela[i][j];
                    tabela[i][j] = tabela[3][3];
                    tabela[4][3] = aux;
                    tabela[3][3] = aux;
                }
            }
        }
        for(int i=0; i<7; i++){ // MOSTRAR TABELA
            for(int j=0; j<7; j++){
                if(j < 6){
                    System.out.print("|" + tabela[i][j]);
                }else{
                    System.out.println("|" + tabela[i][j] + "|");
                }
            }
        }
        System.out.println("");
        
        // 4
        System.out.println("👇 QUARTO PASSO");
        System.out.println("");
        for(int i=0;i<7;i++){
            for(int j=0;j<7;j++){       
                if(i==4 && j==2){
                    aux = tabela[i][j];
                    tabela[i][j] = tabela[6][2];
                    tabela[5][2] = aux;
                    tabela[6][2] = aux;
                }
            }
        }
        for(int i=0; i<7; i++){ // MOSTRAR TABELA
            for(int j=0; j<7; j++){
                if(j < 6){
                    System.out.print("|" + tabela[i][j]);
                }else{
                    System.out.println("|" + tabela[i][j] + "|");
                }
            }
        }
        System.out.println("");
        
        // 5
        System.out.println("👇 QUINTO PASSO");
        System.out.println("");
        for(int i=0;i<7;i++){
            for(int j=0;j<7;j++){       
                if(i==6 && j==2){
                    aux = tabela[i][j];
                    tabela[i][j] = tabela[6][4];
                    tabela[6][3] = aux;
                    tabela[6][4] = aux;
                }
            }
        }
        for(int i=0; i<7; i++){ // MOSTRAR TABELA
            for(int j=0; j<7; j++){
                if(j < 6){
                    System.out.print("|" + tabela[i][j]);
                }else{
                    System.out.println("|" + tabela[i][j] + "|");
                }
            }
        }
        System.out.println("");
        
        // 6
        System.out.println("👇 SEXTO PASSO");
        System.out.println("");
        for(int i=0;i<7;i++){
            for(int j=0;j<7;j++){       
                if(i==5 && j==2){
                    aux = tabela[i][j];
                    tabela[i][j] = tabela[3][2];
                    tabela[3][2] = aux;
                    tabela[4][2] = aux;
                }
            }
        }
        for(int i=0; i<7; i++){ // MOSTRAR TABELA
            for(int j=0; j<7; j++){
                if(j < 6){
                    System.out.print("|" + tabela[i][j]);
                }else{
                    System.out.println("|" + tabela[i][j] + "|");
                }
            }
        }
        System.out.println("");
        
        // 7
        System.out.println("👇 SÉTIMO PASSO");
        System.out.println("");
        for(int i=0;i<7;i++){
            for(int j=0;j<7;j++){       
                if(i==4 && j==2){
                    aux = tabela[i][j];
                    tabela[i][j] = tabela[6][2];
                    tabela[6][2] = aux;
                    tabela[5][2] = aux;
                }
            }
        }
        for(int i=0; i<7; i++){ // MOSTRAR TABELA
            for(int j=0; j<7; j++){
                if(j < 6){
                    System.out.print("|" + tabela[i][j]);
                }else{
                    System.out.println("|" + tabela[i][j] + "|");
                }
            }
        }
        System.out.println("");
        
        // 8
        System.out.println("👇 OITAVO PASSO");
        System.out.println("");
        for(int i=0;i<7;i++){
            for(int j=0;j<7;j++){       
                if(i==6 && j==4){
                    aux = tabela[i][j];
                    tabela[i][j] = tabela[4][4];
                    tabela[4][4] = aux;
                    tabela[5][4] = aux;
                }
            }
        }
        for(int i=0; i<7; i++){ // MOSTRAR TABELA
            for(int j=0; j<7; j++){
                if(j < 6){
                    System.out.print("|" + tabela[i][j]);
                }else{
                    System.out.println("|" + tabela[i][j] + "|");
                }
            }
        }
        System.out.println("");
        
        // 9
        System.out.println("👇 NONO PASSO");
        System.out.println("");
        for(int i=0;i<7;i++){
            for(int j=0;j<7;j++){       
                if(i==4 && j==4){
                    aux = tabela[i][j];
                    tabela[i][j] = tabela[4][6];
                    tabela[4][6] = aux;
                    tabela[4][5] = aux;
                }
            }
        }
        for(int i=0; i<7; i++){ // MOSTRAR TABELA
            for(int j=0; j<7; j++){
                if(j < 6){
                    System.out.print("|" + tabela[i][j]);
                }else{
                    System.out.println("|" + tabela[i][j] + "|");
                }
            }
        }
        System.out.println("");
        
        // 10
        System.out.println("👇 DÉCIMO PASSO");
        System.out.println("");
        for(int i=0;i<7;i++){
            for(int j=0;j<7;j++){       
                if(i==5 && j==4){
                    aux = tabela[i][j];
                    tabela[i][j] = tabela[3][4];
                    tabela[3][4] = aux;
                    tabela[4][4] = aux;
                }
            }
        }
        for(int i=0; i<7; i++){ // MOSTRAR TABELA
            for(int j=0; j<7; j++){
                if(j < 6){
                    System.out.print("|" + tabela[i][j]);
                }else{
                    System.out.println("|" + tabela[i][j] + "|");
                }
            }
        }
        System.out.println("");
        
        // 11
        System.out.println("👇 DÉCIMO PRIMEIRO PASSO");
        System.out.println("");
        for(int i=0;i<7;i++){
            for(int j=0;j<7;j++){       
                if(i==6 && j==4){
                    aux = tabela[i][j];
                    tabela[i][j] = tabela[4][4];
                    tabela[4][4] = aux;
                    tabela[5][4] = aux;
                }
            }
        }
        for(int i=0; i<7; i++){ // MOSTRAR TABELA
            for(int j=0; j<7; j++){
                if(j < 6){
                    System.out.print("|" + tabela[i][j]);
                }else{
                    System.out.println("|" + tabela[i][j] + "|");
                }
            }
        }
    }
}
