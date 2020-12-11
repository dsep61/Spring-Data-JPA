package cl.everis.bbdd.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Id;

@Entity
@Table(name="alumnos")
public class Alumnos {
	
	protected static final String ALUMNOS_SEQ = "alumnos_seq";
	
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = ALUMNOS_SEQ) 
    @SequenceGenerator(sequenceName = ALUMNOS_SEQ, allocationSize = 1, name = "ALUMNOS_SEQ")
    @Column(name="id")
	private Long id; 	
	
    @Column(name="rut")
	private String rut; 
	
    @Column(name="nombre")
	private String nombre; 
	
    @Column(name="apellidoMaterno")
	private String apellidoMaterno; 
    
    @Column(name="apellidoPaterno")
	private String apellidoPaterno; 
    
    @Column(name="fechaNacimiento")
  	private Date fechaNacimiento;
    
    @Column(name="edad")
  	private Long edad;
    
    @Column(name="curso")
   	private String curso; 
    
    @Column(name="fechaMatricula")
  	private Date fechaMatricula;
    
    @Column(name="fechaEgreso")
  	private Date fechaEgreso;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getRut() {
		return rut;
	}

	public void setRut(String rut) {
		this.rut = rut;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellidoMaterno() {
		return apellidoMaterno;
	}

	public void setApellidoMaterno(String apellidoMaterno) {
		this.apellidoMaterno = apellidoMaterno;
	}

	public String getApellidoPaterno() {
		return apellidoPaterno;
	}

	public void setApellidoPaterno(String apellidoPaterno) {
		this.apellidoPaterno = apellidoPaterno;
	}

	public Date getFechaNacimiento() {
		return fechaNacimiento;
	}

	public void setFechaNacimiento(Date fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}

	public Number getEdad() {
		return edad;
	}

	public void setEdad(Long edad) {
		this.edad = edad;
	}

	public String getCurso() {
		return curso;
	}

	public void setCurso(String curso) {
		this.curso = curso;
	}

	public Date getFechaMatricula() {
		return fechaMatricula;
	}

	public void setFechaMatricula(Date fechaMatricula) {
		this.fechaMatricula = fechaMatricula;
	}

	public Date getFechaEgreso() {
		return fechaEgreso;
	}

	public void setFechaEgreso(Date fechaEgreso) {
		this.fechaEgreso = fechaEgreso;
	}
    
    

}