import java.util.ArrayList;


/**
 * @author josePablo y Andrea Cordon
 * @version 1.0
 * @since 12-03-2017
 * Clase que define a un desarrolador
 */
public class Desarrollador {
	/**
	 * Atributos de la clase desarrollador
	 */

	private String nombre;
	private ArrayList<String> plataforma;

	public Desarrollador(String nombre, ArrayList<String> plataforma){
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
	public ArrayList<String> getPlataforma() {
		return plataforma;
	}

	/**
	 * @param plataforma
	 */
	public void setPlataforma(ArrayList<String> plataforma) {
		this.plataforma = plataforma;
	}



}
