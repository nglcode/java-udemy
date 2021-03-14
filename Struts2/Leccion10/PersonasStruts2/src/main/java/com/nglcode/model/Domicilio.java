package com.nglcode.model;

public class Domicilio {
    
    private String calle;
    private int numeroCalle;
    private String pais;

    public String getCalle() {
        return calle;
    }

    public void setCalle(String calle) {
        this.calle = calle;
    }

    public int getNumeroCalle() {
        return numeroCalle;
    }

    public void setNumeroCalle(int numeroCalle) {
        this.numeroCalle = numeroCalle;
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
        sb.append("Domicilio{calle=").append(calle);
        sb.append(", numeroCalle=").append(numeroCalle);
        sb.append(", pais=").append(pais);
        sb.append('}');
        return sb.toString();
    }
    
    
    
}
