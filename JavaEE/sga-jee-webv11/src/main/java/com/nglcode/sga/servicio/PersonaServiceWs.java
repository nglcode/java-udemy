package com.nglcode.sga.servicio;

import com.nglcode.sga.domain.Persona;
import java.util.List;
import javax.jws.WebMethod;
import javax.jws.WebService;

@WebService
public interface PersonaServiceWs {
    
    @WebMethod
    public List<Persona> listarPersonas();
    
}
