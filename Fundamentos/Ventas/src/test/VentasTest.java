
package test;

import com.nglcode.ventas.Orden;
import com.nglcode.ventas.Producto;


public class VentasTest {
    
    public static void main(String[] args) {
        
        
        Producto p1 = new Producto("Primero", 100.30);
        Producto p2 = new Producto("Segundo", 250.50);
 
        
        Orden o1 = new Orden();
        o1.agregarProducto(p1);
        o1.agregarProducto(p2);
        o1.agregarProducto(p2);
        o1.agregarProducto(p2);
        o1.agregarProducto(p2);
        o1.agregarProducto(p2);
        o1.agregarProducto(p2);
        o1.agregarProducto(p2);
        o1.agregarProducto(p2);
        o1.agregarProducto(p2);
        o1.agregarProducto(p1);
        o1.mostrarOrden();
        
        
//        System.out.println("p1 = " + p1);
        
    }
    
}
