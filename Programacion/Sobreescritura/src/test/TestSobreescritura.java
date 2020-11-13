
package test;

import domain.Gerente;


public class TestSobreescritura {
    
    public static void main(String[] args) {
        
        Gerente g1 = new Gerente("Juan", 1500, "IT");
        System.out.println("Gerente1: " + g1.obtenerDetalles());
        
        
    }
    
}
