import java.util.Locale;

class ex01 {  
    public static void main(String[] args) {  
        Locale obterPadrao = Locale.getDefault();  
        System.out.println( obterPadrao.getDisplayLanguage() );
    }  
}  
