import java.util.Scanner;

public class ex10{

  public static void main(String[] args){
  
    Scanner scan = new Scanner(System.in);
    
    String mensagem = '';
    
    System.out.println("Informe o turno em que estuda: "); 
    System.out.println("ATENÇÃO: V para vespertino, M para Matutino e N para Noturno!");
    String turnoInformado = scan.nextLine();
    
    swith(turnoInformado){
      case "M":
        mesagem = "Bom dia!";
      case "V":
        mesagem = "Boa tarde!";
      case "N":
        mesagem = "Boa noite!";
      default:
        mesagem = "Valor inválido!";
    }
  }
}
