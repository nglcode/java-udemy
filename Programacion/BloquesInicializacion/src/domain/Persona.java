
package domain;


public class Persona {
    
    private final int idPersona;
    private static int contadorPersonas;
    
    static {
        System.out.println("Bloque estatico.");
        ++Persona.contadorPersonas;
    }
    
    {
        System.out.println("Bloque NO estatico.");
        this.idPersona = Persona.contadorPersonas++;
    }
    
    public Persona() {
        System.out.println("Ejecucion del Constructor.");
    }

    public int getIdPersona() {
        return idPersona;
    }

    @Override
    public String toString() {
        return "Persona{" + "idPersona=" + idPersona + '}';
    }
    
    
}
