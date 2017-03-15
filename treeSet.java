//Importes
import java.util.Set;
import java.util.TreeSet;
/**
 * @author josePablo y Andrea Cordón
 * @version 1.0
 * @since 12-03-2017
 * Implementación linkedhashSet de la interfaz Set
 */

public class treeSet implements Iset<Desarrollador>{
	
	/**
	 * Atributos de la clase treeSet
	 */
	private TreeSet<Desarrollador> desarrolladoresTree;
	
	/**
	 * Constructor de la calse treeSet
	 */
	public treeSet(){
		desarrolladoresTree = new TreeSet<Desarrollador>();
	}
	
	public Set<Desarrollador> getDesarroladoresTree(){
		return desarrolladoresTree;
	}
	
	
	@Override
	public boolean Agregar(Desarrollador desa) {
		if((desarrolladoresTree).add(desa)==true)
			return true;
		else
			return false;
	}

	@Override
	public boolean contiene(Desarrollador desarrollador) {
		if(( desarrolladoresTree).contains(desarrollador)==true)
			return true;
		else
			return false;
	}


	@Override
	public boolean contieneTodos( Set<Desarrollador> valores) {
		if (( desarrolladoresTree).containsAll(valores)==true)
			return true;
		else
			return false;
	}

	
	@Override
	public boolean quitar(Object o) {
		if (( desarrolladoresTree).remove(o)==true)
			return true;
		else
			return false;
	}
	
}