package com.nglcode.test.cascade;

import com.nglcode.domain.Alumno;
import com.nglcode.domain.Contacto;
import com.nglcode.domain.Domicilio;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class PersistenciaCascadaTest {

    public static void main(String[] args) {
        //abrimos la conexion a la BBDD
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("HibernateJpaPU");
        EntityManager em = emf.createEntityManager();
        
        //si no tenemos habilitada la persistencia en cascada, tendriamos que guardar primero el domicilio y el contacto
        //para que se generen los respectivos ID y los pueda utilizar posteriormente el registro nuevo de alumno
        Domicilio domicilio = new Domicilio();
        domicilio.setCalle("Nogales");
        domicilio.setNoCalle("10");
        domicilio.setPais("Mexico");
        
        Contacto contacto = new Contacto();
        contacto.setEmail("clara@mail.com");
        contacto.setTelefono("554874698");
                
        Alumno alumno = new Alumno();
        alumno.setNombre("Carlos");
        alumno.setApellido("Lara");
        alumno.setContacto(contacto);
        alumno.setDomicilio(domicilio);
        
        em.getTransaction().begin();
        em.persist(alumno);
        em.getTransaction().commit();
        
        System.out.println("Alumno: " + alumno);

    }

}
