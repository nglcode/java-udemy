
package test;

import domain.Empleado;
import domain.Gerente;


public class TestSobreescritura {
    
    public static void main(String[] args) {
        
        Empleado empleado = new Empleado("Juan", 5000);
//        System.out.println("empleado = " + empleado.obtenerDetalles());
        imprimir(empleado);
        
        Gerente gerente = new Gerente("Karla", 12500, "IT");
//        System.out.println("gerente = " + gerente.obtenerDetalles());
        imprimir(gerente);
        
        
        
        
        
    }
    
    public static void imprimir(Empleado empleado) {
        System.out.println("empleado = " + empleado.obtenerDetalles());
    }
    
}
