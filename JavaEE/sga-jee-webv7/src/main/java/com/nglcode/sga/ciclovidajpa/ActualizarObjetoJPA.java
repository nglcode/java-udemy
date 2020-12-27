package com.nglcode.sga.ciclovidajpa;

import com.nglcode.sga.domain.Persona;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class ActualizarObjetoJPA {

    static Logger log = LogManager.getRootLogger();

    public static void main(String[] args) {

        EntityManagerFactory emf = Persistence.createEntityManagerFactory("SgaPU");
        EntityManager em = emf.createEntityManager();

        //1. Inicia la transaccion 1
        EntityTransaction tx = em.getTransaction();
        tx.begin();

        //2. Ejecutar SQL
        Persona persona1 = em.find(Persona.class, 1);

        //3. Termina la transaccion 1
        tx.commit();

        //Objeto en estado detached
        log.debug("Objeto recuperado - Detached: " + persona1);

        //4. Modificar el objeto
        persona1.setApellido("Juarez");

        //5. Inicia la transaccion 2
        EntityTransaction tx2 = em.getTransaction();
        tx2.begin();

        //6. Modificamos el objeto
        em.merge(persona1);

        //7. Termina la transaccion 2
        tx2.commit();

        //Objeto en estado detached (modificado)
        log.debug("Objeto recuperado - Detached (modificado): " + persona1);

        //5. Cerramos EM
        em.close();

    }

}
