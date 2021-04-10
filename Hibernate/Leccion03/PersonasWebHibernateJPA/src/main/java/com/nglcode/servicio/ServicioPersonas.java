package com.nglcode.servicio;

import com.nglcode.dao.PersonaDAO;
import com.nglcode.domain.Persona;
import java.util.List;

public class ServicioPersonas {
    
    private PersonaDAO personaDao;
    
    public ServicioPersonas() {
        this.personaDao = new PersonaDAO();
    }
    public List<Persona> listarPersonas() {
        return this.personaDao.listar();
    }
    
}
