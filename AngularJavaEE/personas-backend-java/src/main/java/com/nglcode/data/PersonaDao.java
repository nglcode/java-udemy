
package com.nglcode.data;

import com.nglcode.domain.Persona;
import java.util.List;


public interface PersonaDao {
    
    public List<Persona> encontrarTodasPersonas();
    
    public Persona encontrarPersona(Persona persona);
    
    public void insertarPersona(Persona persona);
    
    public void actualizarPersona(Persona persona);
    
    public void eliminarPersona(Persona persona);
    
}
