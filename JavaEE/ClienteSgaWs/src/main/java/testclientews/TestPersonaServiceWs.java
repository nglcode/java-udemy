
package testclientews;

import clientews.servicio.Persona;
import clientews.servicio.PersonaServiceImplService;
import clientews.servicio.PersonaServiceWs;
import java.util.List;


public class TestPersonaServiceWs {
    
    public static void main(String[] args) {
        
        PersonaServiceWs personaService = new PersonaServiceImplService().getPersonaServiceImplPort();
        
        System.out.println("Ejecutando servicio listar personas ws...");
        List<Persona> personas = personaService.listarPersonas();
        
        for (Persona persona : personas) {
            System.out.println("--------------");
            System.out.println("Persona ID: " + persona.getIdPersona());
            System.out.println("Persona Nombre: " + persona.getNombre());
            System.out.println("Persona Apellido: " + persona.getApellido());
            System.out.println("Persona Email: " + persona.getEmail());
            System.out.println("--------------");
        }
        
        System.out.println("Fin servicio listar personas ws...");
    }
    
}
