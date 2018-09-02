public class ex03{
  public static void main(String[] args){
  
    int contadorH = 0, contadorM = 0;
  
    int HE = Input.readInt("Informe a hora de entrada: ");
    int ME = Input.readInt("Informe o minuto de entrada: ");
    int HS = Input.readInt("Informe a hora de saída: ");
    int MS = Input.readInt("Informe o minuto de saída: ");
    
    while(HE != HS){
        HE++;
        contadorH++;
    }
    
    while(ME != MS){
        ME++;
        contadorM++;
    }
    
    
    if(contadorH == 1){
        if(contadorM > 1){
            contadorH = 5;
        }else{
            contadorH = 4;
        }
        
        System.out.print("O valor é de R$" + contadorH + ",00!")
    }else if(contadorH == 2){
        if(contadorM > 1){
            contadorH = 7;
        }else{
            contadorH = 6;
        }
        
        System.out.print("O valor é de R$" + contadorH + ",00!")
    }else{
        if(contadorM > 1){
            contadorH = 7 + (contadorH - 2);
        }else{
            contadorH = 6 + (contadorH - 2);
        }
        
        System.out.print("O valor é de R$" + contadorH + ",00!")
    }
  } 
}
