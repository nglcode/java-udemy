package com.nglcode.sga.web;

import com.nglcode.sga.domain.Persona;
import com.nglcode.sga.servicio.PersonaService;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;
import org.apache.logging.log4j.*;
import org.primefaces.event.RowEditEvent;

@Named("personaBean")
@RequestScoped
public class PersonaBean {
    
    Logger log = LogManager.getRootLogger();
    
    @Inject
    private PersonaService personaService;
    
    private Persona personaSeleccionada;
    
    List<Persona> personas;
    
    public PersonaBean() {
        log.debug("Inicializando PersonaBean...");
    }
    
    @PostConstruct
    public void inicializar() {
        //Iniciamos las variables
        personas = personaService.listarPersonas();
        log.debug("Personas recuperadas en ManagedBean: " + personas);
        personaSeleccionada = new Persona();
    }
    
    public void editListener(RowEditEvent event) {
        Persona persona = (Persona) event.getObject();
        personaService.modificarPersona(persona);
    }
    
    public void agregarPersona() {
        this.personaService.registrarPersona(personaSeleccionada);
        this.personas.add(personaSeleccionada);
        this.personaSeleccionada = null;
    }
    
    public void eliminarPersona() {
        this.personaService.eliminarPersona(personaSeleccionada);
        this.personas.remove(this.personaSeleccionada);
        this.personaSeleccionada = null;
    }
    
    public void reiniciarPersonaSeleccionada() {
        this.personaSeleccionada = new Persona();
    }

    public Persona getPersonaSeleccionada() {
        return personaSeleccionada;
    }

    public void setPersonaSeleccionada(Persona personaSeleccionada) {
        this.personaSeleccionada = personaSeleccionada;
    }

    public List<Persona> getPersonas() {
        return personas;
    }

    public void setPersonas(List<Persona> personas) {
        this.personas = personas;
    }
    
    
    
    
    
}
