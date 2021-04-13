package com.nglcode.domain;

import java.io.Serializable;
import java.util.Objects;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Domicilio implements Serializable {
    
    private static final long serialVersionUID = 1L;
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) //la base de datos es quien se va a encargar de generar la llave primaria
    @Column(name = "id_domicilio") //es necesario especificar el nombre ya que difiere del que le estamos asignando en Java
    private Integer idDomicilio;
    
    private String calle;
    
    @Column(name = "no_calle")
    private String noCalle;
    
    private String pais;

    public Domicilio() {
    }

    public Domicilio(Integer idDomicilio) {
        this.idDomicilio = idDomicilio;
    }

    public Integer getIdDomicilio() {
        return idDomicilio;
    }

    public void setIdDomicilio(Integer idDomicilio) {
        this.idDomicilio = idDomicilio;
    }

    public String getCalle() {
        return calle;
    }

    public void setCalle(String calle) {
        this.calle = calle;
    }

    public String getNoCalle() {
        return noCalle;
    }

    public void setNoCalle(String noCalle) {
        this.noCalle = noCalle;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Domicilio{idDomicilio=").append(idDomicilio);
        sb.append(", calle=").append(calle);
        sb.append(", noCalle=").append(noCalle);
        sb.append(", pais=").append(pais);
        sb.append('}');
        return sb.toString();
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 97 * hash + Objects.hashCode(this.idDomicilio);
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
        final Domicilio other = (Domicilio) obj;
        if (!Objects.equals(this.idDomicilio, other.idDomicilio)) {
            return false;
        }
        return true;
    }
    
    
    
    
    
}
