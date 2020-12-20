
package com.nglcode.sga.cliente.cascade;

import com.nglcode.sga.domain.Persona;
import com.nglcode.sga.domain.Usuario;
import javax.persistence.*;
import org.apache.logging.log4j.*;



public class PersistenciaCascadaJPA {
    
    static Logger log = LogManager.getRootLogger();
    
    public static void main(String[] args) {
        
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("SgaPU");
        EntityManager em = emf.createEntityManager();
        EntityTransaction tx = em.getTransaction();
        tx.begin();
        
        //1. Crear nuevos objetos (transitivo)
        Persona p1 = new Persona("Hugo", "Hernandez", "hhernandez@mail.com", "321123654");
        
        Usuario u1 = new Usuario("hhernandez", "7766", p1);
        
        //2. Persistimos el objeto usuario unicamente (ya que esta en cascada, y automaticamente persistira tambien el de persona)
        em.persist(u1);
        
        //3. Commit de la transaccion
        tx.commit();
        
        //objetos en estado detached
        log.debug("Objeto Persona:" + p1);
        log.debug("Objeto Usuario:" + u1);
        
        em.close();
    }
    
}
