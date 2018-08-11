public class ex07{
  public static void main(String[] args){
    String nome1 = Input.readString("Informe o nome da primeira pessoa: ");
    double peso1 = Input.readDouble("Informe o peso da primeira pessoa: ");
    double altura1 = Input.readDouble("Informe a altura da primeira pessoa: ");

    String nome2 = Input.readString("Informe o nome da segunda pessoa: ");
    double peso2 = Input.readDouble("Informe o peso da segunda pessoa: ");
    double altura2 = Input.readDouble("Informe a altura da segunda pessoa: ");

    if(peso1 > peso2){
      System.out.println(nome1 + "Tem o maior peso!");
    }else{
      System.out.println(nome2 + "Tem o maior peso!");
    }

    if(altura1 > altura2){
      System.out.println(nome1 + "Tem a maior altura!");
    }else{
      System.out.println(nome2 + "Tem a maior altura!");
    }
  }
}    
