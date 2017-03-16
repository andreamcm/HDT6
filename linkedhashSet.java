//Importes
import java.util.LinkedHashSet;
import java.util.Set;

/**
 * @author josePablo y Andrea Cord�n
 * @version 1.0
 * @since 12-03-2017
 * Implementaci�n linkedhashSet de la interfaz Set
 */

public class linkedhashSet<E> implements Iset<Desarrollador>{

	/**
	 * Atributos de la clase linkedhashSet
	 */
	Set<Desarrollador> desarrolladoresLink;

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
	public boolean quitar(Object o) {
		if (( desarrolladoresLink).remove(o)==true)
			return true;
		else
			return false;
	}


	@Override
	public boolean contieneTodos(Set valores) {
		// TODO Auto-generated method stub
		return false;
	}


	@Override
	public java.util.Iterator<String> Iterator() {
		// TODO Auto-generated method stub
		return null;
	}


}
