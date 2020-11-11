
package test;

import domain.Cliente;
import domain.Empleado;
import java.util.Date;


public class TestHerencia {
    
    public static void main(String[] args) {
        
        Empleado e1 = new Empleado("Emp1", 5000.0);
        System.out.println("e1 = " + e1);
        
        var fecha = new Date();
        
        Cliente c1 = new Cliente(fecha, true, "Cli1", 'F', 28, "Plaza Mayor");
        System.out.println("c1 = " + c1);
    }
}
