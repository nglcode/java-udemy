package com.nglcode.dao;

import com.nglcode.domain.Domicilio;
import java.util.List;
import javax.persistence.Query;

public class DomicilioDAO extends GenericDAO {

    public List<Domicilio> listar() {

        String consulta = "SELECT d FROM Domicilio d";
        em = getEntityManager();
        Query query = em.createQuery(consulta);
        return query.getResultList();

    }

    public void insertar(Domicilio domicilio) {

        try {
            em = getEntityManager();
            em.getTransaction().begin();
            em.persist(domicilio);
            em.getTransaction().commit();
        } catch (Exception e) {
            e.printStackTrace(System.out);
        } 
//        finally {
//            if (em != null) {
//                em.close();
//            }
//        }

    }

    public void actualizar(Domicilio domicilio) {

        try {
            em = getEntityManager();
            em.getTransaction().begin();
            em.merge(domicilio);
            em.getTransaction().commit();
        } catch (Exception e) {
            e.printStackTrace(System.out);
        } 
        
//        finally {
//            if (em != null) {
//                em.close();
//            }
//        }

    }

    public void eliminar(Domicilio domicilio) {

        try {
            em = getEntityManager();
            em.getTransaction().begin();
            em.remove(em.merge(domicilio));
            em.getTransaction().commit();
        } catch (Exception e) {
            e.printStackTrace(System.out);
        }
//        finally {
//            if (em != null) {
//                em.close();
//            }
//        }

    }
    
    public Domicilio buscarPorId(Domicilio domicilio) {
        em = getEntityManager();
        return em.find(Domicilio.class, domicilio.getIdDomicilio());
    }

}
