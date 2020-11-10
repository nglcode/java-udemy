
package Operaciones;


public class Aritmetica {
    
    int a;
    int b;
    
    public Aritmetica() {
        System.out.println("Ejecutando constructor...");
    }
    
    public Aritmetica(int a, int b) {
        System.out.println("Ejecutando constructor con argumentos...");
        this.a = a;
        this.b = b;
    }
    
    public void sumar() {
        
        int resultado = a+b;
        System.out.println("Resultado: " + resultado);
    }
    
    public int sumarConRetorno() {
        return a+b;
    }
    
    public int sumarConArgumentos(int arg1, int arg2) {
        
        this.a = arg1;
        this.b = arg2;
        
        return this.sumarConRetorno();
    }
}
