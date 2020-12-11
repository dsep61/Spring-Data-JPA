package cl.everis.bbdd.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cl.everis.bbdd.entity.Alumnos;
import cl.everis.bbdd.repository.AlumnosRepository;

@Service
public class AlumnosService {
	
	@Autowired
    private AlumnosRepository alr;
	
	public Alumnos saveOrUpdate(Alumnos alumno){
       return alr.save(alumno);
    }
	
	public Boolean delete(Long idAlumno){
	    alr.deleteById(idAlumno);
	    return true;
	}
	
	public List<Alumnos> findByNombre(String nombre) {
		return alr.findByNombre(nombre);
	}
	
	/*
	 * public List<Alumnos> searchByNombre(String nombre, String apellidoMaterno) {
	 * return alr.findAlumnosByNombreAndApellidoMatero(nombre, apellidoMaterno); }
	 */
}
