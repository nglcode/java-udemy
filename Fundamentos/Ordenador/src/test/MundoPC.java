package test;

import com.nglcode.mundopc.Computadora;
import com.nglcode.mundopc.Monitor;
import com.nglcode.mundopc.Orden;
import com.nglcode.mundopc.Raton;
import com.nglcode.mundopc.Teclado;

public class MundoPC {

    public static void main(String[] args) {

        Raton r1 = new Raton("USB", "Logitech");
        Teclado t1 = new Teclado("USB", "Logitech");
        Monitor m1 = new Monitor("HP", 22);

        Raton r2 = new Raton("PS2", "TUF");
        Teclado t2 = new Teclado("PS2", "Gigabyte");
        Monitor m2 = new Monitor("Asus", 24);

        Computadora pc1 = new Computadora("PrimeraPC", m1, t1, r1);
        Computadora pc2 = new Computadora("SegundaPC", m2, t2, r2);

        Orden o1 = new Orden();
        o1.agregarComputadora(pc1);
        o1.agregarComputadora(pc2);
        o1.mostrarOrden();

    }

}
