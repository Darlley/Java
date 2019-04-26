public class pais {

        //atributos
        public String nome;
        public String capital;
        public double dimensao;
        public String fronteira[];
        public int qtdFronteiras;
        
        //construtor
        public pais(){
            nome = Input.readString("Nome: ");
            capital = Input.readString("Capital: ");
            dimensao = Input.readDouble("Dimensao: ");
            qtdFronteiras = Input.readInt("QtdFronteira: ");
            fronteira = new String[qtdFronteiras];
            for(int i=0;i<qtdFronteiras;i++)
               fronteira[i] = Input.readString("NomeFronteira: ");
        }
        
        //metodos setters
        public void setNome(String nome){
            this.nome = nome;
        }
        
        public void setCapital(String capital){
            this.capital = capital;
        }
        
        public void setDimensao(double dimensao){
            this.dimensao = dimensao;
        }
        
        //metodos getters
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
            System.out.println("\n**************");
            System.out.println("Pais: "+nome);
            System.out.println("Capital: "+capital);
            System.out.println("Dimensao: "+dimensao);
            System.out.print("Fronteiras:");
            for(int i=0;i<qtdFronteiras;i++)
               System.out.print(" "+fronteira[i]);
            System.out.println("\n**************");
        }
        //verifica igualdade entre paises
        public boolean verificaIgualdade(pais p2){
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
            
            pais p1,p2;
            String str;
            boolean igualdade;
            
            p1 = new pais();
            //p2 = new pais();
            /*str = p.getNome();
            System.out.println("Retorno: "+str);
            
            p.setNome("Luis");
            str = p.getNome();
            System.out.println("Retorno: "+str);*/
            
            /*igualdade = p1.verificaIgualdade(p2);
            if(igualdade == true)
                System.out.println("Iguais!");
            else   
                System.out.println("Diferentes!!");*/
            
            p1.imprimeDados();
        }
}
