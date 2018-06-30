public class ex02 {
    public static void main(String[] args) {
        
        //VARIAVEIS
        byte numDia = 5;
        
        //INICIO
        switch (numDia){
            case 7:
            case 1:
                System.out.println("Final de Semana");
                break;
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
                System.out.println("Dias úteis");
                break;
        }
       
    }
}
