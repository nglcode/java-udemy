package com.nglcode.mundopc;

public class DispositivoEntrada {

    protected String tipoEntrada;
    protected String marca;

    public DispositivoEntrada(String tipoEntrada, String marca) {
        this.tipoEntrada = tipoEntrada;
        this.marca = marca;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("DispositivoEntrada{tipoEntrada=").append(tipoEntrada);
        sb.append(", marca=").append(marca);
        sb.append('}');
        return sb.toString();
    }

}
