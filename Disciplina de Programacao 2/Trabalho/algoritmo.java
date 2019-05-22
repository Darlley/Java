public class Jogo {
    public int qtdFinal;
    public int centralizar;
    public int total = 32;
    String tabela[][];
    
    // C O N S T R U T O R
    public Jogo(){
        // ENTRADA DE DADOS
        qtdFinal = Input.readInt("Número final de peças: ");
        centralizar = Input.readInt("A ultima peça deve estar [1]-centralizada ou [2]-não centralizada? ");
        System.out.println("");
    }
    
    // C R I A R  T A B U L E I R O  D O  J O G O
    public void criarTabela(){
        tabela = new String[7][7];
        
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
        
        mostrarTabela();
    }
    
    // M O S T R A R  T A B E L A  D O  J O G O
    public void mostrarTabela(){

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
    }
    
    // L Ó G I C A  D O  J O G O 
    public void jogarPartida(){
        String aux;
        
        if(qtdFinal == 1){
        //while(qtdFinal != total){
            
            /*for(int i=0;i<7;i++){
                for(int j=0;j<7;j++){       
                    if(" ".equals(tabela[i][j])){
                        aux = tabela[i][j];
                        tabela[i][j] = tabela[i--][j];
                        tabela[i-1][j] = aux;
                        tabela[i-2][j] = aux;
                    }
                    total--;
                    mostrarTabela();
                }
                if(" ".equals(tabela[i][i])){
                        aux = tabela[i][i];
                        tabela[i][i] = tabela[i][i++];
                        tabela[i][i+1] = aux;
                        tabela[i][i+2] = aux;
                }
                total--;
             */
            
                
            // 1
                System.out.println("👇 PRIMEIRO PASSO\n");
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
                mostrarTabela();	
                System.out.println("RESTAM 35 PEÇAS");	
                
                //2	
                System.out.println("\n👇 SEGUNDO PASSO\n");	
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
                mostrarTabela();
                System.out.println("RESTAM 34 PEÇAS");	

                //3	
                System.out.println("\n👇 TERCEIRO PASSO\n");	
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
                mostrarTabela();
                System.out.println("RESTAM 33 PEÇAS");	

                //4
                System.out.println("\n👇 QUARTO PASSO\n");	
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
                mostrarTabela();
                System.out.println("RESTAM 32 PEÇAS");
                
                //5
                System.out.println("\n👇 QUINTO PASSO\n");	
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
                mostrarTabela();
                System.out.println("RESTAM 31 PEÇAS");
                
                //6
                System.out.println("\n👇 SEXTO PASSO\n");	
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
                mostrarTabela();
                System.out.println("RESTAM 30 PEÇAS");
                
                //7
                System.out.println("\n👇 SÉTIMO PASSO\n");	
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
                mostrarTabela();
                System.out.println("RESTAM 29 PEÇAS");
                
                //8
                System.out.println("\n👇 OITAVO PASSO\n");	
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
                mostrarTabela();
                System.out.println("RESTAM 28 PEÇAS");
                /*
                //9
                System.out.println("\n👇 NONO PASSO\n");	
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
                mostrarTabela();
                System.out.println("RESTAM 27 PEÇAS");
                
                //10
                System.out.println("\n👇 DÉCIMO PASSO\n");	
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
                mostrarTabela();
                System.out.println("RESTAM 26 PEÇAS");
                
                //11
                System.out.println("\n👇 DÉCIMO PRIMEIRO PASSO\n");	
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
                mostrarTabela();
                System.out.println("RESTAM 25 PEÇAS");
                
                //12
                System.out.println("\n👇 DÉCIMO SEGUNDO PASSO\n");	
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
                mostrarTabela();
                System.out.println("RESTAM 24 PEÇAS");
                
                //13
                System.out.println("\n👇 DÉCIMO TERCEIRO PASSO\n");	
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
                mostrarTabela();
                System.out.println("RESTAM 23 PEÇAS");
                
                //14
                System.out.println("\n👇 DÉCIMO QUARTO PASSO\n");	
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
                mostrarTabela();
                System.out.println("RESTAM 22 PEÇAS");
                
                //15
                System.out.println("\n👇 DÉCIMO QUINTO PASSO\n");	
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
                mostrarTabela();
                System.out.println("RESTAM 21 PEÇAS");
                */
               
            }
        } //Continuar se a quantidade total de peças for diferente do de preças final (informada pelo usuario no menu)
    
    
    public static void main(String[] args) {
        
        //declaração
        int escolha = 1;
        
        //Implementação loop para menu
        while(escolha == 1){
            
            //Menu perguntas
            System.out.println("==== MENU ====");
            escolha = Input.readInt("1- Jogar\n2- Sair\nEscolha: ");
            
            //tratamento de resposta do usuário
            switch(escolha){
                case 1: 
                    Jogo partida;
                    partida = new Jogo();
                    
                    System.out.println("BEM VINNDO❗❗❗\n👇 JOGO INICIALIZADO 👇\n\n");
                    
                    partida.criarTabela();
                    partida.jogarPartida();
                    
                    break;
                case 2:
                    System.out.println("Saindo...");
            }
        }
    }
}
