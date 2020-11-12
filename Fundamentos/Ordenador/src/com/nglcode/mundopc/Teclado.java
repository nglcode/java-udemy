package com.nglcode.mundopc;

public class Teclado extends DispositivoEntrada {

    private int idTeclado;
    private static int contadorTeclados;

    public Teclado(String tipoEntrada, String marca) {
        super(tipoEntrada, marca);
        this.idTeclado = ++Teclado.contadorTeclados;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Teclado{idTeclado=").append(idTeclado);
        sb.append(", ").append(super.toString());
        sb.append('}');
        return sb.toString();
    }

}
