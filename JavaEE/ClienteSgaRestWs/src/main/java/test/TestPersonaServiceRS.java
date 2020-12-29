
package test;

import domain.Persona;
import java.util.List;
import javax.ws.rs.client.*;
import javax.ws.rs.core.*;


public class TestPersonaServiceRS {
    
    private static final String URL_BASE = "http://localhost:8080/sga-jee-webv10/webservice";
    private static Client cliente;
    private static WebTarget webTarget;
    private static Persona persona;
    private static List<Persona> personas;
    private static Invocation.Builder invocationBuilder;
    private static Response response;
    
    public static void main(String[] args) {
        
        cliente = ClientBuilder.newClient();
        
        //Leer una persona (metodo get)
        webTarget = cliente.target(URL_BASE).path("/personas");
        //Proporcionamos un idPersona valido
        persona = webTarget.path("/1").request(MediaType.APPLICATION_XML).get(Persona.class);
        System.out.println("Persona recuperada: " + persona);
        
        //Leer todas las personas (metodo get con readEntity de tipo List<>)
        personas = webTarget.request(MediaType.APPLICATION_XML).get(Response.class).readEntity(new GenericType<List<Persona>>(){});
        System.out.println("\nPersonas recuperadas:");
        imprimirPersonas(personas);
        
        //Agregar una persona (metodo post)
        Persona nuevaPersona = new Persona();
        nuevaPersona.setNombre("Carlos");
        nuevaPersona.setApellido("Miranda");
        nuevaPersona.setEmail("cmiranda@mail.com");
        nuevaPersona.setTelefono("555555555");
        
        invocationBuilder = webTarget.request(MediaType.APPLICATION_XML);
        response = invocationBuilder.post(Entity.entity(nuevaPersona, MediaType.APPLICATION_XML));
        System.out.println("");
        System.out.println(response.getStatus());
        
        //Recuperamos la persona recien agregada para despues modificarla y al final eliminarla
        Persona personaRecuperada = response.readEntity(Persona.class);
        System.out.println("Persona agregada: " + personaRecuperada);
        
        //Modificar la persona (metodo put)
        //persona recuperada anteriormente
        Persona personaModificar = personaRecuperada;
        personaModificar.setApellido("Ramirez");
        personaModificar.setEmail("cramirez@mail.com");
        String pathId = "/" + personaModificar.getIdPersona();
        invocationBuilder = webTarget.path(pathId).request(MediaType.APPLICATION_XML);
        response = invocationBuilder.put(Entity.entity(personaModificar, MediaType.APPLICATION_XML));
        
        System.out.println("");
        System.out.println("response: "+ response.getStatus());
        System.out.println("Persona modificada: " + response.readEntity(Persona.class));
        
        //Eliminar una persona
        //persona recuperada anteriormente
        Persona personaEliminar = personaRecuperada;
        String pathEliminarId = "/" + personaEliminar.getIdPersona();
        invocationBuilder = webTarget.path(pathEliminarId).request(MediaType.APPLICATION_XML);
        response = invocationBuilder.delete();
        
        System.out.println("");
        System.out.println("response: " + response.getStatus());
        System.out.println("Persona eliminada: " + personaEliminar);
        
        
        
        
    }

    private static void imprimirPersonas(List<Persona> personas) {
        for (Persona persona : personas) {
            System.out.println(persona);
        }
    }
    
            
            
    
}
