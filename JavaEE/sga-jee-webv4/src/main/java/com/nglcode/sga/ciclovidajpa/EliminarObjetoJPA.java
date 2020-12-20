
package com.nglcode.sga.ciclovidajpa;

import com.nglcode.sga.domain.Persona;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;


public class EliminarObjetoJPA {
    
    static Logger log = LogManager.getRootLogger();

    public static void main(String[] args) {

        EntityManagerFactory emf = Persistence.createEntityManagerFactory("SgaPU");
        EntityManager em = emf.createEntityManager();

        //1. Inicia la transaccion 1
        EntityTransaction tx = em.getTransaction();
        tx.begin();

        //2. Ejecutar SQL
        Persona persona1 = em.find(Persona.class, 4);
        
        //3. Termina la transaccion 1
        tx.commit();
        log.debug("Objeto encontrado: " + persona1);
        
        //4. Inicia transaccion 2
        EntityTransaction tx2 = em.getTransaction();
        tx2.begin();
        
        //5. Ejecuta el delete
        em.remove(em.merge(persona1));

        //4. Termina la transaccion 1
        tx2.commit();

        //Objeto en estado detached
        log.debug("Objeto eliminado:" + persona1);
        
        //5. Cerramos EM
        em.close();

    }
}
