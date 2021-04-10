package test;

import com.nglcode.domain.Persona;
import java.util.List;
import javax.persistence.*;

public class HolaMundoHibernate {
    
    public static void main(String[] args) {
        String hql = "SELECT p FROM Persona p";
        EntityManagerFactory fabrica = Persistence.createEntityManagerFactory("HibernateEjemplo1");
        EntityManager entityManager = fabrica.createEntityManager();
        
        Query query = entityManager.createQuery(hql);
        List<Persona> personas = query.getResultList();
        for(Persona p: personas) {
            System.out.println(p);
        }
        
        
    }
    
}
