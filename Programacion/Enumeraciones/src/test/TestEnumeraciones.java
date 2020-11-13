package test;

import enumeracion.Continentes;
import enumeracion.Dias;

public class TestEnumeraciones {
    public static void main(String[] args) {
        
//        System.out.println("Dia 1: " + Dias.LUNES);
//        indicarDiaSemana(Dias.LUNES);

        System.out.println("Continente No.4: " + Continentes.AMERICA);
        System.out.println("Paises en Continente No.4: " + Continentes.AMERICA.getPaises());
        System.out.println("Idioma en Continente No.4: " + Continentes.AMERICA.getIdioma());
        
        
    }
    
    private static void indicarDiaSemana(Dias dias) {
        
        switch(dias) {
            case LUNES:
                System.out.println("Primer dia de la semana.");
                break;
            case MARTES:
                System.out.println("Segundo dia de la semana.");
                break;
        }
        
    }
    
}
