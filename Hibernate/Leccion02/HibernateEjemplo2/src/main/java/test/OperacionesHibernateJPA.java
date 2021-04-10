package test;

import com.nglcode.dao.PersonaDAO;
import com.nglcode.domain.Persona;

public class OperacionesHibernateJPA {
    
    public static void main(String[] args) {
        
        PersonaDAO personaDao = new PersonaDAO();
        personaDao.listar();
        
        Persona persona = new Persona();
        persona.setIdPersona(11);
        
        persona = personaDao.buscarPersonaPorID(persona);
        System.out.println("Persona encontrada: " + persona);
        
        //persona.setNombre("Carlos");
//        persona.setApellido("Esparza");
//        persona.setEmail("cesparza@mail.com");
        //persona.setTelefono("55532146");
        
        //personaDao.insertar(persona);
//        personaDao.modificar(persona);

        personaDao.eliminar(persona);
        personaDao.listar();
        
    }
    
}
