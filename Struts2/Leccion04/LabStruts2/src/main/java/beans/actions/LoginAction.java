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
public class LoginAction extends ActionSupport {

    Logger log = LogManager.getLogger(LoginAction.class);

    private String usuario;
    private String password;

    public String execute() {
        log.info("El usuario es: " + this.usuario);
        log.info("La password es: " + this.password);
        return SUCCESS;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getTitulo() {
        return getText("form.titulo");
    }

    public String getValores() {
        return getText("form.valores");
    }

    public String getBoton() {
        return getText("form.boton");
    }

    public String getUser() {
        return getText("form.usuario");
    }

    public String getPass() {
        return getText("form.password");
    }

}
