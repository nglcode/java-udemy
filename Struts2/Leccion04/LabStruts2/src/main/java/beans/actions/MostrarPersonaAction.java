/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package beans.actions;

import com.opensymphony.xwork2.ActionSupport;
import org.apache.logging.log4j.*;

/**
 *
 * @author agdev
 */
public class MostrarPersonaAction extends ActionSupport {

    Logger log = LogManager.getLogger(MostrarPersonaAction.class);

    private String nombre;

    public String execute() {
        log.info("El nombre es: " + this.nombre);
        return SUCCESS;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTitulo() {
        return getText("persona.titulo");
    }

    public String getValor() {
        return getText("persona.valor");
    }

    public String getBoton() {
        return getText("persona.boton");
    }

}
