
public class Caja {
    
    int ancho, alto, profundo;
    
    public Caja() {
        System.out.println("Constructor vacio");
    }
    
    public Caja(int ancho, int alto, int profundo) {
        System.out.println("Constructor con argumentos");
        this.ancho = ancho;
        this.alto = alto;
        this.profundo = profundo;
    }
    
    public float calcularVolumen() {
        float vol = this.ancho*this.alto*this.profundo;
        return vol;
    }
    
    
    
}
