
package test;

import domain.Persona;


public class TestMatrices {
    
    public static void main(String[] args) {
        
        
        int edades[][] = new int[3][2];
        
        
        edades[0][0] = 5;
        edades[0][1] = 6;
        edades[1][0] = 7;
        edades[1][1] = 8;
        edades[2][0] = 9;
        edades[2][1] = 10;
        
        for (int i = 0; i < edades.length; i++) {
            for (int j = 0; j < edades[i].length; j++) {
                System.out.println("Valor Nº" + i + "-" + j + ": " + edades[i][j]);
            }
        }
        
        String frutas[][] = {{"Naranja", "Limón"}, {"Fresa", "Zarzamora", "Mora"}};
        
//        for (int i = 0; i < frutas.length; i++) {
//            for (int j = 0; j < frutas[i].length; j++) {
//                System.out.println("Fruta Nº" + i + "-" + j + ": " + frutas[i][j]);
//            }
//        }
        
        Persona personas[][] = new Persona[2][3];
        personas[0][0] = new Persona("CeroCero");
        personas[0][1] = new Persona("CeroUno");
        personas[0][2] = new Persona("CeroDos");
        personas[1][0] = new Persona("UnoCero");
        personas[1][1] = new Persona("UnoUno");
        personas[1][2] = new Persona("UnoDos");
        
        imprimir(frutas);
        imprimir(personas);
        
                
    }
    
    public static void imprimir(Object matriz[][]) {
        
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.println("Elemento Nº" + i + "-" + j + ": " + matriz[i][j]);
            }
        }
                
    }
    
}
