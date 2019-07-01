/* Escreva um programa completo para jogar o jogo da velha. 
Para tanto crie uma classe JogoDaVelha: 
✓ a classe deve conter como dados privados um array bidimensional 3x3 para representar a grade do jogo 
✓ crie uma enumeração para representar as possibilidades de ocupação de uma casa na grade (vazia, jogador 1 ou jogador 2) 
✓ o construtor deve inicializar a grade como vazia 
✓ forneça um método para exibir a grade 
✓ permita dois joga dores humanos 
✓ forneça um método para jogar o jogo; todo movimento deve ocorrer em uma casa vazia;
depois de cada movimento, 
X/✓ determine se houve uma derrota ou um empate. */

public class JogoDaVelha {
    Boolean vencedor = false;
    String tabela[][];
    
    
    public JogoDaVelha(){   
        tabela = new String[3][3];
        for (int i = 0; i < tabela.length; i++) {
            for (int j = 0; j < tabela.length; j++) {
                tabela[i][j] = " ";
                if(j < 2){
                    System.out.print("|" + tabela[i][j]);
                }else{
                    System.out.println("|" + tabela[i][j] + "|");
                }

            }
        }
    }
    public void mostrarTabela(){
        
        for (int i = 0; i < tabela.length; i++) {
            for (int j = 0; j < tabela.length; j++) {
                if(j < 2){
                    System.out.print("|" + tabela[i][j]);
                }else{
                    System.out.println("|" + tabela[i][j] + "|");
                }

            }
        }
    }
    
    public void jogar(){
        int x = 0, y = 0, jogador = 1, jogadas = 0;
        boolean vencedor = false, correto = false;
        String nome = "";
        
        while(vencedor == false && jogadas <= 9){
            System.out.println("VEZ DA JOGADA: JOGADOR " + jogador + "\n");
            x = Input.readInt("Linha: ");
            while(x<0 || x>2){
                x = Input.readInt("Preencha um índice de linha correto [0-2]: ");
            }

            y = Input.readInt("Coluna: ");
            while(y<0 || y>2){
                y = Input.readInt("Preencha um índice de coluna correto [0-2]: ");
            }                 
                
            // INCREMENTAR TABELA
            if (jogador == 1) {    
                if(tabela[x][y] == " "){
                    tabela[x][y] = "X";
                }
            }else{
                if(tabela[x][y] == " "){
                    tabela[x][y] = "O";
                }
            }
        
            System.out.println("");
            mostrarTabela();
            System.out.println("");

            if(jogador == 1){
                jogador = 2;
            }else{
                jogador = 1;
            }
            jogadas++;
            
            // DECIDIR SE HOUVE VENCEDOR
            for(int i=0;i<tabela.length;i++){
                for(int j=0;j<tabela.length;j++){
                    
                    // LINHA 1
                    if(tabela[0][0] == "O" && tabela[0][1] == "O" && tabela[0][2] == "O"){
                        vencedor = true;
                        nome = "Jogador 2";
                    }
                    if(tabela[0][0] == "X" && tabela[0][1] == "X" && tabela[0][2] == "X"){
                        vencedor = true;
                        nome = "Jogador 1";
                    }
                    
                    // LINHA 2
                    if(tabela[1][0] == "O" && tabela[1][1] == "O" && tabela[1][2] == "O"){
                        vencedor = true;
                        nome = "Jogador 2";
                    }else if(tabela[1][0] == "X" && tabela[1][1] == "X" && tabela[1][2] == "X"){
                        vencedor = true;
                        nome = "Jogador 1";
                    }
                    
                    // LINHA 3
                    if(tabela[2][0] == "O" && tabela[2][1] == "O" && tabela[2][2] == "O"){
                        vencedor = true;
                        nome = "Jogador 2";
                    }else if(tabela[2][0] == "X" && tabela[2][1] == "X" && tabela[2][2] == "X"){
                        vencedor = true;
                        nome = "Jogador 1";
                    }
                    
                    // COLUNA 1
                    if(tabela[0][0] == "O" && tabela[1][0] == "O" && tabela[2][0] == "O"){
                        vencedor = true;
                        nome = "Jogador 2";
                    }else if(tabela[0][0] == "X" && tabela[1][0] == "X" && tabela[2][0] == "X"){
                        vencedor = true;
                        nome = "Jogador 1";
                    }
                    
                    // COLUNA 2
                    if(tabela[0][1] == "O" && tabela[1][1] == "O" && tabela[2][1] == "O"){
                        vencedor = true;
                        nome = "Jogador 2";
                    }else if(tabela[0][1] == "X" && tabela[1][1] == "X" && tabela[2][1] == "X"){
                        vencedor = true;
                        nome = "Jogador 1";
                    }
                    
                    // COLUNA 3
                    if(tabela[0][2] == "O" && tabela[1][2] == "O" && tabela[2][2] == "O"){
                        vencedor = true;
                        nome = "Jogador 2";
                    }else if(tabela[0][2] == "X" && tabela[1][2] == "X" && tabela[2][2] == "X"){
                        vencedor = true;
                        nome = "Jogador 1";
                    }
                    
                    // VERTICAL 1
                    if(tabela[0][0] == "O" && tabela[1][1] == "O" && tabela[2][2] == "O"){
                        vencedor = true;
                        nome = "Jogador 2";
                    }else if(tabela[0][0] == "X" && tabela[1][1] == "X" && tabela[2][2] == "X"){
                        vencedor = true;
                        nome = "Jogador 1";
                    }
                    
                    // VERTICAL 2
                    if(tabela[0][2] == "O" && tabela[1][1] == "O" && tabela[2][0] == "O"){
                        vencedor = true;
                        nome = "Jogador 2";
                    }else if(tabela[0][2] == "X" && tabela[1][1] == "X" && tabela[2][0] == "X"){
                        vencedor = true;
                        nome = "Jogador 1";
                    }
                }
            }
        }
        System.out.println("O VENCEDOR FOI: " + nome);
    }

    public static void main(String[] args){
        int escolha = 1;
        boolean vencedor = false;

        //Implementação loop para menu
        while(escolha == 1){
            
            // MENU
            System.out.println("==== MENU ====");
            escolha = Input.readInt("1- Jogar\n2- Sair\nEscolha: ");
            
            switch(escolha){
                case 1: 
                    System.out.println("\nBEM VINNDO !!!\nNOVA PARTIDA\n");
                    JogoDaVelha partida = new JogoDaVelha();
                    System.out.println("");
                    partida.jogar();
                    break;
                case 2:
                    System.out.println("Saindo...");
            }
        }
    }
}
