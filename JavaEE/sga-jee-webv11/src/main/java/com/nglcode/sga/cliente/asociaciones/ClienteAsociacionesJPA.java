package com.nglcode.sga.cliente.asociaciones;

import com.nglcode.sga.domain.Persona;
import com.nglcode.sga.domain.Usuario;
import java.util.List;
import javax.persistence.*;
import org.apache.logging.log4j.*;

public class ClienteAsociacionesJPA {

    static Logger log = LogManager.getRootLogger();

    public static void main(String[] args) {

        EntityManagerFactory emf = Persistence.createEntityManagerFactory("SgaPU");
        EntityManager em = emf.createEntityManager();
        
        List<Persona> personas = em.createNamedQuery("Persona.findAll").getResultList();
        
        em.close();
        
        for (Persona persona : personas) {
            log.debug("Persona: " + persona);
            //recuperamos los usuarios de cada persona
            for (Usuario usuario : persona.getUsuarioList()) {
                log.debug("Usuario: " + usuario);
                //Lazy: 16.807 s (los usuarios se van cargando a medida que son necesarios, es decir, se hara un select de persona, luego uno de usuario, y asi sucesivamente.)
                //Eager: 8.149 s (todos los usuarios se cargan la primera vez al hacer el select de personas; consume mas recursos)
            }
        }
    }

}
