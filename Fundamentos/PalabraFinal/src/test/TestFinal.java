
package test;

import domain.Persona;


public class TestFinal {
    
    public static void main(String[] args) {
        
        final int miVariable = 10;
        System.out.println("miVariable = " + miVariable);
        
        System.out.println(Persona.MI_CONSTANTE);
        
        final Persona p1 = new Persona();
        
        p1.setNombre("User");
        System.out.println("p1 = " + p1.getNombre());

    }
    
}
