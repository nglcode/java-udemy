
package test;

import domain.PersonaBean;


public class TestJavaBeans {
    
    public static void main(String[] args) {
        
        PersonaBean p1 = new PersonaBean();
        p1.setNombre("Juan");
        p1.setApellido("Perez");
        
        System.out.println("p1 = " + p1);
        
    }
    
}
