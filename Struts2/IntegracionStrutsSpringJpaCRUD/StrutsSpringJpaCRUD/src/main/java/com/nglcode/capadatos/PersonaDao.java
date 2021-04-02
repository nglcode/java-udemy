/*
 * Usar interfaces es una buena practica, que nos sirve para separar las capas de la app java.
 * Aqui aplicaremos el patron DAO, ya que es la interface que nos permitira aplicar las operaciones sobre la clase de entidad de Persona
 */
package com.nglcode.capadatos;

import com.nglcode.capadatos.domain.Persona;
import java.util.List;

public interface PersonaDao {
    
    void insertPersona(Persona persona);
    void updatePersona(Persona persona);
    void deletePersona(Persona persona);
    Persona findPersonaById(long idPersona);
    List<Persona> findAllPersonas();
    long contadorPersonas();
    Persona getPersonaByEmail(Persona persona);
    
    
}
