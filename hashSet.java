//Importamos Set de las clases de java y HashSet una implementación.
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
	
	Set<Desarrollador> desarrolladores;
	Set valores;
	
	/**
	 * Constructor de la clase hashSet
	 */
	public hashSet(){
		desarrolladores = new HashSet<Desarrollador>();
	}
	
	public void setValores (Set val){
		this.valores = val;
	}


	@Override
	public boolean Agregar(Desarrollador desa) {
		if(desarrolladores.add(desa)==true)
			return true;
		else
			return false;
	}

	@Override
	public boolean contiene(Desarrollador desarrolador) {
		if(desarrolladores.contains(desarrolador)==true)
			return true;
		else
			return false;
	}

	@Override
	public boolean contieneTodos(Set valores) {
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
