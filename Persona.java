package refactorizacion;



public class Persona {

  protected String nombre;
  protected String apellidos;
  protected String nif;

  public Persona() {
    super();
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

}
