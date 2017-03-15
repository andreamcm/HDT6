//Importes
import java.util.HashSet;
import java.util.Set;

/**
 * @author josePablo y Andrea Cordo
 * @version 1.0
 * @since 12-03-2017
 * Implementación hashSet de la interfaz Set
 */


public class hashSet implements Iset<Desarrollador> {
	/**
	 * Atributos de la clase hashSet
	 */
	
	private HashSet<Desarrollador> desarrolladores;
	
	/**
	 * Constructor de la clase hashSet
	 */
	public hashSet(){
		desarrolladores = new HashSet<Desarrollador>();
	}

	
	
	public Set<Desarrollador> getDesarroladores(){
		return desarrolladores;
	}


	@Override
	public boolean Agregar(Desarrollador desa) {
		if(desarrolladores.add(desa)==true)
			return true;
		else
			return false;
	}

	@Override
	public boolean contiene(Desarrollador desarrollador) {
		if(desarrolladores.contains(desarrollador)==true)
			return true;
		else
			return false;
	}

	@Override
	public boolean contieneTodos(Set<Desarrollador> valores) {
		if (desarrolladores.containsAll(valores)==true)
			return true;
		else
			return false;
	}

	@Override
	public boolean quitar(Object o) {
		if (desarrolladores.remove(o)==true)
			return true;
		else
			return false;
	}

}
