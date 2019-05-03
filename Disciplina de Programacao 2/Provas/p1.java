public class Pais {

        //atributos
        public String nome;
        public String capital;
        public double dimensao;
        public String fronteira[];
        public int qtdFronteiras;
        
        //construtor
        public Pais(){
            nome = Input.readString("Nome: ");
            capital = Input.readString("Capital: ");
            dimensao = Input.readDouble("Dimensao: ");
            qtdFronteiras = Input.readInt("QtdFronteira: ");
            fronteira = new String[qtdFronteiras];
            for(int i=0;i<qtdFronteiras;i++)
               fronteira[i] = Input.readString("Nome Fronteira: ");
        }
        
        // B) metodos setters
        public void setNome(String nome){
            this.nome = nome;
        }
        
        public void setCapital(String capital){
            this.capital = capital;
        }
        
        public void setDimensao(double dimensao){
            this.dimensao = dimensao;
        }
        
        // B) metodos getters
        public String getNome(){
            return nome;
        }
        
        public String getCapital(){
            return capital;
        }
        
        public double getDimensao(){
            return dimensao;
        }
        
        public void adicionarFronteira(int qtd){
            fronteira = new String[qtd];
            for(int i=0;i<qtdFronteiras;i++){
               fronteira[i] = Input.readString("NomeFronteira: ");
            }
        }
        
        public void imprimeDados(){
            System.out.println("\n**************");
            System.out.println("Pais: "+nome);
            System.out.println("Capital: "+capital);
            System.out.println("Dimensao: "+dimensao);
            System.out.print("Fronteiras:");
            for(int i=0;i<qtdFronteiras;i++){
               System.out.print(" "+fronteira[i]);
            }
            System.out.println("\n**************");
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
            
            Pais p1;
            Pais p2;
            String str;
            boolean igualdade;
            int escolha;
            int newFronteira;
            
            
            p1 = new Pais();
            System.out.println("");
            p2 = new Pais();
            
            // MENU
            System.out.println("Informe uma operação: ");
            escolha = Input.readInt("1: Verificar igualdade\n2: Adicionar froneira\n3: Mostrar fronteiras\n4: Maior país\n5: ");
            
            
            switch(escolha){
                case 1: // C
                    igualdade = p1.verificaIgualdade(p2);
                    if(igualdade == true){
                        System.out.println("O países são Iguais!!");
                        p1.imprimeDados();
                    }else{
                        System.out.println("Os países são diferentes!!");
                        p1.imprimeDados();
                        p2.imprimeDados();
                    }
                case 2: 
                    newFronteira = Input.readInt("Informe a quantidade de fronteiras para " + p1.getNome());
                    p1.adicionarFronteira(newFronteira);
                    p1.imprimeDados();
                    System.out.println("");
                    newFronteira = Input.readInt("Informe a quantidade de fronteiras para " + p1.getNome());
                    p2.adicionarFronteira(newFronteira);
                    p2.imprimeDados();
            }          
        }
}
