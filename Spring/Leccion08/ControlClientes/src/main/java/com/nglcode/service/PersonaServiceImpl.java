package com.nglcode.service;

import com.nglcode.dao.IPersonaDao;
import com.nglcode.domain.Persona;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class PersonaServiceImpl implements IPersonaService {
    
    @Autowired
    private IPersonaDao personaDao;

    /* en la capa dao, se maneja el concepto de transacciones
        - si todo va bien, se hara un commit
        - si algo falla, se hara un rollback
       en una clase de servicio se pueden estar realizando varias operaciones sobre distintas tablas de BD
       por lo tanto, los metodos hay que marcarlos como transaccionales
       dependiendo del tipo de metodo se hara una transaccion
    */
    
    
    @Override
    @Transactional(readOnly = true) //solo vamos a leer datos; posiblemente no sea necesario hacer commit ni rollback, por lo cual no se abre una transaccion
    public List<Persona> listarPersonas() {
        return (List<Persona>) personaDao.findAll();
    }

    @Override
    @Transactional //si va a alterar la BD; si se iniciara una transaccion
    public void guardar(Persona persona) {
        personaDao.save(persona);
    }

    @Override
    @Transactional
    public void eliminar(Persona persona) {
        personaDao.delete(persona);
    }

    @Override
    @Transactional(readOnly = true)
    public Persona encontrarPersona(Persona persona) {
        //en caso de que no encuentre a la persona, devolvera null
        return personaDao.findById(persona.getIdPersona()).orElse(null);
    }
    
}
