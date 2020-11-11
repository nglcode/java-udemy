
package domain;


public class Persona {
    
    public final static int MI_CONSTANTE = 1;
    
    private String nombre;
    
    public void imprimir() {
        System.out.println("Hola desde imprimir");
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    
    
}
