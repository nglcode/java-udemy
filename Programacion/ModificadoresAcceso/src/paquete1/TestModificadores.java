
package paquete1;

import paquete1.Clase1;
import paquete1.ClaseHija;


public class TestModificadores {
    
    public static void main(String[] args) {
        
//        Clase1 clase1 = new Clase1("Público");
//        System.out.println("clase1 = " + clase1.atributoProtected);
//        clase1.metodoProtected();

//        ClaseHija ch = new ClaseHija();
//        System.out.println("ch = " + ch);

          Clase1 c1 = new Clase1("ConstPublicoDesdeTest");

          System.out.println("C1 att default: " + c1.getAtributoPrivate());

        
        
        
        
    }
    
}
