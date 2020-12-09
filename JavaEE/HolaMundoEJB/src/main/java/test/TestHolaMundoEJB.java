package test;

import beans.HolaMundoEjbRemote;
import javax.naming.*;


public class TestHolaMundoEJB {
    
    public static void main(String[] args) {
        System.out.println("Iniciando llamada al EJB desde el cliente \n");
        
        try {
            
            Context jndi = new InitialContext();
            HolaMundoEjbRemote holaMundoEJB = (HolaMundoEjbRemote) jndi.lookup("java:global/HolaMundoEJB-1.0-SNAPSHOT/HolaMundoEjbImpl!beans.HolaMundoEjbRemote");
            int resultado = holaMundoEJB.sumar(5, 3);
            System.out.println("Resultado: " + resultado);
            
        } catch (NamingException e) {
            e.printStackTrace(System.out);
        }
    }
    
}
