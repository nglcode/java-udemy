
package PasoPorReferencia;

import Clases.Persona;


public class PasoPorReferencia {
    
    public static void main(String[] args) {
        
        Persona persona1 = new Persona();
        persona1.nombre = "Nombre1";
        System.out.println("Persona1: " + persona1.nombre);
        persona1 = cambiaValor(persona1);
        System.out.println("Persona1 new: " + persona1.nombre);
        
    }
    
    public static Persona cambiaValor( Persona persona ) {
        
        persona.nombre = "NombreX";
        return persona;
    }
}
