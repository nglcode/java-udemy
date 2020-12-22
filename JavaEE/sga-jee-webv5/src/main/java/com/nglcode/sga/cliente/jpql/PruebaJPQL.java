package com.nglcode.sga.cliente.jpql;

import com.nglcode.sga.domain.Persona;
import com.nglcode.sga.domain.Usuario;
import java.util.Iterator;
import java.util.List;
import javax.persistence.*;
import org.apache.logging.log4j.*;

public class PruebaJPQL {

    static Logger log = LogManager.getRootLogger();

    public static void main(String[] args) {

        String jpql = null;
        Query q = null;
        List<Persona> personas = null;
        Persona persona = null;
        Iterator iter = null;
        Object[] tupla = null;
        List<String> nombres = null;
        List<Usuario> usuarios = null;

        EntityManagerFactory emf = Persistence.createEntityManagerFactory("SgaPU");
        EntityManager em = emf.createEntityManager();

        //1. Consulta de todos los objetos de tipo Persona
        log.debug("\n1. Consulta de todas las personas");
        jpql = "select p from Persona p";
        personas = em.createQuery(jpql).getResultList();
//        mostrarPersonas( personas );

        //2. Consulta de la Persona con id
        log.debug("\n2. Consulta de la Persona con id");
        jpql = "select p from Persona p where p.idPersona = 1";
        persona = (Persona) em.createQuery(jpql).getSingleResult();
//        log.debug(persona);

        //3. Consulta de la Persona por nombre
        log.debug("\n3. Consulta de la Persona por nombre");
        jpql = "select p from Persona p where p.nombre = 'Karla'";
        personas = em.createQuery(jpql).getResultList();
//        mostrarPersonas( personas );

        //4. Consulta de datos individuales, se crea un arreglo (tupla) de tipo object de 3 columnas
        log.debug("\n4. Consulta de datos individuales");
        jpql = "select p.nombre as Nombre, p.apellido as Apellido, p.email as Email from Persona p";
        iter = em.createQuery(jpql).getResultList().iterator();

        while (iter.hasNext()) {
            tupla = (Object[]) iter.next();
            String nombre = (String) tupla[0];
            String apellido = (String) tupla[1];
            String email = (String) tupla[2];
//            log.debug("Nombre: " + nombre + ", Apellido: " + apellido + ", Email: " + email);
        }

        //5. Obtiene el objeto Persona y el id, se crea un arreglo de tipo Object con 2 columnas
        log.debug("\n5. Consulta de Persona y el id");
        jpql = "select p, p.idPersona from Persona p";
        iter = em.createQuery(jpql).getResultList().iterator();

        while (iter.hasNext()) {
            tupla = (Object[]) iter.next();
            persona = (Persona) tupla[0];
            int idPersona = (int) tupla[1];
//            log.debug("Persona: " + persona + ", ID: " + idPersona);
        }

        //6. Consulta de todas las personas
        log.debug("\n6. Consulta de todas las personas");
        jpql = "select new com.nglcode.sga.domain.Persona( p.idPersona ) from Persona p";
        personas = em.createQuery(jpql).getResultList();
//        mostrarPersonas(personas);

        //7. Regresa el valor min y max del idPersona
        log.debug("\n7. Regresa el valor min y max del idPersona");
        jpql = "select min(p.idPersona) as minID, max(p.idPersona) as maxID, count(p.idPersona) as Contador from Persona p";
        iter = em.createQuery(jpql).getResultList().iterator();

        while (iter.hasNext()) {
            tupla = (Object[]) iter.next();
            int minValue = (int) tupla[0];
            int maxValue = (int) tupla[1];
            Long counter = (Long) tupla[2];
//            log.debug("Min: " + minValue + ", Max: " + maxValue + ", Counter: " + counter);
        }

        //8. Cuenta los nombres de las personas que son distintos
        log.debug("\n8. Cuenta los nombres de las personas que son distintos");
        jpql = "select count(distinct p.nombre) from Persona p";
        Long contador = (Long) em.createQuery(jpql).getSingleResult();
//        log.debug("Personas con nombres distintos: " + contador);

        //9. Concatenar y pasar a mayusculas nombre y apellido
        log.debug("\n9. Concatenar y pasar a mayusculas nombre y apellido");
        jpql = "select CONCAT(p.nombre, ' ',p.apellido) as Nombre from Persona p";
        nombres = em.createQuery(jpql).getResultList();

        for (String nombre : nombres) {
//            log.debug("Nombre completo: "+nombre);
        }

        //10. Obtiene el objeto Persona con id igual al parametro proporcionado
        log.debug("\n10. Obtiene el objeto Persona con id igual al parametro proporcionado");
        int idPersona = 1;
        jpql = "select p from Persona p where p.idPersona = :id";
        q = em.createQuery(jpql);
        q.setParameter("id", idPersona);
        persona = (Persona) q.getSingleResult();
//        log.debug(persona);

        //11. Obtener personas que contengan una letra (A) en el nombre, ignore case
        log.debug("\n11. Obtener personas que contengan una letra (A) en el nombre, ignore case");
        jpql = "select p from Persona p where upper(p.nombre) like upper(:parametro)";
        String parametro = "k%";
        q = em.createQuery(jpql);
        q.setParameter("parametro", parametro);
        personas = q.getResultList();
//        mostrarPersonas(personas);

        //12. Uso de between
        log.debug("\n12. Uso de between");
        jpql = "select p from Persona p where p.idPersona between 2 and 4";
        personas = em.createQuery(jpql).getResultList();
//        mostrarPersonas(personas);

        //13. Uso del ordenamiento
        log.debug("\n13. Uso del ordenamiento");
        jpql = "select p from Persona p where p.idPersona > 1 order by p.nombre desc, p.apellido desc";
        personas = em.createQuery(jpql).getResultList();
//        mostrarPersonas(personas);

        //14. Uso de subqueries
        log.debug("\n14. Uso de subqueries");
        jpql = "select p from Persona p where p.idPersona in (select min(p1.idPersona) from Persona p1)";
        personas = em.createQuery(jpql).getResultList();
//        mostrarPersonas(personas);

        //15. Uso de join con lazy loading
        log.debug("\n15. Uso de join con lazy loading");
        jpql = "select u from Usuario u join u.persona p";
        usuarios = em.createQuery(jpql).getResultList();
//        mostrarUsuarios(usuarios);

        //16. Uso de left join con eager loading
        log.debug("\n16. Uso de left join con eager loading");
        jpql = "select u from Usuario u left join fetch u.persona";
        usuarios = em.createQuery(jpql).getResultList();
        mostrarUsuarios(usuarios);

    }

    private static void mostrarPersonas(List<Persona> personas) {

        for (Persona persona : personas) {

            log.debug(persona);

        }
    }

    private static void mostrarUsuarios(List<Usuario> usuarios) {

        for (Usuario usuario : usuarios) {

            log.debug(usuario);

        }
    }

}
