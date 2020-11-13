package test;

public class TestArgumentosVariables {

    public static void main(String[] args) {

        imprimirNumeros(3, 4, 5);
        imprimirNumeros(10, 20, 30, 40, 50);
        variosParametros("Hola", 8, 9, 10);

    }

    private static void variosParametros(String nombre, int... numeros) {
        
        System.out.println("nombre = " + nombre);
        imprimirNumeros(numeros);
        
    }

    private static void imprimirNumeros(int... numeros) {
        for (int i = 0; i < numeros.length; i++) {
            System.out.println("Elemento: " + numeros[i]);
        }
    }

}
