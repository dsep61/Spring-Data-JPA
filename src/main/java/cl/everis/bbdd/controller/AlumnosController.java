package cl.everis.bbdd.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import cl.everis.bbdd.entity.Alumnos;
import cl.everis.bbdd.service.AlumnosService;

@RestController
@RequestMapping("/alumnos")
public class AlumnosController {

	@Autowired
	AlumnosService servicio;

	// TAREA: Metodos crear, modificar, eliminar y 3 buscar
	@PostMapping(value = "/crear", produces = "application/json")
	public ResponseEntity<Alumnos> crear(@RequestBody Alumnos alumno) {

		try {
			return new ResponseEntity<Alumnos>(servicio.saveOrUpdate(alumno), HttpStatus.OK);

		} catch (Exception e) {
			return ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
		}

	}

	@PutMapping(value = "/modificar", produces = "application/json")
	public ResponseEntity<Alumnos> modificar(@RequestBody Alumnos alumno) {

		try {
			return new ResponseEntity<Alumnos>(servicio.saveOrUpdate(alumno), HttpStatus.OK);

		} catch (Exception e) {
			return ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
		}

	}

	@DeleteMapping(value = "/eliminar/{idAlumno}", produces = "application/json")
	public ResponseEntity<Boolean> eliminar(@PathVariable Long idAlumno) {

		try {
			return new ResponseEntity<Boolean>(servicio.delete(idAlumno), HttpStatus.OK);

		} catch (Exception e) {
			return ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
		}
	}

	@GetMapping(value = "/buscarPorNombre/{nombre}", produces = "application/json")
	public ResponseEntity<List<Alumnos>> crear(@PathVariable String nombre) {

		try {
			return new ResponseEntity<List<Alumnos>>(servicio.findByNombre(nombre), HttpStatus.OK);

		} catch (Exception e) {
			return ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
		}

	}

	/*
	 * @GetMapping(value = "/buscarPorNombre2", produces = "application/json")
	 * public ResponseEntity<List<Alumnos>> searchByNombre(@RequestBody String
	 * nombre, @RequestBody String apellidoMaterno) {
	 * 
	 * try { return new
	 * ResponseEntity<List<Alumnos>>(servicio.searchByNombre(nombre,
	 * apellidoMaterno), HttpStatus.OK);
	 * 
	 * } catch (Exception e) { return
	 * ResponseEntity.status(HttpStatus.BAD_REQUEST).build(); }
	 * 
	 * }
	 */

	/*
	 * @GetMapping(value = "/buscarEntreFechas", produces = "application/json")
	 * public ResponseEntity<Alumno> crear(@RequestBody Alumno alumno) {
	 * 
	 * try { return new ResponseEntity<Alumno>(servicio.saveOrUpdate(alumno),
	 * HttpStatus.OK);
	 * 
	 * } catch (Exception e) { return
	 * ResponseEntity.status(HttpStatus.BAD_REQUEST).build(); }
	 * 
	 * }
	 */

}
