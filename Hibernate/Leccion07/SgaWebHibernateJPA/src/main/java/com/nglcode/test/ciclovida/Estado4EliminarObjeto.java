package com.nglcode.test.ciclovida;

import com.nglcode.domain.Contacto;
import javax.persistence.*;

public class Estado4EliminarObjeto {
    
    
    public static void main(String[] args) {
        //abrimos la conexion a la BBDD
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("HibernateJpaPU");
        EntityManager em = emf.createEntityManager();
        
        //definimos la variable
        Contacto contacto = null;
        
        //recuperar un objeto de la BD
        //el objeto estara en estado Detached
        contacto = em.find(Contacto.class, 3);  //3 es el valor de la primaryKey
        
        //abrimos la transaccion y eliminamos
        em.getTransaction().begin();
        em.remove(em.merge(contacto));
        em.getTransaction().commit();
        
        //una vez terminada la transaccion, como ya esta eliminado, pasa a estado Transitivo
        System.out.println("Contacto: " + contacto);
    }
}
