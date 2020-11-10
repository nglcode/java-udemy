
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


    }
    

    public static void calificaciones() {

        var consola = new Scanner(System.in);
        float calificacionFloat;
        String calificacionStr;

        System.out.println("Proporciona una calificación (entre 0 y 10):");
        calificacionFloat = Float.parseFloat(consola.nextLine());

        if (calificacionFloat <= 10 && calificacionFloat >= 9) {
            calificacionStr = "A";
        } else if (calificacionFloat >= 8 && calificacionFloat < 9) {
            calificacionStr = "B";
        } else if (calificacionFloat >= 7 && calificacionFloat < 8) {
            calificacionStr = "C";
        } else if (calificacionFloat >= 6 && calificacionFloat < 7) {
            calificacionStr = "D";
        } else if (calificacionFloat > 0 && calificacionFloat < 6) {
            calificacionStr = "F";
        } else {
            calificacionStr = "Valor desconocido";
        }

        System.out.println("Calificacion: " + calificacionStr);

    }

    public static void mayorNum() {

        int num1, num2;

        var consola = new Scanner(System.in);
        System.out.println("Proporciona el n1: ");
        num1 = Integer.parseInt(consola.nextLine());
        System.out.println("Proporciona el n2: ");
        num2 = Integer.parseInt(consola.nextLine());
        int mayor = (num1 > num2) ? num1 : num2;
        System.out.println("El numero mayor es: " + mayor);

    }

    public static void ternario() {

        var resultado = (1 > 2) ? "verdadero" : "falso";
        System.out.println("resultado = " + resultado);

        var numero = 8;
        resultado = (numero % 2 == 0) ? "par" : "impar";
        System.out.println("resultado = " + resultado);

    }

    public static void asignacion() {

        var a = 3;
        var b = -a;
        System.out.println("a = " + a);
        System.out.println("b = " + b);

        var c = true;
        var d = !c;
        System.out.println("c = " + c);
        System.out.println("d = " + d);

        var e = 3;
        var f = ++e;
        System.out.println("e = " + e);
        System.out.println("f = " + f);

        var g = 3;
        System.out.println("g = " + g);
        var h = g++;
        System.out.println("g = " + g);
        System.out.println("h = " + h);

        var i = 2;
        var j = --i;
        System.out.println("i = " + i);
        System.out.println("j = " + j);

        var k = 2;
        var l = k--;
        System.out.println("k = " + k);
        System.out.println("l = " + l);

    }

    public static void rectangulo() {

        int alto, ancho;

        var consola = new Scanner(System.in);
        System.out.println("Proporciona el alto: ");
        alto = Integer.parseInt(consola.nextLine());
        System.out.println("Proporciona el ancho: ");
        ancho = Integer.parseInt(consola.nextLine());
        System.out.println("Area: " + (alto * ancho));
        System.out.println("Perimetro: " + ((alto + ancho) * 2));

    }

    public static void tiendaLibros() {

        var consola = new Scanner(System.in);
        System.out.println("Proporciona el nombre: ");
        var nombre = consola.nextLine();
        System.out.println("Proporciona el id: ");
        var id = Integer.parseInt(consola.nextLine());
        System.out.println("Proporciona el precio: ");
        var precio = Double.parseDouble(consola.nextLine());
        System.out.println("Proporciona el envio gratuito: ");
        var envioGratuito = Boolean.parseBoolean(consola.nextLine());
        System.out.println("-------------------------------");
        System.out.println("Nombre: " + nombre);
        System.out.println("ID: " + id);
        System.out.println("Precio: " + precio);
        System.out.println("Envio gratuito: " + envioGratuito);
        System.out.println("-------------------------------");

    }

    public static void conversionTipos() {

        var edad = Integer.parseInt("20");
        System.out.println("edad = " + (edad + 1));

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
