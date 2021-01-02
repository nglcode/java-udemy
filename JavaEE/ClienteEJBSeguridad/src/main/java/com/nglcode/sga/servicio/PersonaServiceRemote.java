package com.nglcode.sga.servicio;

import com.nglcode.sga.domain.Persona;
import java.util.List;

public interface PersonaServiceRemote {

    public List<Persona> listarPersonas();

    public Persona encontrarPersonaPorId(Persona persona);

    public Persona encontrarPersonaPorEmail(Persona persona);

    public void registrarPersona(Persona persona);

    public void modificarPersona(Persona persona);

    public void eliminarPersona(Persona persona);

}