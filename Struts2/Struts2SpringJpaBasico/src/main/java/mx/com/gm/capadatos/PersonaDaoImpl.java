package mx.com.gm.capadatos;

import java.util.List;
import javax.persistence.CacheStoreMode;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import mx.com.gm.capadatos.domain.Persona;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.stereotype.Repository;

@Repository
public class PersonaDaoImpl implements PersonaDao {

    Logger log = LogManager.getRootLogger();

    @PersistenceContext
    private EntityManager em;

    @Override
    public void insertPersona(Persona persona) {
        // Insertamos nuevo objeto
        em.persist(persona);
    }

    @Override
    public void updatePersona(Persona persona) {
        // Actualizamos al objeto 
        em.merge(persona);
    }

    @Override
    public void deletePersona(Persona persona) {
         em.remove(em.merge(persona));
    }

    @Override
    public Persona findPersonaById(long idPersona) {
        return em.find(Persona.class, idPersona);
    }

    @Override
    public List<Persona> findAllPersonas() {
        String jpql = "SELECT p FROM Persona p";
        Query query = em.createQuery(jpql);
        //Forzar a ir directamente a la base de datos para refrescar datos
        query.setHint("javax.persistence.cache.storeMode", CacheStoreMode.REFRESH);
        List<Persona> personas = query.getResultList();
        System.out.println("personas:" + personas);
        return personas;
    }

    @Override
    public long contadorPersonas() {
        String consulta = "select count(p) from Persona p";
        Query q = em.createQuery(consulta);
        long contador = (long) q.getSingleResult();
        return contador;
    }

    @Override
    public Persona getPersonaByEmail(Persona persona) {
        String cadena = "%" + persona.getEmail() + "%"; //se usa en el like como caracteres especiales
        String consulta = "from Persona p where upper(p.email) like upper(:param1)";
        Query q = em.createQuery(consulta);
        q.setParameter("param1", cadena);
        return (Persona) q.getSingleResult();
    }
}
