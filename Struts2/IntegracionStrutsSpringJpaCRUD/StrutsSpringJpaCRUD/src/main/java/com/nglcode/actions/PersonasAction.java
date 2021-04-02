/*
 * Esta clase hara las veces de Controlador (action) y Modelo (bean)
 * El modelo lo obtendremos con la ayuda de la interface Service
 * Deben respetarse las convenciones de Struts2 (dentro de paquete action, clase con sufijo Action)
 */
package com.nglcode.actions;

// Vamos a extender de ActionSupport para sobreescribir el metodo execute
import com.nglcode.capadatos.domain.Persona;
import com.nglcode.capaservicio.PersonaService;
import com.opensymphony.xwork2.ActionSupport;
import java.util.List;
import org.apache.logging.log4j.*;
import org.apache.struts2.convention.annotation.*;
import org.springframework.beans.factory.annotation.Autowired;

public class PersonasAction extends ActionSupport {

    private List<Persona> personas;
    private Persona persona;

    @Autowired
    private PersonaService personaService;

    Logger log = LogManager.getLogger(PersonasAction.class);

    @Action(value = "/listar", results = {
        @Result(name = "personas", location = "/WEB-INF/content/personas.jsp")})
    public String listar() {
        this.personas = personaService.listarPersonas();
        return "personas";
    }

    @Action(value = "/agregarPersona", results = {
        @Result(name = "persona", location = "/WEB-INF/content/persona.jsp")})
    public String agregar() {
        persona = new Persona();
        return "persona";
    }

    @Action(value = "/editarPersona", results = {
        @Result(name = "persona", location = "/WEB-INF/content/persona.jsp")})
    public String editar() {
        persona = personaService.recuperarPersona(persona);
        return "persona";
    }

    @Action(value = "/eliminarPersona", results = {
        @Result(name = "success", location = "listar", type = "redirect")})
    public String eliminar() {
        log.info("Metodo eliminar persona antes de recuperar: " + persona);
        persona = personaService.recuperarPersona(persona);
        log.info("Metodo eliminar persona despues de recuperar: " + persona);
        personaService.eliminarPersona(persona);
        return SUCCESS;
    }

    // no basta con mandar al jsp, sino a la accion de listar
    // por ello redireccionamos a la accion listar
    @Action(value = "/guardarPersona", results = {
        @Result(name = "success", location = "listar", type = "redirect")})
    public String guardar() {
        if (persona.getIdPersona() == null) {
            personaService.agregarPersona(persona);
        } else {
            personaService.modificarPersona(persona);
        }
        return SUCCESS;
    }

    public List<Persona> getPersonas() {
        return personas;
    }

    public void setPersonas(List<Persona> personas) {
        this.personas = personas;
    }

    public Persona getPersona() {
        return persona;
    }

    public void setPersona(Persona persona) {
        this.persona = persona;
    }
    
    

}
