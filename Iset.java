import java.util.Set;
/**
 * Interfaz de los métodos a implementar 
 * @author josePablo
 * @author josePablo y Andrea Cordo
 * @version 1.0
 * @since 12-03-2017
 */
public interface Iset<E> {

	public boolean Agregar(E desa);
	//Agrega un elemento a la estructura
	
	public boolean contiene(E desarrollador);
	//Regresa true si la estructura contiene el elemento especificado
	
	public boolean contieneTodos(Set<Desarrollador> valores);
	//Regresa true si la estructura cintiene todos los elementos especificados en la colección
	
	public boolean quitar(Object o);
	//Quita una instacia del elemento especificado de la coleccion; 
}
