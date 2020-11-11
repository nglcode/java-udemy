
package test;

import domain.Persona;


public class PersonaPrueba {
    
    public static void main(String[] args) {
        
        Persona p1 = new Persona("PersonaUno");
        Persona p2 = new Persona("PersonaDos");
        
        imprimir(p1);
        imprimir(p2);
        
        
        
    }
    
    public static void imprimir(Persona persona) {
        System.out.println("persona = " + persona);
    }
}
