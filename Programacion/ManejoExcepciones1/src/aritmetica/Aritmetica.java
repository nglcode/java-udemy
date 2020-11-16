
package aritmetica;

import excepciones.OperacionExcepcion;


public class Aritmetica {
    
    public static int division(int num, int den) {
        
        if( den == 0 ) {
            throw new OperacionExcepcion("Division entre cero");
        }
        
        return num / den;
        
    }
    
}
