public class ex06{

    public static void main(String[] args) {

    double n1, n2, maior, menor, media;
    
    System.out.println("Informe um número: ");
    double n1 = Input.readInt();
    media = n1;

    System.out.println("Informe o segundo número: ");
    double n2 = Input.readInt();
    media = (n1 + n2)/2;
    if(n1 > n2){
      maior = n1;
      menor = n2;
    }else{
      maior = n2;
      menor = n1;
    }

    System.out.println("Informe o terceiro número: ");
    n2 = Input.readInt();
    media = (media + n2)/3;
    if(maior > n2 && menor > n2){
        menor = n2;
    }else{
      maior = n2;
    }

    System.out.println("Informe o quarto número: ");
    n2 = Input.readInt();
    media = (media + n2)/4;
    if(maior > n2 && menor > n2){
        menor = n2;
    }else{
      maior = n2;
    }

    System.out.println("Informe o quinto número: ");
    n2 = Input.readInt();
    media = (media + n2)/5;
    if(maior > n2 && menor > n2){
        menor = n2;
    }else{
      maior = n2;
    }

    System.out.println("Informe o sexto número: ");
    n2 = Input.readInt();
    media = (media + n2)/6;
    if(maior > n2 && menor > n2){
        menor = n2;
    }else{
      maior = n2;
    }

    System.out.println("Informe o sétimo número: ");
    n2 = Input.readInt();
    media = (media + n2)/7;
    if(maior > n2 && menor > n2){
        menor = n2;
    }else{
      maior = n2;
    }

    System.out.println("Informe o oitavo número: ");
    n2 = Input.readInt();  
    media = (media + n2)/8;
    if(maior > n2 && menor > n2){
        menor = n2;
    }else{
      maior = n2;
    }

    System.out.println("Informe o novo número: ");
    n2 = Input.readInt();
    media = (media + n2)/9;
    if(maior > n2 && menor > n2){
        menor = n2;
    }else{
      maior = n2;
    }

    System.out.println("Informe o décimo número: ");
    n2 = Input.readInt();
    media = (media + n2)/10;
    if(maior > n2 && menor > n2){
        menor = n2;
    }else{
      maior = n2;
    }

    System.out.println("A média é " + media + ".");
    System.out.println("O maior número é " + maior + ".");
    System.out.println("O menor número é " + menor + ".");
  }
}
