package beans.model;

import java.util.Date;
import javax.enterprise.context.RequestScoped;
import javax.inject.Named;
import org.apache.logging.log4j.*;

@Named
@RequestScoped
public class Candidato {
    
    private String nombre;
    private String apellido;
    private int salarioDeseado;
    private Date fechaNacimiento;
    private String codigoPostal;
    private String ciudad;
    private String comentario;
    private int coloniaId;
    
    Logger log = LogManager.getRootLogger();
    
    public Candidato() {
        log.info("Creando el objeto Candidato");
        this.setNombre("Introduce tu nombre");
    }
    
    public String getNombre() {
        return nombre;
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
        log.info("Modificando la propiedad de nombre: " + this.nombre);
    }
    
    public String getApellido() {
        return apellido;
    }
    
    public void setApellido(String apellido) {
        this.apellido = apellido;
        log.info("Modificando la propiedad de apellido: " + this.apellido);
    }
    
    public int getSalarioDeseado() {
        return salarioDeseado;
    }
    
    public void setSalarioDeseado(int salarioDeseado) {
        this.salarioDeseado = salarioDeseado;
        log.info("Modificando la propiedad de salarioDeseado: " + this.salarioDeseado);
    }

    public Date getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(Date fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getCodigoPostal() {
        return codigoPostal;
    }

    public void setCodigoPostal(String codigoPostal) {
        this.codigoPostal = codigoPostal;
    }

    public int getColoniaId() {
        return coloniaId;
    }

    public void setColoniaId(int coloniaId) {
        this.coloniaId = coloniaId;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public String getComentario() {
        return comentario;
    }

    public void setComentario(String comentario) {
        this.comentario = comentario;
    }
    
    
    
    
}