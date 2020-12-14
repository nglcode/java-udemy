
package test;

import com.nglcode.sga.domain.Persona;
import javax.persistence.*;
import org.apache.logging.log4j.*;


public class ClienteEntidadPersona {
    
    static Logger log = LogManager.getRootLogger();
    
    public static void main(String[] args) {
        
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("PersonaPU");
        EntityManager em = emf.createEntityManager();
        EntityTransaction tx = em.getTransaction();
        
        //Inicia la transaccion
        tx.begin();
        //No se debe especificar el ID de la BBDD
        Persona p1 = new Persona("Maria", "Gutierrez", "mgutierrez@outlook.com", "333222444");
        log.debug("Objeto a persistir: " + p1.toString());
        //Persistimos el objeto en BBDD
        em.persist(p1);
        //Terminamos la transaccion
        tx.commit();
        log.debug("Objeto persistido: "  + p1);
        em.close();
        
    }
    
}
