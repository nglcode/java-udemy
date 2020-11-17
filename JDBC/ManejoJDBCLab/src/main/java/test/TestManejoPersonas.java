package test;

import datos.PersonaDAO;
import domain.Persona;
import java.util.List;

public class TestManejoPersonas {

    public static void main(String[] args) {

        PersonaDAO personaDao = new PersonaDAO();

        // Insertando un nuevo objeto Persona
//        Persona p1 = new Persona("Carlos", "Esparza", "cesparza@mail.com", "685745981");
//        personaDao.insertar(p1);

        // Modificar un registro existente
//        Persona p2 = new Persona(8, "Cristian", "Esparza", "cesparza@mail.com", "681654321");
//        personaDao.actualizar(p2);

        List<Persona> personas = personaDao.seleccionar();

        personas.forEach(persona -> {
            System.out.println(persona.toString());
        });
        
        System.out.println("-------");
        
        // Eliminar un registro existente
        Persona p3 = new Persona(8);
        personaDao.eliminar(p3);
        
        personas = personaDao.seleccionar();

        personas.forEach(persona -> {
            System.out.println(persona.toString());
        });

    }

}
