/**
 * @author josePablo y Andrea Cordon
 * @version 1.0
 * @since 12-03-2017
 * Clase que define a un desarrolador
 */
public class Desarrollador<E> {
	/**
	 * Atributos de la clase desarrollador
	 */

	private String nombre;
	private String plataforma;

	public Desarrollador(String nombre, String plataforma){
		this.nombre = nombre;
		this.plataforma = plataforma;

	}

	/**
	 * @return the nombre
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * @param nombre
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	/**
	 * @return plataforma
	 */
	public String getPlataforma() {
		return plataforma;
	}

	/**
	 * @param plataforma
	 */
	public void setPlataforma(String plataforma) {
		this.plataforma = plataforma;
	}



}
