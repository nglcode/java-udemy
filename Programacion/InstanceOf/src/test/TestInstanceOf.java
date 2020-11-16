package test;

import domain.Empleado;
import domain.Gerente;

public class TestInstanceOf {

    public static void main(String[] args) {

        Empleado empleado = new Empleado("Juan", 5000);
        empleado = new Gerente("Karla", 12500, "IT");
        determinarTipo(empleado);


    }

    public static void determinarTipo(Empleado empleado) {

        if (empleado instanceof Gerente) {
            System.out.println("Es de tipo Gerente");
            Gerente gerente = (Gerente) empleado;
            System.out.println("gerente = " + gerente.getDepartamento());
        } 
        else if (empleado instanceof Empleado){
            System.out.println("Es de tipo Empleado");
        } 
        else if (empleado instanceof Object) {
            System.out.println("Es de tipo Object");
        }

    }

}
