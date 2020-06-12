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

public class Estudiante{
	Curso curso;
	private String nombre;
	private String apellidos;
	private String nif;

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
	 * @return the nombre
	 */
	protected String getNombre() {
		return nombre;
	}

	/**
	 * @param nombre the nombre to set
	 */
	protected void setNombre(String nombre) {
		this.nombre = nombre;
	}

	/**
	 * @return the apellidos
	 */
	protected String getApellidos() {
		return apellidos;
	}

	/**
	 * @param apellidos the apellidos to set
	 */
	protected void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	/**
	 * @return the nif
	 */
	protected String getNif() {
		return nif;
	}

	/**
	 * @param nif the nif to set
	 */
	protected void setNif(String nif) {
		this.nif = nif;
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
