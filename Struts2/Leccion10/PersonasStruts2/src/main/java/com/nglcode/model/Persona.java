package com.nglcode.model;

public class Persona {
    
    private String nombre;
    Domicilio domicilio;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Domicilio getDomicilio() {
        return domicilio;
    }

    public void setDomicilio(Domicilio domicilio) {
        this.domicilio = domicilio;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Persona{nombre=").append(nombre);
        sb.append(", domicilio=").append(domicilio);
        sb.append('}');
        return sb.toString();
    }
    
    
    
}
