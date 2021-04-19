package com.nglcode.web;

import com.nglcode.domain.Persona;
import com.nglcode.service.IPersonaService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
@Slf4j
public class ControladorInicio {

    //inyectamos personadao
    @Autowired
    private IPersonaService personaService;

    @GetMapping("/")
    public String inicio(Model model) {

        var personas = personaService.listarPersonas();

        log.info("Ejecutando el controlador Spring MVC");
//        model.addAttribute("persona", persona);
        model.addAttribute("personas", personas);
        return "index";
    }

    @GetMapping("/agregar")
    public String agregar(Persona persona) {

        //no sera necesario instanciar un objeto Persona
        //al indicarlo como parametro, Spring lo hace automaticamente
        return "modificar";

    }

    @PostMapping("/guardar")
    public String guardar(Persona persona) {

        //no sera necesario instanciar un objeto Persona
        //como ya hay un objeto Persona en memoria, Spring lo utilizara automaticamente
        personaService.guardar(persona);

        return "redirect:/";

    }

    @GetMapping("/editar/{idPersona}")
    public String editar(Persona persona, Model model) {
        //spring automaticamente va a buscar el objeto Persona
        //luego el idPersona que pasamos en la request, lo va a asociar a ese objeto Persona
        //por ende, spring se encargara de buscar al objeto Persona con ese ID y lo inyectara
        //se indica Model tambien para poderla compartir a la siguiente peticion

        //asignamos a la misma variable, por no crear otra.. pero devolvera a la persona encontrada con el id pasado por parametro en la peticion
        persona = personaService.encontrarPersona(persona);
        model.addAttribute("persona", persona);

        return "modificar";

    }

    //como estamos haciendo query parameter, no utilizamos el path de idPersona
    //spring reconoce que el query parameter (id) es un atributo del objeto persona
    @GetMapping("/eliminar")
    public String eliminar(Persona persona) {
        
        personaService.eliminar(persona);

        return "redirect:/";

    }
}
