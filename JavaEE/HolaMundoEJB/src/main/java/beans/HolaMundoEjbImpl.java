package beans;

import javax.ejb.Stateless;

@Stateless
public class HolaMundoEjbImpl implements HolaMundoEjbRemote {

    @Override
    public int sumar(int a, int b) {
        System.out.println("Ejecutando sumar");
        return a+b;
    }
    
    //java:global/HolaMundoEJB-1.0-SNAPSHOT/HolaMundoEjbImpl!beans.HolaMundoEjbRemote
}
