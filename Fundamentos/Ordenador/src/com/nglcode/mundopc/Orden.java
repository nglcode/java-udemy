package com.nglcode.mundopc;

public class Orden {

    private final int idOrden;
    private Computadora computadoras[];
    private static int contadorOrdenes;
    private int contadorComputadoras;
    private static final int MAX_COMPUTADORAS = 5;

    public Orden() {
        this.idOrden = ++Orden.contadorOrdenes;
        this.computadoras = new Computadora[Orden.MAX_COMPUTADORAS];
    }

    public void agregarComputadora(Computadora computadora) {

        if (this.contadorComputadoras < Orden.MAX_COMPUTADORAS) {
            this.computadoras[this.contadorComputadoras++] = computadora;
        } else {
            System.out.println("Se ha superado el maximo de productos: " + Orden.MAX_COMPUTADORAS);
        }

    }

    public void mostrarOrden() {

        System.out.println("---------------------------");
        System.out.println("ID Orden: " + this.idOrden);
        System.out.println("Computadoras: ");

        for (int i = 0; i < this.contadorComputadoras; i++) {
            System.out.println(this.computadoras[i]);
        }

        System.out.println("---------------------------");

    }

}
