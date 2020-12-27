
package com.nglcode.sga.cliente;

import com.nglcode.sga.domain.Persona;
import com.nglcode.sga.servicio.PersonaServiceRemote;
import javax.naming.*;
import org.apache.logging.log4j.*;


public class PruebaManejoTransacciones {
    
    static Logger log = LogManager.getRootLogger();
    
    public static void main(String[] args) {
        try {
            Context jndi = new InitialContext();
            PersonaServiceRemote personaService = (PersonaServiceRemote) jndi.lookup("java:global/sga-jee-webv7/PersonaServiceImpl!com.nglcode.sga.servicio.PersonaServiceRemote");
            
            log.debug("Iniciando Prueba de Manejo Transaccional PersonaService...");
            
            //Buscar un objeto persona
            Persona persona1 = personaService.encontrarPersonaPorId(new Persona(1));
            
            log.debug("Persona recuperada: " + persona1);
            
            //Cambiar el apellido de la persona
            //persona1.setApellido("Qazxcd Qazxcd Qazxcd Qazxcd Qazxcd Qazxcd Qazxcd");
            //persona1.setApellido("Perez");
            persona1.setEmail("jperez@mail.com");
            
            personaService.modificarPersona(persona1);
            log.debug("Objeto modificado: " + persona1);
            log.debug("Fin prueba EJB transaccional.");
            
                    
        } catch (NamingException ex) {
            log.debug(ex.getMessage());
        }
        
    }
    
}
