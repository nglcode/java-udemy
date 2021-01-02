package com.nglcode.sga.servicio;

import com.nglcode.sga.datos.PersonaDAO;
import com.nglcode.sga.domain.Persona;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.Resource;
import javax.annotation.security.DeclareRoles;
import javax.annotation.security.RolesAllowed;
import javax.ejb.SessionContext;
import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.jws.WebService;

@Stateless
@WebService(endpointInterface = "com.nglcode.sga.servicio.PersonaServiceWs")
@DeclareRoles({"ROLE_ADMIN", "ROLE_USER"})
@RolesAllowed({"ROLE_ADMIN", "ROLE_USER"})
public class PersonaServiceImpl implements PersonaServiceRemote, PersonaService, PersonaServiceWs {

    @Inject
    private PersonaDAO personaDAO;

    @Resource
    private SessionContext contexto;

    @Override
    public List<Persona> listarPersonas() {
        return personaDAO.findAllPersonas();
    }

    @Override
    public Persona encontrarPersonaPorId(Persona persona) {
        return personaDAO.findPersonaById(persona);
    }

    @Override
    public Persona encontrarPersonaPorEmail(Persona persona) {
        return personaDAO.findPersonaByEmail(persona);
    }

    @Override
    public void registrarPersona(Persona persona) {
        personaDAO.insertPersona(persona);
    }

    @Override
    public void modificarPersona(Persona persona) {

        try {
            personaDAO.updatePersona(persona);
        } catch (Throwable t) {
            contexto.setRollbackOnly();
            t.printStackTrace(System.out);
        }

    }

    @Override
    @RolesAllowed("ROLE_ADMIN")
    public void eliminarPersona(Persona persona) {
        personaDAO.deletePersona(persona);
    }

}
