
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

        tiendaLibros();

    }
    
    public static void tiendaLibros() {
        
        var consola = new Scanner(System.in);
        System.out.println("Proporciona el nombre: ");
        var nombre = consola.nextLine();
        System.out.println("Proporciona el id: ");
        var id = Integer.parseInt( consola.nextLine() );
        System.out.println("Proporciona el precio: ");
        var precio = Double.parseDouble( consola.nextLine() );
        System.out.println("Proporciona el envio gratuito: ");
        var envioGratuito = Boolean.parseBoolean( consola.nextLine() );
        System.out.println("-------------------------------");
        System.out.println("Nombre: " + nombre);
        System.out.println("ID: " + id);
        System.out.println("Precio: " + precio);
        System.out.println("Envio gratuito: " + envioGratuito);
        System.out.println("-------------------------------");
        
    }
    
    public static void conversionTipos() {
        
        var edad = Integer.parseInt("20");
        System.out.println("edad = " + (edad+1));
        
        var valorPI = Double.parseDouble("3.1416");
        System.out.println("valorPI = " + valorPI);
        
        var consola = new Scanner(System.in);
//        System.out.println("Introduce una edad: ");
//        edad = Integer.parseInt( consola.nextLine() );
//        System.out.println("Edad = " + edad);
        
        var edadTexto = String.valueOf(10);
        System.out.println("edadTexto = " + edadTexto);
        
        var caracter = "hola".charAt(0);
        System.out.println("caracter = " + caracter);
        
        System.out.println("Proporciona un caracter:");
        caracter = consola.nextLine().charAt(0);
        System.out.println("caracter = " + caracter);
        
        
        
    }

    public static void primitivesBoolean() {

        boolean varBoolean = false;
        System.out.println("varBoolean = " + varBoolean);

        if (varBoolean) {
            System.out.println("La bandera es verdadera");
        } else {
            System.out.println("La bandera es falsa");
        }
        
        var edad = 10;
        var esAdulto = edad >= 18;
        
        if (esAdulto) {
            System.out.println("Eres mayor de edad.");
        } else {
            System.out.println("Eres menor de edad.");
        }
    }

    public static void primitivesChar() {

        char miCaracter = 'a';
        System.out.println("miCaracter = " + miCaracter);

        char varChar = '\u0021'; // utilizando Unicode
        System.out.println("varChar = " + varChar);

        char varCharDecimal = 33; // utilizando el valor decimal del caracter Unicode
        System.out.println("varCharDecimal = " + varCharDecimal);

        char varCharSimbolo = '!'; // utilizando directamente el simbolo
        System.out.println("varCharSimbolo = " + varCharSimbolo);

        int varIntSimbolo = '!'; // nos devuelve el decimal del simbolo
        System.out.println("varIntSimbolo = " + varIntSimbolo);

    }

    public static void inferenciaTipos() {
        var numEntero = 10;
        System.out.println("numEntero = " + numEntero);

        var numDouble = 10.0;
        System.out.println("numDouble = " + numDouble);

        var numFloat = 10.0F;
        System.out.println("numFloat = " + numFloat);
    }

    public static void primitivesNum() {

        byte numByte = (byte) 150; // al hacer el cast a un valor mayor del soportado, se pierde precision
        System.out.println("Valor byte: " + numByte);
        System.out.println("Valor minimo byte: " + Byte.MIN_VALUE);
        System.out.println("Valor maximo byte: " + Byte.MAX_VALUE);

        short numShort = (short) 32800; // al hacer el cast a un valor mayor del soportado, se pierde precision
        System.out.println("numShort = " + numShort);
        System.out.println("Valor minimo short: " + Short.MIN_VALUE);
        System.out.println("Valor maximo short: " + Short.MAX_VALUE);

        int numInt = (int) 2147483690L; // es necesario ademas del cast, indicar la L para indicar que la literal es Long
        System.out.println("numInt = " + numInt);
        System.out.println("Valor minimo int: " + Integer.MIN_VALUE);
        System.out.println("Valor maximo int: " + Integer.MAX_VALUE);

        long numLong = 9223372036854775807L;
        System.out.println("numLong = " + numLong);
        System.out.println("Valor minimo long: " + Long.MIN_VALUE);
        System.out.println("Valor maximo long: " + Long.MAX_VALUE);

        float numFloat = 3.4028235E38F;
        System.out.println("numFloat = " + numFloat);
        System.out.println("Valor minimo float: " + Float.MIN_VALUE);
        System.out.println("Valor maximo float: " + Float.MAX_VALUE);

        double numDouble = 1.7976931348623157E308; // por defecto, los numeros con decimal son Double, no es necesario añadir la letra
        System.out.println("numDouble = " + numDouble);
        System.out.println("Valor minimo double: " + Double.MIN_VALUE);
        System.out.println("Valor maximo double: " + Double.MAX_VALUE);
    }

    public static void basics() {
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
