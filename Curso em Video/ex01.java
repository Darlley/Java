// AULA 04

import java.util.Locale;

puclic class ex01 {  
    public static void main(String[] args) {  
        Locale obterPadrao = Locale.getDefault();
        String idiomaSistema = obterPadrao.getDisplayLanguage(); 
        System.out.println("Seu sistema está em " + idiomaSistema);
    }  
} 
