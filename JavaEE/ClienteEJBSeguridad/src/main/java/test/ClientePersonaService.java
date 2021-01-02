
package test;

import com.nglcode.sga.domain.Persona;
import com.nglcode.sga.servicio.PersonaServiceRemote;
import com.sun.enterprise.security.ee.auth.login.ProgrammaticLogin;
import java.util.List;
import javax.naming.*;


public class ClientePersonaService {
    
    public static void main(String[] args)  {
        
        System.out.println("Iniciando llamada al EJB desde el cliente...");
        
        String authFile = "login.conf";
        System.setProperty("java.security.auth.login.config", authFile);
        
        ProgrammaticLogin programmaticLogin = new ProgrammaticLogin();
        programmaticLogin.login("admin", "admin".toCharArray());
        
        try {
            Context jndi = new InitialContext();
            PersonaServiceRemote personaService = (PersonaServiceRemote) jndi.lookup("java:global/sga-jee-webv11/PersonaServiceImpl!com.nglcode.sga.servicio.PersonaServiceRemote");
            
            List<Persona> personas = personaService.listarPersonas();
            
            for (Persona persona : personas) {
                System.out.println(persona);
            }
            
            System.out.println("\nFin de la llamada al EJB desde el cliente...");
        } catch (NamingException ex) {
            ex.printStackTrace(System.out);
        }
        
        
    }
    
}
