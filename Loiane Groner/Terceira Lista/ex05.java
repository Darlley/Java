import java.util.Scanner;

public class ex04 {
  public static void main(Sting[] args){
  
    Scanner scan = new Scanner(System.in);
    
    boolean valido = false;
    double popA;
    double popB;
    double taxaA;
    double taxaB;
    
    
    // POPULAÇÃO A
    
    do{
      System.out.println("Entre com a população A: ");
      popA = scan.nextDouble();
      
      if(popB > 0 ){
        valido = true;
      }else{
        System.out.println("População A precisa ser maior que 0!");
      }
    }while(!valido)
    
    valido = false;
    
    
    // POPUÇÃO B
    
    do{
      System.out.println("Entre com a população B: ");
      popB = scan.nextDouble();
      
      if(popB > 0 ){
        valido = true;
      }else{
        System.out.println("População B precisa ser maior que 0!");
      }
    }while(!valido)

    valido = false;
    
    
    //TAXA CRESCIMENTO POPULAÇÃO A
    
    do{
      System.out.println("Entre com taxa de crescimento da população A: ");
      taxaA = scan.nextDouble();
      
      if(taxaA > 0 ){
        valido = true;
      }else{
        System.out.println("A taxa de crescimento da população A ser maior que 0!");
      }
    }while(!valido)
    
    valido = false;


    //TAXA CRESCIMENTO POPULAÇÃO B 
    
    do{
      System.out.println("Entre com taxa de crescimento da população B: ");
      popB = scan.nextDouble();
      
      if(taxaB > 0 ){
        valido = true;
      }else{
        System.out.println("A taxa de crescimento da população B ser maior que 0!");
      }
    }while(!valido)


    // SAIDA
    
    int cont = 0;
    while(popA <= popB){
      popA += (popA/100) * taxaA;
      popB += (popB/100) * taxaB;
      cont++;
    }
    
    Systen.out.println("População A" + popA);
    Systen.out.println("População B" + popB);
    Systen.out.println("Quantidade anos" + cont);

  }
}
