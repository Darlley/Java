public class ex04 {
  public static void main(Sting[] args){
    
    int popA = 80000;
    int popB = 200000;
    int cont = 0;
    
    while(popA <= popB){
      popA += (popA/100) * 3;
      popB += (popB/100) * 1.5;
      cont++;
    }
    
    Systen.out.println("População A" + popA);
    Systen.out.println("População B" + popB);
    Systen.out.println("Quantidade anos" + cont);
  }
}
