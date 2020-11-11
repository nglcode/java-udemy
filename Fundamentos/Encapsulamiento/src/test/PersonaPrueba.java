
package test;

import dominio.Persona;

public class PersonaPrueba {
    
    public static void main(String[] args) {
        
        Persona p1 = new Persona("Nom1", 5000.00, false);
        p1.setNombre("NomSetted");
        System.out.println("P1: " + p1);
    }
    
}
