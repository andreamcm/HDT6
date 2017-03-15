//Importes
import java.util.LinkedHashSet;
import java.util.Set;

/**
 * @author josePablo y Andrea Cordón
 * @version 1.0
 * @since 12-03-2017
 * Implementación linkedhashSet de la interfaz Set
 */

public class linkedhashSet implements Iset<Desarrollador>{
	
	/**
	 * Atributos de la clase linkedhashSet
	 */
	private LinkedHashSet<Desarrollador> desarrolladoresLink; 
	
	/**
	 * Constructor de la clase linkedhashSet
	 */
	public linkedhashSet(){
		desarrolladoresLink = new LinkedHashSet<Desarrollador>();
	}

	
	public Set<Desarrollador> getDesarroladores(){
		return desarrolladoresLink;
	}


	@Override
	public boolean Agregar(Desarrollador desa) {
		if((desarrolladoresLink).add(desa)==true)
			return true;
		else
			return false;
	}

	@Override
	public boolean contiene(Desarrollador desarrollador) {
		if(( desarrolladoresLink).contains(desarrollador)==true)
			return true;
		else
			return false;
	}


	@Override
	public boolean contieneTodos( Set<Desarrollador> valores) {
		if (( desarrolladoresLink).containsAll(valores)==true)
			return true;
		else
			return false;
	}

	
	@Override
	public boolean quitar(Object o) {
		if (( desarrolladoresLink).remove(o)==true)
			return true;
		else
			return false;
	}
	
}