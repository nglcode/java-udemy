package cpjlaboratoriofinal;

import com.nglcode.negocio.CatalogoPeliculasImpl;
import java.util.Scanner;
import com.nglcode.negocio.ICatalogoPeliculas;

public class CPJLaboratorioFinal {

    public static void main(String[] args) {

        Scanner scanner;
        int opcion = -1;
        boolean salir = false;
        String nombrePelicula;
        ICatalogoPeliculas catalogoPeliculas = new CatalogoPeliculasImpl();
        

        while (opcion != 0) {

            System.out.println("-----------------------------");
            System.out.println("Elige opcion: ");
            System.out.println("1. Iniciar catalogo peliculas.");
            System.out.println("2. Agregar pelicula.");
            System.out.println("3. Listar pelicula.");
            System.out.println("4. Buscar pelicula.");
            System.out.println("0. Salir.");
            System.out.println("-----------------------------");

            scanner = new Scanner(System.in);
            opcion = Integer.parseInt(scanner.nextLine());
            
            switch (opcion) {
                case 1:
                    catalogoPeliculas.iniciarCatalogo();
                    break;
                case 2:
                    System.out.println("Ingresa el nombre de la pelicula a agregar: ");
                    nombrePelicula = scanner.nextLine();
                    catalogoPeliculas.agregarPelicula(nombrePelicula);
                    break;
                case 3:
                    catalogoPeliculas.listarPeliculas();
                    break;
                case 4:
                    System.out.println("Ingresa la pelicula a buscar: ");
                    nombrePelicula = scanner.nextLine();
                    catalogoPeliculas.buscarPelicula(nombrePelicula);
                    break;
                case 0:
                    System.out.println("Salir");
                    salir = true;
                    break;
                default:
                    System.out.println("Opcion no valida.");
                    break;
            }
        } 

    }

}
