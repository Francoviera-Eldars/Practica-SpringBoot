package Practica.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import Practica.domain.Persona;

@Repository
public interface PersonaDao extends CrudRepository<Persona, Long>{

}
