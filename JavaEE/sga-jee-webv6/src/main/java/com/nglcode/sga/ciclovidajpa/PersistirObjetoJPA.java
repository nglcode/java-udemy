
package com.nglcode.sga.ciclovidajpa;

import com.nglcode.sga.domain.Persona;
import javax.persistence.*;
import org.apache.logging.log4j.*;


public class PersistirObjetoJPA {
    
    static Logger log = LogManager.getRootLogger();
    
    public static void main(String[] args) {
        
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("SgaPU");
        EntityManager em = emf.createEntityManager();
        EntityTransaction tx = em.getTransaction();
        
        //Inicia la transaccion
        
        //1. Crear nuevo objeto -> (Transitivo)
        Persona persona1 = new Persona("Pedro", "Luna", "pluna@mail.com", "998785452");
        
        //2. Inicia la transaccion
        tx.begin();
        
        //3. Ejecutar SQL
        em.persist(persona1);
        
        log.debug("Objeto persistido - sin commit: " + persona1);
        
        //4. commit/rollback
        tx.commit();
        
        //Objeto en estado detached
        log.debug("Objeto persistido - Detached: " + persona1);
        
        //5. Cerramos EM
        em.close();
        
        
    }
    
}
