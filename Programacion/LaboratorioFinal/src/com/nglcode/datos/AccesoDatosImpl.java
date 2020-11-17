package com.nglcode.datos;

import com.nglcode.domain.Pelicula;
import com.nglcode.excepciones.*;
import java.io.*;
import java.util.*;

public class AccesoDatosImpl implements IAccesoDatos {

    @Override
    public boolean existe(String nombreRecurso) throws AccesoDatosEx {

        File fichero = new File(nombreRecurso);

        return fichero.exists();
    }

    @Override
    public List<Pelicula> listar(String nombreRecurso) throws LecturaDatosEx {

        File fichero = new File(nombreRecurso);
        List<Pelicula> listado = new ArrayList<>();

        try {
            BufferedReader entrada = new BufferedReader(new FileReader(nombreRecurso));
            String lectura;

            lectura = entrada.readLine();

            while (lectura != null) {
                listado.add(new Pelicula(lectura));
                lectura = entrada.readLine();
            }

            entrada.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
            throw new LecturaDatosEx("Excepcion al listar peliculas: " + e.getMessage());
        } catch (IOException ex) {
            ex.printStackTrace();
            throw new LecturaDatosEx("Excepcion al listar peliculas: " + ex.getMessage());
        }
        return listado;
    }

    @Override
    public void escribir(Pelicula pelicula, String nombreRecurso, boolean anexar) throws EscrituraDatosEx {

        File fichero = new File(nombreRecurso);

        try {
            PrintWriter salida = new PrintWriter(new FileWriter(fichero, anexar));
            salida.println(pelicula.toString());
            salida.close();
            System.out.println("Se ha escrito información en el fichero.");
        } catch (FileNotFoundException ex) {
            ex.printStackTrace(System.out);
            throw new EscrituraDatosEx("Excepcion al escribir en el fichero.");
        } catch (IOException ex) {
            ex.printStackTrace(System.out);
            throw new EscrituraDatosEx("Excepcion al escribir en el fichero.");
        }

    }

    @Override
    public String buscar(String nombreRecurso, String buscar) throws LecturaDatosEx {

        File fichero = new File(nombreRecurso);
        List<Pelicula> listado = listar(nombreRecurso);
        String resultado = null;

        if (buscar != null) {
            for (Pelicula pelicula : listado) {
                if (pelicula.toString().equalsIgnoreCase(buscar)) {
                    int linea = listado.indexOf(pelicula) + 1;
//                    System.out.println("Se ha encontrado la pelicula " + buscar + " en la linea " + linea);
                    resultado = "Pelicula: " + buscar + " - Línea: " + linea;
                    break;
                }
            }
        }

        return resultado;
    }

    @Override
    public void crear(String nombreRecurso) throws AccesoDatosEx {
        if (existe(nombreRecurso)) {
            System.out.println("El fichero ya existe.");
        } else {
            File fichero = new File(nombreRecurso);

            try {
                PrintWriter salida = new PrintWriter(new FileWriter(nombreRecurso));
                salida.close();
                System.out.println("Se ha creado el archivo " + nombreRecurso);
            } catch (FileNotFoundException e) {
                e.printStackTrace(System.out);
                throw new AccesoDatosEx("Excepcion al crear el fichero.");
            } catch (IOException ex) {
                ex.printStackTrace(System.out);
                throw new AccesoDatosEx("Excepcion al crear el fichero.");
            }

        }
    }

    @Override
    public void borrar(String nombreRecurso) throws AccesoDatosEx {
        try {
            if (!existe(nombreRecurso)) {
                System.out.println("El fichero que intentas borrar no existe.");
            } else {
                File fichero = new File(nombreRecurso);
                fichero.delete();
            }
        } catch (Exception e) {
            throw new AccesoDatosEx("Excepcion al borrar el fichero.");
        }

    }

}
