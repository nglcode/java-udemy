package com.nglcode.sga.cliente;

import com.nglcode.sga.domain.Persona;
import com.nglcode.sga.servicio.PersonaServiceRemote;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.naming.*;

public class Cliente {
    
    public static void main(String[] args) {
        System.out.println("Iniciando llamada al EJB desde el cliente\n");
        
        try {
            Context jndi = new InitialContext();
            PersonaServiceRemote personaService = (PersonaServiceRemote) jndi.lookup("java:global/sga-jee-1.0/PersonaServiceImpl!com.nglcode.sga.servicio.PersonaServiceRemote");
            
            List<Persona> personas = personaService.listarPersonas();
            
            for (Persona persona : personas) {
                System.out.println(persona);
                
            }
            
            System.out.println("\nFin llamada al EJB desde el cliente");
            
        } catch (NamingException ex) {
            ex.printStackTrace(System.out);
        }
        
    }
    
}
