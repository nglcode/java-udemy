
package com.nglcode.ventas;


public class Orden {
    
    private int idOrden;
    private Producto productos[];
    private static int contadorOrdenes;
    private static final int MAX_PRODUCTOS = 10;

    public Orden() {
        this.idOrden = ++Orden.contadorOrdenes;
        
    }
    
    public void agregarProducto(Producto producto) {
        
        
        
        
    }
    
    public double calcularTotal() {
        return 0.0;
    }
    
    public void mostrarOrden() {
        
    }
    
    
}
