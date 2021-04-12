package com.nglcode.test.ciclovida;

import com.nglcode.domain.Contacto;
import javax.persistence.*;

public class Estado1Persistido {
    
    
    public static void main(String[] args) {
        //abrimos la conexion a la BBDD
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("HibernateJpaPU");
        EntityManager em = emf.createEntityManager();
        
        //1. estado transitivo
        Contacto contacto = new Contacto();
        contacto.setEmail("clara");
        contacto.setTelefono("11223344");
        
        //2. persistimos el objeto
        em.getTransaction().begin();
        em.persist(contacto);
//        em.flush();   // este metodo sincroniza los datos con la BD sin cerrar la transaccion
        em.getTransaction().commit();
        
        //3. detached (separado de la BD)
        System.out.println("Contacto: " + contacto);
    }
}
