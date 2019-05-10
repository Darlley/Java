public class Pais {

        //ATRIBUTOR
        public String nome;
        public String capital;
        public double dimensao;
        public String fronteira[];
        public int qtdFronteiras;
        
        //CONSTRUTOR
        public Pais(){
            nome = Input.readString("Nome: ");
            capital = Input.readString("Capital: ");
            dimensao = Input.readDouble("Dimensao: ");
            qtdFronteiras = Input.readInt("Quantos países fazem fronteira com " + (nome) + ": ");
            fronteira = new String[qtdFronteiras];
            for(int i=0;i<qtdFronteiras;i++)
               fronteira[i] = Input.readString("Nome país fronteira " + (i+1) + ": ");
        }
        
        //METODOS SETTERS
        public void setNome(String nome){
            this.nome = nome;
        }
        
        public void setCapital(String capital){
            this.capital = capital;
        }
        
        public void setDimensao(double dimensao){
            this.dimensao = dimensao;
        }
        
        //METODOS GETTERS
        public String getNome(){
            return nome;
        }
        
        public String getCapital(){
            return capital;
        }
        
        public double getDimensao(){
            return dimensao;
        }
        
        public void imprimeDados(){
            System.out.println("\n=====" +nome);
            System.out.println("Capital: "+capital);
            System.out.println("Dimensao: "+dimensao);
            System.out.print("Fronteiras:");
            for(int i=0;i<qtdFronteiras;i++)
               System.out.print(" "+fronteira[i]);
            System.out.println("\n====================");
        }
        
        // C) verifica igualdade entre paises
        public boolean verificaIgualdade(Pais p2){
            String nomeP1,nomeP2,capitalP1,capitalP2;
            nomeP1 = nome;
            nomeP2 = p2.getNome();
            capitalP1 = capital;
            capitalP2 = p2.getCapital();
            
            if(nomeP1.equals(nomeP2)){
                if(capitalP1.equals(capitalP2))
                    return true;
            }
            return false;
        }
        
        public static void main(String args[]){
            
            String str;
            boolean igualdade;
            int opcao=0, qtdPaises, contPaises=0, i, opcaoPais, comparar1, comparar2;
            
            Pais vetorPaises[];
            qtdPaises = Input.readInt("Digite o max. de paises: ");
            vetorPaises = new Pais[qtdPaises];
            
            while(opcao !=3){
                System.out.println("");
                System.out.println("===== MENU =====");
                opcao = Input.readInt("Escolha uma opcao:\n1- Inserir pais\n2- Imprimir dados\n3- Comparar países\n4- Sair\nOpcao: ");
                System.out.println("");
                
                switch(opcao){
                    
                    //inserir novo pais
                    case 1:
                        if(contPaises<qtdPaises){
                            System.out.println("===== INSERIR PAÍS =====");
                            vetorPaises[contPaises] = new Pais();
                            System.out.print("===== Pais (" + (vetorPaises[contPaises].nome) + ") inserido com sucesso!");
                            System.out.println("");
                            contPaises++;
                        }else{
                            System.out.println("Num. Max. Paises ja cadastrados!\n");
                        }
                    break;
                
                    //imprimir dados de um pais
                    case 2:
                        
                        System.out.println("===== PAÍSES CADASTRADOS =====");
                        for(i=0;i<contPaises;i++){
                            System.out.println((i+1)+" - "+vetorPaises[i].getNome());
                        }
                        opcaoPais = Input.readInt("Escolha o pais: ");
                        vetorPaises[opcaoPais-1].imprimeDados();
                            
                    break;
                    
                    case 3:
                        System.out.println("===== COMPARAR PAÍSES =====");
                        for(i=0;i<contPaises;i++){
                            System.out.println((i+1)+" - "+vetorPaises[i].getNome());
                        }
                        comparar1 = Input.readInt("Escolha o primeiro país: ");
                        comparar2 = Input.readInt("Escolha o segundo país: ");
                        comparar1--;
                        comparar2--;
                        System.out.println("");
                        
                        igualdade = vetorPaises[comparar1].verificaIgualdade(vetorPaises[comparar2]);
                        if(igualdade == true){
                            System.out.println("O países são Iguais!!");
                            vetorPaises[comparar1].imprimeDados();
                        }else{
                            System.out.println("Os países são diferentes!!");
                            vetorPaises[comparar1].imprimeDados();
                            vetorPaises[comparar2].imprimeDados();
                        }
                    break;
                    //sair
                    case 5:
                        System.out.println("Saindo do programa!");
                    break;

                }//fim switch case
            }//fim while
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            /*str = p.getNome();
            System.out.println("Retorno: "+str);
            
            p.setNome("Luis");
            str = p.getNome();
            System.out.println("Retorno: "+str);*/
            /*
            igualdade = p1.verificaIgualdade(p2);
            if(igualdade == true)
                System.out.println("Iguais!");
            else   
                System.out.println("Diferentes!!");*/
            
            //p1.imprimeDados();
        }
}
