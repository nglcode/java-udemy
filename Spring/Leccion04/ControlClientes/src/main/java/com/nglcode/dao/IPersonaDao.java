package com.nglcode.dao;

import com.nglcode.domain.Persona;
import org.springframework.data.repository.CrudRepository;

//extendemos de crudrepository, indicando la clase-entidad que trabajamos y el tipo de dato correspondiente a la primary key
public interface IPersonaDao extends CrudRepository<Persona, Long>{
    
    //anteriormente creabamos una clase de IMPLementacion para las operaciones crud
    //con spring ya no sera necesario, las crea por default
    //igual podemos añadir otras operaciones no contempladas en ese repository
    
    
    
    
    
    
    
}
