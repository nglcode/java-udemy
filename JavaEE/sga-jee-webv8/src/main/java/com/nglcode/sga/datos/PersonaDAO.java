
package com.nglcode.sga.datos;

import com.nglcode.sga.domain.Persona;
import java.util.List;


public interface PersonaDAO {
    
    public List<Persona> findAllPersonas();
    
    public Persona findPersonaById(Persona persona);
    
    public Persona findPersonaByEmail(Persona persona);
    
    public void insertPersona(Persona persona);
    
    public void updatePersona(Persona persona);
    
    public void deletePersona(Persona persona);
    
}
