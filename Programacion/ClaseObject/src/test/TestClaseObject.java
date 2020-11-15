
package test;

import domain.Empleado;


public class TestClaseObject {
    
    public static void main(String[] args) {
        
        
        Empleado e1 = new Empleado("Juan", 5000);
        Empleado e2 = new Empleado("juan", 5000);
        
        if(e1 == e2){
            System.out.println("Tienen la misma referencia.");
        } else {
            System.out.println("NO tienen la misma referencia.");
        }
        
        if (e1.equals(e2)) {
            System.out.println("Son iguales en contenido.");
        } else {
            System.out.println("Son distintos en contenido.");
        }
        
        if (e1.hashCode() == e2.hashCode()) {
            System.out.println("HC iguales: " + e1.hashCode() + " - " + e2.hashCode());
        } else {
            System.out.println("HC distintos: " + e1.hashCode() + " - " + e2.hashCode());
        }
    }
    
}
