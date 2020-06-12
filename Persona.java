package refactorizacion;

/**
 * Esta clase se utiliza para crear personas.
 * 
 * @author Alejandro Rodríguez Romero
 *
 */


public class Persona {

  protected String nombre;
  protected String apellidos;
  protected String nif;

  public Persona() {
    super();
  }

  /**
   * @return devuelve el nombre
   */
  protected String getNombre() {
  	return nombre;
  }

  /**
   * @param nombre pasado como parametro
   */
  protected void setNombre(String nombre) {
  	this.nombre = nombre;
  }

  /**
   * @return devuelve el apellidos
   */
  protected String getApellidos() {
  	return apellidos;
  }

  /**
   * @param apellidos pasado como parametro
   */
  protected void setApellidos(String apellidos) {
  	this.apellidos = apellidos;
  }

  /**
   * @return devuelve el nif
   */
  protected String getNif() {
  	return nif;
  }

  /**
   * @param nif pasado como parametro
   */
  protected void setNif(String nif) {
  	this.nif = nif;
  }

}
