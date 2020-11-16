package test;

import aritmetica.Aritmetica;
import excepciones.OperacionExcepcion;

public class TestExcepciones {
    
    public static void main(String[] args) {
        
        int resultado = 0;
        
        try {
           resultado = Aritmetica.division(10, 0);
        } catch(OperacionExcepcion oe) {
            System.out.println("Ocurrio un error OE.");
            System.out.println(oe.getMessage());
        } catch (Exception e) {
            System.out.println("Ocurrio un error genérico.");
            System.out.println(e.getMessage());
        } finally {
            System.out.println("Se reviso la division");
        }
        
        
        System.out.println("resultado = " + resultado);
    }
    
}
