package com.nglcode.domain;

import java.io.Serializable;
import java.util.List;
import java.util.Objects;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class Alumno implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_alumno")
    private Integer idAlumno;

    private String nombre;

    private String apellido;

    @JoinColumn(name = "id_domicilio", referencedColumnName = "id_domicilio") //relaciona el id_domicilio de la tabla alumno con el id_domicilio de la tabla domicilio
    @ManyToOne(cascade = CascadeType.ALL) //al guardar el registro de alumno,tambien se guardara el registro en esta tabla
    private Domicilio domicilio;

    @JoinColumn(name = "id_contacto", referencedColumnName = "id_contacto") //lo mismo aqui
    @ManyToOne(cascade = CascadeType.ALL) //al guardar el registro de alumno,tambien se guardara el registro en esta tabla
    private Contacto contacto;
    
    @OneToMany(mappedBy = "alumno")
    private List<Asignacion> asignaciones;

    public Alumno() {
    }

    public Alumno(Integer idAlumno) {
        this.idAlumno = idAlumno;
    }

    public Integer getIdAlumno() {
        return idAlumno;
    }

    public void setIdAlumno(Integer idAlumno) {
        this.idAlumno = idAlumno;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public Domicilio getDomicilio() {
        return domicilio;
    }

    public void setDomicilio(Domicilio domicilio) {
        this.domicilio = domicilio;
    }

    public Contacto getContacto() {
        return contacto;
    }

    public void setContacto(Contacto contacto) {
        this.contacto = contacto;
    }

    public List<Asignacion> getAsignaciones() {
        return asignaciones;
    }

    public void setAsignaciones(List<Asignacion> asignaciones) {
        this.asignaciones = asignaciones;
    }
    

    @Override
    public String toString() {
        //no es recomendable agregar atributos que sean de tipo List a este metodo
        StringBuilder sb = new StringBuilder();
        sb.append("Alumno{idAlumno=").append(idAlumno);
        sb.append(", nombre=").append(nombre);
        sb.append(", apellido=").append(apellido);
        sb.append(", domicilio=").append(domicilio);
        sb.append(", contacto=").append(contacto);
        sb.append('}');
        return sb.toString();
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 53 * hash + Objects.hashCode(this.idAlumno);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Alumno other = (Alumno) obj;
        if (!Objects.equals(this.idAlumno, other.idAlumno)) {
            return false;
        }
        return true;
    }
    
    

}
