package com.nglcode.test.ciclovida;

import com.nglcode.domain.Contacto;
import javax.persistence.*;

public class Estado2RecuperarObjetoPersistente {
    
    
    public static void main(String[] args) {
        //abrimos la conexion a la BBDD
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("HibernateJpaPU");
        EntityManager em = emf.createEntityManager();
        
        //definimos la variable
        Contacto contacto = null;
        
        //recuperar un objeto de la BD
        //en este caso no es necesario iniciar una transaccion, solo sera necesario si vamos a modificarlo
        contacto = em.find(Contacto.class, 3);  //3 es el valor de la primaryKey
        
        //detached
        System.out.println("Contacto: " + contacto);
    }
}
