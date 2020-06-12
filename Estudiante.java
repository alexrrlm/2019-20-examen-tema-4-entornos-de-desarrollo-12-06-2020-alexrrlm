package refactorizacion;
/**
 * @author Jaime Rabasco Ronda
 */
/*Refactorizacion
Extrae una superclase con los campos
	nombre
	apellidos
	nif
y los metodos
	getNombre(), setNombre()
	getApellidos(), setApellidos()
	getNif(), setNif()*/
	

enum Curso {
	PRIMARIA, ESO, BACHILLERATO, UNIVERSIDAD
};

public class Estudiante extends Persona{
	Curso curso;
	/**
	 * @param nombre
	 * @param apellidos
	 * @param nif
	 * @param curso
	 */
	protected Estudiante(String nombre, String apellidos, String nif,
			Curso curso) {
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.nif = nif;
		this.curso = curso;
	}

	/**
	 * @return the curso
	 */
	protected Curso getCurso() {
		return curso;
	}

	/**
	 * @param curso the curso to set
	 */
	protected void setCurso(Curso curso) {
		this.curso = curso;
	}

	
}
