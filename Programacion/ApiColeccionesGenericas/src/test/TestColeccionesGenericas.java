
package test;

import java.util.*;


public class TestColeccionesGenericas {


    public static void main(String[] args) {
        
        List<String> miLista = new ArrayList<>();
        miLista.add("Lunes");
        miLista.add("Martes");
        miLista.add("Miercoles");
        miLista.add("Jueves");
        miLista.add("Viernes");
        miLista.add("Sabado");
        miLista.add("Domingo");
//        String e1 = miLista.get(0);
//        System.out.println("e1 = " + e1);
        
        imprimir(miLista);
        
        Set<String> miSet = new HashSet<>();
        miSet.add("Lunes");
        miSet.add("Martes");
        miSet.add("Miercoles");
        miSet.add("Jueves");
        miSet.add("Viernes");
        miSet.add("Sabado");
        miSet.add("Domingo");
        
        imprimir(miSet);
        
        Map<String, String> miMapa = new HashMap<>();
        miMapa.put("valor1", "Juan");
        miMapa.put("valor2", "Karla");
        miMapa.put("valor3", "Rosario");
        
        String elemento = miMapa.get("valor1");
        System.out.println("elemento = " + elemento);
        
        imprimir(miMapa.keySet());
        imprimir(miMapa.values());
        
    }
    
    public static void imprimir(Collection<String> coleccion) {
        
        System.out.println("------------------");
        System.out.println(coleccion.getClass().getSimpleName());
        coleccion.forEach(elemento -> {
            System.out.println("elemento = " + elemento);
        });
        System.out.println("------------------");
        
    }
    
}
