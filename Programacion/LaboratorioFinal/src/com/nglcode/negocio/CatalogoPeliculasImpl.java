package com.nglcode.negocio;

import com.nglcode.datos.AccesoDatosImpl;
import com.nglcode.datos.IAccesoDatos;
import com.nglcode.domain.Pelicula;
import com.nglcode.excepciones.AccesoDatosEx;
import com.nglcode.excepciones.LecturaDatosEx;
import java.util.List;

public class CatalogoPeliculasImpl implements ICatalogoPeliculas {

    private final IAccesoDatos datos;

    public CatalogoPeliculasImpl() {
        this.datos = new AccesoDatosImpl();
    }

    @Override
    public void agregarPelicula(String nombrePelicula) {

        Pelicula pelicula = new Pelicula(nombrePelicula);
        boolean anexar = false;
        try {
            anexar = datos.existe(NOMBRE_RECURSO);
            datos.escribir(pelicula, NOMBRE_RECURSO, anexar);
        } catch (AccesoDatosEx ex) {
            System.out.println("Error de acceso a datos.");
            ex.printStackTrace(System.out);
        }

    }

    @Override
    public void listarPeliculas() {

        try {
            List<Pelicula> peliculas = this.datos.listar(NOMBRE_RECURSO);

            System.out.println("Películas: ");
            for (Pelicula pelicula : peliculas) {
                System.out.println(pelicula.toString());
            }
        } catch (AccesoDatosEx ex) {
            System.out.println("Error de acceso a datos.");
            ex.printStackTrace(System.out);
        }
    }

    @Override
    public void buscarPelicula(String buscar) {

        String resultado = "";

        try {
            resultado = this.datos.buscar(NOMBRE_RECURSO, buscar);
        } catch (LecturaDatosEx ex) {
            System.out.println("Error de lectura de datos.");
            ex.printStackTrace(System.out);
        }
        System.out.println("Resultado: " + resultado);
    }

    @Override
    public void iniciarCatalogo() {

        try {
            if (this.datos.existe(NOMBRE_RECURSO)) {
                datos.borrar(NOMBRE_RECURSO);
                datos.crear(NOMBRE_RECURSO);
            } else {
                datos.crear(NOMBRE_RECURSO);
            }
        } catch (AccesoDatosEx ex) {
            System.out.println("Error al iniciar catalogo de peliculas.");
            ex.printStackTrace(System.out);
        }

    }

}
