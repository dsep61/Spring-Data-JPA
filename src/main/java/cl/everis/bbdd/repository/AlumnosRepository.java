package cl.everis.bbdd.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import cl.everis.bbdd.entity.Alumnos;

public interface AlumnosRepository extends JpaRepository<Alumnos, Long>{
	
	List<Alumnos> findByNombre(String Nombre);
	
}
