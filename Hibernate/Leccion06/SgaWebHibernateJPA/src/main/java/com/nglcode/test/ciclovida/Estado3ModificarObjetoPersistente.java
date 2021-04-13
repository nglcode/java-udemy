package com.nglcode.test.ciclovida;

import com.nglcode.domain.Contacto;
import javax.persistence.*;

public class Estado3ModificarObjetoPersistente {
    
    
    public static void main(String[] args) {
        //abrimos la conexion a la BBDD
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("HibernateJpaPU");
        EntityManager em = emf.createEntityManager();
        
        //definimos la variable
        Contacto contacto = null;
        
        //recuperar un objeto de la BD
        //el objeto estara en estado Detached
        contacto = em.find(Contacto.class, 3);  //3 es el valor de la primaryKey
        
        //modificamos el objeto
        contacto.setEmail("clara@mail.com");
        
        //para pasarlo a estado Persistent
        em.getTransaction().begin();
//        em.persist(contacto);
        em.merge(contacto);
        em.getTransaction().commit();
        
        //una vez terminada la transaccion, vuelve a detached ya con las modificaciones
        System.out.println("Contacto: " + contacto);
    }
}
