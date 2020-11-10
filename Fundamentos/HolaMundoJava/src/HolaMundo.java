
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author agdev
 */
public class HolaMundo {

    public static void main(String args[]) {
        
        newCode();
        
    }
    
    public static void newCode() {
        
    }
    
    public static void oldCode() {
        System.out.println("Hola Mundo desde Java");

        int miVariableEntera = 10;
        System.out.println(miVariableEntera);
        miVariableEntera = 5;
        System.out.println(miVariableEntera);

        String miVariableCadena = "Saludos";
        System.out.println(miVariableCadena);

        miVariableCadena = "Adiós";
        System.out.println(miVariableCadena);

        var miVariableEntera2 = 15;
        //sout
        System.out.println(miVariableEntera2);

        var miVariableCadena2 = "Nueva Cadena";
        //soutv
        System.out.println("miVariableCadena2 = " + miVariableCadena2);

        var name = "Nglcode";
        System.out.println("Nueva linea: \n" + name);
        System.out.println("Tabulador: \t" + name);
        System.out.println("Retroceso: \b" + name);
        System.out.println("Comilla simple: \'" + name + "\'");
        System.out.println("Comilla doble: \"" + name + "\"");
        
        System.out.println("Escribe tu nombre: ");
        Scanner consola = new Scanner(System.in);
        var usuario = consola.nextLine();
        System.out.println("Usuario: " + usuario);
        System.out.println("Escribe un titulo: ");
        var titulo = consola.nextLine();
        System.out.println("Resultado: " + titulo + " " + usuario);
        
        
        Scanner input = new Scanner(System.in);
        System.out.println("Proporciona el titulo: ");
        var title = input.nextLine();
        System.out.println("Proporciona el autor: ");
        var author = input.nextLine();
        System.out.println(title + " fue escrito por " + author);
    }
}
