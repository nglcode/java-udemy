
public class Prueba {
    
    public static void main(String[] args) {
        
        Caja c1 = new Caja();
        c1.alto = 3;
        c1.ancho = 2;
        c1.profundo = 6;
        
        Caja c2 = new Caja(3,2,6);
        
        float resultadoC1 = c1.calcularVolumen();
        float resultadoC2 = c2.calcularVolumen();
        System.out.println("Resultados: ");
        System.out.println("C1: " + resultadoC1);
        System.out.println("C2: " + resultadoC2);
    }
    
}
