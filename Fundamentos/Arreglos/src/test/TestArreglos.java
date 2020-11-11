
package test;


public class TestArreglos {
    
    public static void main(String[] args) {
        
        int edades[] = new int[3];
        System.out.println("edades = " + edades);
        
        edades[0] = 10;
        
        edades[1] = 7;
        
        edades[2] = 16;
        
        for (int i = 0; i < edades.length; i++) {
            System.out.println("edad " + i + ": " + edades[i]);            
        }
        
        String frutas[] = {"Naranja", "Platano", "Uva"};
        for (int i = 0; i < frutas.length; i++) {
            System.out.println("Frutas: " + frutas[i]);
        }
        
        
    }
    
}
